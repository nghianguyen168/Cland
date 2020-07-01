package edu.vinaenter.cland.services;

import java.util.List;

import edu.vinaenter.cland.models.Contact;

public interface ContactService {
	List<Contact> findAll();
	int delItem(int cid);
}
