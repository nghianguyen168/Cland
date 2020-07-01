package edu.vinaenter.cland.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vinaenter.cland.daos.ContactDAO;
import edu.vinaenter.cland.models.Contact;
import edu.vinaenter.cland.services.ContactService;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactDAO contactDAO;
	
	@Override
	public List<Contact> findAll() {
		return contactDAO.findAll();
	}

	@Override
	public int delItem(int cid) {
		return contactDAO.delItem(cid);
	}

}
