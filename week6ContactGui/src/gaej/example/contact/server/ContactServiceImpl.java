package gaej.example.contact.server;

import java.util.ArrayList;
import java.util.List;

import gaej.example.contact.client.Contact;
import gaej.example.contact.client.ContactService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ContactServiceImpl extends RemoteServiceServlet implements ContactService {
    private static final long serialVersionUID = 1L;
    private ContactDAO contactDAO = new ContactDAOJdo();

    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    public List<Contact> listContacts() {
        List<Contact> listContacts = contactDAO.listContacts();
        return new ArrayList<Contact> (listContacts);
    }

    public void removeContact(Contact contact) {
        contactDAO.removeContact(contact);
    
    }

    public void updateContact(Contact contact) {
        contactDAO.updateContact(contact);
    }
    

}
