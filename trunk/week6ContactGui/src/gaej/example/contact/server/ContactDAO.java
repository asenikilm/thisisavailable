package gaej.example.contact.server;

import java.util.List;

import gaej.example.contact.client.Contact;

public interface ContactDAO {
	void addContact(Contact contact);
	void removeContact(Contact contact);
	void updateContact(Contact contact);
	List<Contact> listContacts();
}
