package edu.vinaenter.cland.controllers.clands;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.vinaenter.cland.models.Categories;
import edu.vinaenter.cland.models.Land;
import edu.vinaenter.cland.services.CategoryService;
import edu.vinaenter.cland.services.LandService;

@Controller
@RequestMapping("cland")
public class ClandClandController {

	@Autowired
	private LandService landService;
	
	@Autowired
	private CategoryService categoryService;
	
	
	
	@ModelAttribute
	public void addCat(Model model) {
		List<Categories> catList = categoryService.findAll();
		model.addAttribute("catList", catList);
	}
	
	@ModelAttribute
	public void findTrend(Model model) {
		List<Land> landTrends = landService.findTrend();
		model.addAttribute("landTrends", landTrends);
	}
	
	@GetMapping("index")
	public String index(Model model) {
		List<Land> landList = landService.findAll();
		model.addAttribute("landList", landList);
		return "cland.index";
	}
	@GetMapping("cat/{cid}")
	public String cat(@PathVariable int cid,Model model) {
		List<Land> landListByCat = landService.findByCat(cid);
		model.addAttribute("landListByCat", landListByCat);
		return "cland.cat";
	}
	@GetMapping("detail/{lid}")
	public String detail(@PathVariable int lid,Model model) {
		Land land = landService.findById(lid);
		model.addAttribute("land", land);
		return "cland.detail";
	}
	
}
