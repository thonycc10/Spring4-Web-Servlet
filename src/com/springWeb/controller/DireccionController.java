package com.springWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springWeb.pojo.Admin;
import com.springWeb.pojo.Direccion;
import com.springWeb.service.AdminService;
import com.springWeb.service.DireccionService;

@Controller
@SessionAttributes("admin") // preserva el atributo de modelo hasta que le indique con el codigo cuando borrar
public class DireccionController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private DireccionService direccionService;
	
	@RequestMapping("/direccion/{idAd}") // se ejecuta
	public String getAll(Model model, // trae todo y muestra lo que quieres que muestre la interface
			@ModelAttribute("resultado") String resultado,
			@PathVariable("idAd") int idAd) { // muestra la interface creada.
		Admin admin = adminService.findById(idAd); // se consulta al administrador por medio del idad
		model.addAttribute("admin", admin); // se guarda su estado en @SessionAttributes con el identificador "admin"
		model.addAttribute("direccion", new Direccion()); // muestra la vista
		model.addAttribute("resultado", resultado); // mostramos el resultado.
		model.addAttribute("direcciones", direccionService.findAll(idAd));
		return "direccion";
	}
	
	@RequestMapping("/direccion/save")
	public String save(Model model, RedirectAttributes ra,
			@ModelAttribute("direccion") Direccion direccion,
			@ModelAttribute("admin") Admin admin) {
		direccionService.save(admin, direccion);
		ra.addFlashAttribute("resultado", "Cambios realizados con exito");
		return "redirect:/direccion/"+ admin.getIdAd();
	}
}
