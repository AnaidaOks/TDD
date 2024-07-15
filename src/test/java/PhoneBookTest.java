import myThread.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneBookTest {
    @Test
    public void testAdd(){
        PhoneBook phoneBook = new PhoneBook();
        int addedCount = phoneBook.add("Test", "999");
        assertTrue(1 == addedCount, "Неверное добавление в телефонную книжку!");
    }
}
