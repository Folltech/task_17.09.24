package third_task;
public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addContact("kishmish", "123-456-7890");
        addressBook.addContact("Bob", "324-234-8468");
        String kishmishPhone = addressBook.getPhone("kishmish");
        addressBook.removeContact("Bob");
        addressBook.removeContact("joper");
        addressBook.printAllContacts();
    }
}

