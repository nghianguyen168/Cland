package edu.vinaenter.cland.daos;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import edu.vinaenter.cland.models.Contact;

@Repository
public class ContactDAO extends AbstractDAO {
	public final String FIND_ALL ="SELECT * FROM vnecontact ORDER BY cid DESC";
	public final String DELETE ="DELETE FROM vnecontact WHERE cid = ?";
	
	public List<Contact> findAll() {
		return getJdbcTemplate().query(FIND_ALL, new BeanPropertyRowMapper<>(Contact.class));
	}
	
	public int delItem(int cid) {
		return getJdbcTemplate().update(DELETE,new Object[] {cid});
	}
	
}
