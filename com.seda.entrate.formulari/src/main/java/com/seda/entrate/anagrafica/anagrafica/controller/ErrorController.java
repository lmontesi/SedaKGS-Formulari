/**
 * 
 */
package com.seda.entrate.anagrafica.anagrafica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lmontesi
 *
 */
@Controller
@RequestMapping(value="/errors")
public class ErrorController {

	@RequestMapping(value = "/error404", method=RequestMethod.GET)
	public String handle404() {
		
		return "error";
	}
	
	@RequestMapping(value = "/error500", method=RequestMethod.GET)
	public String handle500() {

		return "error";
	}
}
