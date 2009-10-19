package gaej.example.contact.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("contacts")
public interface ContactService extends RemoteService {
    List<Contact> listContacts();
    void addContact(Contact contact);
    void removeContact(Contact contact);
    void updateContact(Contact contact);
}
