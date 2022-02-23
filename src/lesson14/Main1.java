package lesson14;

public class Main1 {
    public static void main(String[] args) {
        MultiMapImpl<String, String> telContacts = new MultiMapImpl<>();
        System.out.println(telContacts.countValues("Василий"));
        telContacts.put("Василий", "+79062410349");
        telContacts.put("Василий", "+79065003647");
        telContacts.put("Василий", "+79105002036");
        telContacts.put("Георгий", "+79062410349");
        telContacts.put("Георгий", "+79112368789");

        System.out.println(telContacts);

    }
}
