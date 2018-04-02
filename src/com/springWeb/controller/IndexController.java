/**
 * 
 */
package com.springWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Anthony Carrasco
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
}
