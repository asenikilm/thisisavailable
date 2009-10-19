package gaej.example.contact.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ContactServiceAsync  {
    void listContacts(AsyncCallback<List <Contact>> callback);
    void addContact(Contact contact, AsyncCallback<Void> callback);
    void removeContact(Contact contact, AsyncCallback<Void> callback);
    void updateContact(Contact contact, AsyncCallback<Void> callback);
}

