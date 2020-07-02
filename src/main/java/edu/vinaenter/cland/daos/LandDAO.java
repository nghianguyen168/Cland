package edu.vinaenter.cland.daos;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import edu.vinaenter.cland.models.Categories;
import edu.vinaenter.cland.models.Land;

@Repository
public class LandDAO extends AbstractDAO{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static final String FIND_ALL_SQL ="SELECT l.*,c.* FROM lands AS l INNER JOIN categories AS c ON l.cid = c.cid ORDER BY l.lid";
	public static final String FIND_BY_CAT ="SELECT l.*,c.* FROM lands AS l INNER JOIN categories AS c ON l.cid = c.cid WHERE l.cid=? ORDER BY l.lid";
	public static final String FIND_BY_PAGE ="SELECT l.*,c.* FROM lands AS l INNER JOIN categories AS c ON l.cid = c.cid ORDER BY l.lid DESC LIMIT ?,?";
	public static final String FIND_BY_ID ="SELECT * FROM lands AS l INNER JOIN categories AS c ON l.cid = c.cid WHERE l.lid = ?";
	public static final String TOTAL_ROW = "SELECT COUNT(*) AS totalRow FROM lands";
	public static final String FIND_TREND ="SELECT l.*,c.* FROM lands AS l INNER JOIN categories AS c ON l.cid = c.cid ORDER BY l.count_views DESC LIMIT 5";
	
	public List<Land> findAll(){
		return getJdbcTemplate().query(FIND_ALL_SQL, new ResultSetExtractor<List<Land>>() {

			@Override
			public List<Land> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Land> landList = new ArrayList<Land>();
				while(rs.next()) {
					Land land = new  Land(rs.getInt("lid"), rs.getString("lname"), rs.getString("description"),
							rs.getTimestamp("date_create"), rs.getString("picture"), rs.getInt("area"),
							rs.getString("address"), rs.getInt("count_views"), new Categories(rs.getInt("cid"),rs.getString("cname"),0));
					landList.add(land);
				}
				return landList;
			}
		});
	}
	
	public List<Land> findByCat(int cid){
		return getJdbcTemplate().query(FIND_BY_CAT,new Object[] {cid}, new ResultSetExtractor<List<Land>>() {

			@Override
			public List<Land> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Land> landList = new ArrayList<Land>();
				while(rs.next()) {
					Land land = new  Land(rs.getInt("lid"), rs.getString("lname"), rs.getString("description"),
							rs.getTimestamp("date_create"), rs.getString("picture"), rs.getInt("area"),
							rs.getString("address"), rs.getInt("count_views"), new Categories(rs.getInt("cid"),rs.getString("cname"),0));
					landList.add(land);
				}
				return landList;
			}
		});
	}
	
	public List<Land> findTrend(){
		return getJdbcTemplate().query(FIND_TREND, new ResultSetExtractor<List<Land>>() {

			@Override
			public List<Land> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Land> landList = new ArrayList<Land>();
				while(rs.next()) {
					Land land = new  Land(rs.getInt("lid"), rs.getString("lname"), rs.getString("description"),
							rs.getTimestamp("date_create"), rs.getString("picture"), rs.getInt("area"),
							rs.getString("address"), rs.getInt("count_views"), new Categories(rs.getInt("cid"),rs.getString("cname"),0));
					landList.add(land);
				}
				return landList;
			}
		});
	}
	
	public List<Land> findByPage(int limit,int offset){
		return getJdbcTemplate().query(FIND_BY_PAGE, new ResultSetExtractor<List<Land>>() {

			@Override
			public List<Land> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Land> landList = new ArrayList<Land>();
				while(rs.next()) {
					Land land = new  Land(rs.getInt("lid"), rs.getString("lname"), rs.getString("description"),
							rs.getTimestamp("date_create"), rs.getString("picture"), rs.getInt("area"),
							rs.getString("address"), rs.getInt("count_views"), new Categories(rs.getInt("cid"),rs.getString("cname"),0));
					landList.add(land);
				}
				return landList;
			}
		},new Object[] {offset,limit});
	}
	
	public Land findById(int lid) {
		return getJdbcTemplate().queryForObject(FIND_BY_ID,new Object[] {lid},new BeanPropertyRowMapper<>(Land.class));
	}
	

	public int totalRow() {
		return getJdbcTemplate().queryForObject(TOTAL_ROW, Integer.class);
	}
	
}
