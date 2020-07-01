package edu.vinaenter.cland.controllers.admins;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.vinaenter.cland.constants.GlobalsConstant;
import edu.vinaenter.cland.models.Land;
import edu.vinaenter.cland.services.LandService;
import edu.vinaenter.cland.utils.PaginationUtils;

@Controller
@RequestMapping("admin/land")
public class AdminLandController {
	
	@Autowired
	private LandService landService;
	
	@GetMapping({"index","/index/{page}"})
	public String index(Model model,@PathVariable(required = false,name = "page") Integer page) {
		
		//current page
		if(page==null) {
			page=1;
		}
		//Get Ofset
		int offset = PaginationUtils.getOffset(page);
		
		List<Land> findAll = landService.findByPage(offset, GlobalsConstant.LIMIT_PAGE);
		for(Land land:findAll) {
			System.out.println(land.getCategories().getCname());
		}
		
		
		//phan trang
		//tong so tin
		int totalRow = landService.totalRow();
		int totalPage = (int)Math.ceil((float)totalRow / GlobalsConstant.LIMIT_PAGE);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("landList", findAll);
		model.addAttribute("page", page);
		return "admin.land.index";
	}
	
	@GetMapping("add")
	public String add() {
		return "admin.land.add";
	}
	
	@GetMapping("edit")
	public String edit() {
		return "admin.land.edit";
	}
	
	
}
