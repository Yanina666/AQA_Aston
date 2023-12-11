import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneList {
    private final Map<String, List<String>> phoneList = new HashMap<>();

    public void add(String name, String phoneNumber) {
        List<String> phones = phoneList.getOrDefault(name, new ArrayList<>());
        phones.add(phoneNumber);
        phoneList.put(name, phones);
    }

    public List<String> get(String lastName) {
        return phoneList.getOrDefault(lastName, new ArrayList<>());
    }
    public static void main(String[] args) {
        PhoneList phoneList = new PhoneList();
        phoneList.add("Коцур", "8-029-666-11-67");
        phoneList.add("Богданович", "8-029-684-11-32");
        phoneList.add("Жогло", "8-044-458-33-35");
        phoneList.add("Грудинская", "8-029-562-11-12");
        phoneList.add("Ковалев", "8-029-432-34-90");
        phoneList.add("Ладикова", "8-044-098-43-18");

        System.out.println("\nТелефонный справочник:");
        System.out.println("Номер Коцура: " + phoneList.get("Коцур"));
        System.out.println("Номер Богданович: " + phoneList.get("Богданович"));
        System.out.println("Номер Грудинской: " + phoneList.get("Грудинская"));
        System.out.println("Номер Ковалева: " + phoneList.get("Ковалев"));
        System.out.println("Номер Жогло: " + phoneList.get("Жогло"));
        System.out.println("Номер Ладиковой: " + phoneList.get("Ладикова"));
    }
}