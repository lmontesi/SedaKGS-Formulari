/**
 * 
 */
package com.seda.entrate.anagrafica.home.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lmontesi
 *
 */
@Controller
@RequestMapping(value="/menuHomeAnagrafica")
public class HomeController {

	@RequestMapping(method=RequestMethod.GET) 
	public String homePage(HttpServletRequest request) {

		return "home";
	}
}
