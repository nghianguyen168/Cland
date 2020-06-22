package edu.vinaenter.cland.services.impls;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vinaenter.cland.daos.CategoryDAO;
import edu.vinaenter.cland.models.Categories;
import edu.vinaenter.cland.services.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{

	@Autowired
	private CategoryDAO catDAO;
	
	@Override
	public List<Categories> findAll() {
		return catDAO.findAll();
	}

	@Override
	public int AddItem(Categories cat) {
		return catDAO.addItem(cat);
	}

}
