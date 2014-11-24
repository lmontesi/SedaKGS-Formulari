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
@RequestMapping(value="/menu")
public class AnagraficaController {

	@RequestMapping(method=RequestMethod.GET) 
	public String editAccount() {

		return "anagrafica";
	}
}
