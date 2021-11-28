package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store;
    Product almaWrongDate;

    @TempDir
    File temporaryFolder;

    @BeforeEach
    void init() {
        Product cipo = new Product("cipő", LocalDate.of(2021, 11, 21), 12300);
        Product kenyer = new Product("kenyér", LocalDate.of(2021, 10, 21), 300);
        Product alma = new Product("alma", LocalDate.of(2021, 10, 29), 400);

        store = new Store();
        store.addProduct(cipo);
        store.addProduct(kenyer);
        store.addProduct(alma);
    }

    @Test
    void testAddGoodProduct() {
        Product tej = new Product("Tej", LocalDate.of(2020, 11, 23), 200);
        store.addProduct(tej);
        assertEquals(4, store.makeStringList().size());
    }

    @Test
    void testAddWrongProduct() {
        Product almaWrongDate = new Product("alma rossz dátum", LocalDate.of(2021, 12, 29), 400);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> store.addProduct(almaWrongDate));
        assertEquals("Az eladás dátuma nem lehet a mai napnál későbbi!", exception.getMessage());
    }

    @Test
    void testWriteFile() {
       // store.writeFile(11);
    }


}