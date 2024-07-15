import myThread.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneBookTest {
    PhoneBook phoneBook = PhoneBook.getInstance();
    @Test
    public void testAdd(){
        int addedCount = 0;
        addedCount = phoneBook.add("Ivan", "999");
        addedCount = phoneBook.add("Vasya", "8907");
        addedCount = phoneBook.add("Mariya", "8996");
        addedCount = phoneBook.add("Anna", "789");
        assertTrue(addedCount > 0, "Неверное добавление в телефонную книжку!");
    }

    @Test
    public void testFindByNumber(){
        testAdd();
        String foundName = phoneBook.findByNumber("999");
        assertTrue(foundName != null, "Не найдено имя по заданному номеру!");
    }

    @Test
    public void testFindByName(){
        testAdd();
        String foundNumber = phoneBook.findByName("Test3");
        assertTrue(foundNumber != null, "Не найден номер по заданному имени!");
    }

    @Test
    public void testPrintAllNames(){
        testAdd();
        phoneBook.printAllNames();
    }
}
