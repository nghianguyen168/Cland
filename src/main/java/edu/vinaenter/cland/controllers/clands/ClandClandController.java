package edu.vinaenter.cland.controllers.clands;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cland")
public class ClandClandController {

	@GetMapping("index")
	public String index() {
		
		return "cland.index";
	}
	@GetMapping("cat")
	public String cat() {
		return "cland.cat";
	}
	@GetMapping("detail")
	public String detail() {
		return "cland.detail";
	}
	
}
