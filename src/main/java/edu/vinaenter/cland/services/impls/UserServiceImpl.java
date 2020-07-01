package edu.vinaenter.cland.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vinaenter.cland.daos.UserDAO;
import edu.vinaenter.cland.models.User;
import edu.vinaenter.cland.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	}

	@Override
	public int delItem(int id) {
		return userDAO.delItem(id);
	}

}
