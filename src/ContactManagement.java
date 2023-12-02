public interface ContactManagement {
    void addContact(String contact);

    void editContact(String oldContact, String newContact);
    void deleteContact(String contact);

    String addContact();

    String editContact();

    String deleteContact();
}
