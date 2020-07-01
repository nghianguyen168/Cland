package edu.vinaenter.cland.daos;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import edu.vinaenter.cland.models.User;

@Repository
public class UserDAO extends AbstractDAO{

	final String FIND_ALL ="SELECT * FROM users";
	final String DELETE = "DELETE FROM users WHERE id=?";
	
	public List<User>  findAll(){
		return getJdbcTemplate().query(FIND_ALL,new BeanPropertyRowMapper<>(User.class));
	}
	
	public int delItem(int id) {
		return getJdbcTemplate().update(DELETE,new Object[] {id});
	}
}
