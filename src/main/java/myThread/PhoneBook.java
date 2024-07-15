package myThread;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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

    public String findByNumber(String number) {

        return addedInfo.entrySet().stream().filter(mp -> mp.getValue().equals(number)).map(Map.Entry::getKey).findFirst().orElse(null);
    }

    public String findByName(String name) {
        return addedInfo.get(name);
    }

    public void printAllNames() {
        Map<String, String> sortedNames = new TreeMap<>(addedInfo);
        System.out.println("All names: " + sortedNames.keySet());
    }
}
