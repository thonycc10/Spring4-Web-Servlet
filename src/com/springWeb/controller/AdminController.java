package com.springWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springWeb.dao.AdminDao;
import com.springWeb.pojo.Admin;
import com.springWeb.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/admin")
	public String showAdmin(Model model, @ModelAttribute("resultado")String resultado) {
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		model.addAttribute("resultado", resultado);
		return "admin";
	}
//	un requestParam es esto -> /admin?id=0
	@RequestMapping(value="admin/save", method=RequestMethod.POST)
	public String handleAdmin(@ModelAttribute("admin")Admin adminForm, 
			Model model, RedirectAttributes ra) {
		
//		model.addAttribute("adminForm", adminForm);
//		System.out.println(adminForm);
//		System.out.println("request param "+estado);
		
		if (adminService.save(adminForm)) {
			ra.addFlashAttribute("resultado", "cambios realizados con exito");		
		} else {
			ra.addFlashAttribute("resultado", "Error a realizar cambios");
		}
		
	
		return "redirect:/admin";
	}
}
