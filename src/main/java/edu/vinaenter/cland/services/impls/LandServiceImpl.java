package edu.vinaenter.cland.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vinaenter.cland.daos.LandDAO;
import edu.vinaenter.cland.models.Land;
import edu.vinaenter.cland.services.LandService;

@Service
public class LandServiceImpl implements LandService {

	@Autowired
	private LandDAO landDAO;
	
	@Override
	public List<Land> findAll() {
		return landDAO.findAll();
	}

	@Override
	public int totalRow() {
		return landDAO.totalRow();
	}

	@Override
	public List<Land> findByPage(int offset, int limit) {
		
		return landDAO.findByPage(limit, offset);
	}

	
	

}
