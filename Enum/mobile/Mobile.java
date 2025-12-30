import java.util.List;
import java.util.ArrayList;

public class Mobile {
    private List<Contact> contacts;

    public Mobile() {
        setContacts(new ArrayList<Contact>());
    }

    public int getContactPosition(String name) {
        for (Contact contact : this.contacts) {
            if (contact.getName().equals(name)) {
                return this.contacts.indexOf(contact);
            }
        }

        return -1;
    }

    public void addContact(Contact contact) throws Exception {
        if (getContactPosition(contact.getName()) != -1) {
            throw new Exception("Could not add contact. Contact with this name already exists");
        }

        this.contacts.add(contact);
    }

    public void updateContact(Contact oldContact, Contact newContact) throws Exception {

        int index = getContactPosition(oldContact.getName());

        if (index == -1) {
            throw new Exception("Could not modify contact. Contact does not exist");
        }

        if (
            getContactPosition(newContact.getName()) > -1
            && getContactPosition(newContact.getName()) != index
        ) {

            throw new Exception("Could not modify contact. Contact with this name already exists");
        }

        this.contacts.set(index, newContact);
    }

    public void removeContact(Contact contact) throws Exception {
        int index = getContactPosition(contact.getName());

        if (index == -1) {
            throw new Exception("Could not remove contact. Contact does not exist");
        }

        this.contacts.remove(index);
    }

    public void listContacts() {
        for (Contact contact : this.contacts) {
            System.out.printf(
                "%s -> %s (%s)\n",
                contact.getName(),
                contact.getPhoneNumber(),
                contact.getType()
            );
        }
    }

    public List<Contact> getContacts() {
        return this.contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}