import myThread.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneBookTest {
    PhoneBook phoneBook;
    @Test
    public void testAdd(){

        int addedCount = phoneBook.getInstance().add("Test", "999");
        assertTrue(addedCount > 0, "Неверное добавление в телефонную книжку!");
    }
}
