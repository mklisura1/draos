package order.service;

import java.util.List;

import order.model.Contact;

public interface ContactService {
	public void addContact(Contact contact);
	public void updateContact(Contact contact);
	public Contact getContact(int contact_id);
	public void deleteContact(int contact_id);
	public List<Contact> getContacts();
}
