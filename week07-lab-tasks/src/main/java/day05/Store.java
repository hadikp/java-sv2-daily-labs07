package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product p) {
        LocalDate now = LocalDate.now();
        if (now.compareTo(p.getSaleDate()) > 0) {
            productList.add(p);
        } else {
            throw new IllegalArgumentException("Az eladás dátuma nem lehet a mai napnál későbbi!");
        }

    }

    public void writeFile(int month) {
        List<String> productListString = makeStringList();
        try {
            String monthFileName = Month.of(month).toString().toLowerCase();
            Files.write(Paths.get(monthFileName +".csv"), productListString);
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Cant write file!", ioe);
        }
    }

    public List<String> makeStringList() {
        List<String> productListString = new ArrayList<>();
        for (Product p: productList) {
            productListString.add(p.getName() + ";" +  p.getSaleDate() + ";" + String.valueOf(p.getPrice()));
        }
        return productListString;
    }

}
