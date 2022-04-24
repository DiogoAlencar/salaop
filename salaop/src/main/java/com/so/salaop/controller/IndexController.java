package com.so.salaop.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.so.salaop.model.Saida;
import com.so.salaop.repository.SaidaRepository;


@Controller
@RequestMapping(
		method={RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE}
)
public class IndexController {

	@Autowired
	private SaidaRepository saidaRepository;
	
	@GetMapping(value = "/")
	public String principal() {
		return "index";
	}
	
	@GetMapping(value = "/cadastroefetivo")
	public String cadastroEfetivo() {
		return "cadastro/cadastroefetivo";
	}
	
	@GetMapping(value = "/cadastrotelefones")
	public String cadastroTelefones() {
		return "cadastro/cadastrotelefones";
	}
	
	@GetMapping(value = "/cadastroviaturas")
	public String cadastroViaturas() {
		return "cadastro/cadastroviaturas";
	}
	
	@GetMapping(value = "/cadastrosaida")
	public String cadastroSaidas() {
		return "cadastro/cadastrosaida";
	}
	
	@GetMapping(value = "/viaturas")
	public String viaturas() {
		return "viaturas";
	}
	
	@GetMapping(value = "/telefones")
	public String telefones() {
		return "telefones";
	}
	
	@GetMapping(value = "/historicoviatura") 
	public String historico() { 
		 return "historicoviatura"; 
	}
	
	@GetMapping(value = "listaTodasSaidas")
	@ResponseBody
	public ResponseEntity<List<Saida>> listaViaturas() {
		
		List<Saida> lista = saidaRepository.findAll();
		
		return new ResponseEntity<List<Saida>>(lista, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value = "atualizar", produces = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Saida> atualizar(@RequestBody Saida saida) {
		Saida sd = saidaRepository.save(saida);
		return new ResponseEntity<Saida>(sd, HttpStatus.OK);
	}
		 
	
}
