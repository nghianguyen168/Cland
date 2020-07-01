package edu.vinaenter.cland.services;

import java.util.List;

import edu.vinaenter.cland.models.Land;

public interface LandService {
	List<Land> findAll();
	int totalRow();
	List<Land> findByPage(int offset,int limit);
	 
}
