package edu.vinaenter.cland.models;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Land {
	
	private int lid;
	
	private String lname;
	
	private String description;
	
	private Timestamp date_create;
	
	private String picture;
	
	private int area;
	
	private String address;
	
	private int count_views;
	
	private Categories categories;
	
	
}
