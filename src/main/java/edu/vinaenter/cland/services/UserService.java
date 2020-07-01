package edu.vinaenter.cland.services;

import java.util.List;

import edu.vinaenter.cland.models.User;

public interface UserService {
	List<User> findAll();
	int delItem(int id);
}
