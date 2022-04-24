package com.so.salaop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.so.salaop.model.Saida;
import com.so.salaop.repository.SaidaRepository;


@Controller
public class SaidaController {
	

	@Autowired
	private SaidaRepository saidaRepository;
	
	@PostMapping(value = "salvarSaida")
	@ResponseBody
	public ResponseEntity<Saida> salvarSaida(@RequestBody Saida saida) {
	
		Saida sd = saidaRepository.save(saida);
		
		return new ResponseEntity<Saida>(sd, HttpStatus.CREATED);
		
	}
	
	
	
	
	/*
	 * @RequestMapping("cadsaida") public String Inicio(@ModelAttribute("saidaobj")
	 * final Object saidaObject, final BindingResult mapping1BindingResult, final
	 * Model model) {
	 * 
	 * model.addAttribute("transformationForm", saidaObject);
	 * 
	 * System.out.println(saidaObject);
	 * 
	 * return "/cadastro/cadastrosaida"; }
	 */
	
}
