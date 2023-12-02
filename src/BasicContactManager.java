import java.util.ArrayList;
import java.util.List;

public class BasicContactManager implements ContactManagement {
    private List<String> contacts = new ArrayList<>();

    @Override
    public void addContact(String contact) {
        contacts.add(contact);
        System.out.println("Контакт " + contact + "Успешно добавлен новый контакт. ");
    }

    @Override
    public void editContact(String oldContact, String newContact) {
        if (contacts.contains(oldContact)) {
            int index = contacts.indexOf(oldContact);
            contacts.set(index, newContact);
            System.out.println("Контакт " + oldContact + " Успешно измененно. Новый контакт: " + newContact);
        } else {
            System.out.println("Контакт " + oldContact + " Не найден.");
        }
    }

    @Override
    public void deleteContact(String contact) {
        if (contacts.contains(contact)) {
            contacts.remove(contact);
            System.out.println("Контакт " + contact + " Удаление успешно.");
        } else {
            System.out.println("Контакт " + contact + " Не найден.");
        }

    }

    @Override
    public String addContact() {
        return null;
    }

    @Override
    public String editContact() {
        return null;
    }

    @Override
    public String deleteContact() {
        return null;
    }
}
