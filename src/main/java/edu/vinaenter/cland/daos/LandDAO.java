package edu.vinaenter.cland.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import edu.vinaenter.cland.models.Land;

public class LandDAO {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	final String FIND_ALL_SQL ="SELECT * FROM lands ORDER BY lid";
	
	

}
