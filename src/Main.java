import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BasicContactManager contactManager = new BasicContactManager();
        contactManager.addContact("John Doe ");

        contactManager.addContact("Jane Doe ");

        contactManager.editContact("John Doe ", "John Smith ");

        contactManager.deleteContact("Jane Doe ");
        }
    }