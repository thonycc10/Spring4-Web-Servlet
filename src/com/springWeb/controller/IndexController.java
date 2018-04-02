/**
 * 
 */
package com.springWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author Anthony Carrasco
 *
 */
@Controller
@SessionAttributes("resultado")
public class IndexController {

	@RequestMapping("/")
	public String showIndex(Model model) {
		model.addAttribute("resultado", "Vengo del Controller - index");
		return "index";
	}
	
	@RequestMapping("/about")
	public String showAbout() {
		return "about";
	}
	
	@RequestMapping("/admin")
	public String showAdmin(Model model) {
		model.addAttribute("mensaje", "Mensaje de Model");
		return "admin";
	}
}
