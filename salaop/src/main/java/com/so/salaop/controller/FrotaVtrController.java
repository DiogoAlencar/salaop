package com.so.salaop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(
		method={RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE}
)
public class FrotaVtrController {

	/*
	 * @GetMapping(value = "/historicovtr") public ModelAndView
	 * abrirHistorico2(@RequestParam Long idHistorico) {
	 * 
	 * ModelAndView mav = new ModelAndView("/historicoviatura"); return mav;
	 * 
	 * }
	 */
	
}
