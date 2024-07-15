package myThread;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private static PhoneBook phoneBook = null;
    private Map<String, String> addedInfo = new HashMap<>();
    private PhoneBook(){
    }

    public static PhoneBook getInstance() {

        if (phoneBook == null) {
            synchronized (PhoneBook.class) {
                if (phoneBook == null) {
                    phoneBook = new PhoneBook();
                }
            }
        }
        return phoneBook;
    }

    public int add(String name, String phone) {
        if (!addedInfo.containsKey(name)) {
            addedInfo.put(name, phone);
        }
        return addedInfo.size();
    }
}
