package edu.vinaenter.cland.daos;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import edu.vinaenter.cland.models.Categories;

@Repository
public class CategoryDAO extends AbstractDAO{

	private static final String FIND_ALL ="SELECT cid,cname FROM categories ORDER BY cid DESC";
	private static final String ADD_ITEM ="INSERT INTO categories(cname) values(?)";
			
	public List<Categories> findAll(){
		return getJdbcTemplate().query(FIND_ALL,new BeanPropertyRowMapper<>(Categories.class));
	}
	
	public int addItem(Categories cat) {
		return getJdbcTemplate().update(ADD_ITEM, new Object[] {cat.getCname()});
	}
}
