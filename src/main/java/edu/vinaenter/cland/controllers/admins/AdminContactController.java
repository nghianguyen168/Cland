package edu.vinaenter.cland.controllers.admins;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.vinaenter.cland.constants.GlobalsConstant;
import edu.vinaenter.cland.models.Contact;
import edu.vinaenter.cland.services.ContactService;

@Controller
@RequestMapping("admin/contact")
public class AdminContactController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private MessageSource messageSource;
	 
	@GetMapping("index")
	public String contact(Model model) {
		List<Contact> findAll = contactService.findAll();
		model.addAttribute("contactList", findAll);
		return "admin.contact.index";
	}
	
	@GetMapping("/del/{cid}")
	public String delItem(@PathVariable int cid,RedirectAttributes rd) {
		int delItem = contactService.delItem(cid);
		if(delItem > 0) {
			rd.addFlashAttribute(GlobalsConstant.MSG, messageSource.getMessage("success", null, Locale.getDefault()));
			return "redirect:/admin/contact/index";
		} else {
			rd.addFlashAttribute(GlobalsConstant.MSG, messageSource.getMessage("error", null, Locale.getDefault()));
			 return "redirect:/admin/contact/index";
		}
		
		
	}
}
