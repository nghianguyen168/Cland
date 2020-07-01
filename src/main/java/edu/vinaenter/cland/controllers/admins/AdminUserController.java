package edu.vinaenter.cland.controllers.admins;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.vinaenter.cland.models.User;
import edu.vinaenter.cland.services.impls.UserServiceImpl;

@Controller
@RequestMapping("admin/user")
public class AdminUserController {

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@GetMapping("index")
	public String index(Model model) {
		List<User> findAll = userServiceImpl.findAll();
		model.addAttribute("userList", findAll);
		return "admin.user.index";
	}
	
	@GetMapping("del/{id}")
	public String del(@PathVariable int id) {
		int delItem = userServiceImpl.delItem(id);
		return "redirect:/admin/user/index";
	}

}
