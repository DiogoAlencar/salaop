package com.so.salaop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.so.salaop.model.Efetivo;
import com.so.salaop.repository.EfetivoRepository;


/**
 *
 * A sample greetings controller to return greeting text
 */
@Controller
public class EfetivoController {

	@Autowired
	private EfetivoRepository efetivoRepository;


	@GetMapping(value = "voltarindex")
	public String principal() {
		return "index";
	}

	@GetMapping(value = "listaTodoEfetivo")
	@ResponseBody
	public ResponseEntity<List<Efetivo>> listaEfetivo() {
		
		List<Efetivo> lista = efetivoRepository.findAll();
		
		return new ResponseEntity<List<Efetivo>>(lista, HttpStatus.OK);
		
	}
	
	
	@PostMapping(value = "salvarMe")
	@ResponseBody
	public ResponseEntity<Efetivo> salvar(@RequestBody Efetivo efetivo) {
		
		Efetivo me = efetivoRepository.save(efetivo);
		
		return new ResponseEntity<Efetivo>(me, HttpStatus.CREATED);
		
	}
	
	@DeleteMapping(value = "deleteMe") // não pode ter json no front end
    @ResponseBody
    public ResponseEntity<String> ExcluirMe(@RequestParam Long idme) { // envia apenas um parametro no front end
    	
    	efetivoRepository.deleteById(idme);
    	
    	return new ResponseEntity<String>("Militar excluído com sucesso!", HttpStatus.OK);
    	
    }
	
	@GetMapping(value = "buscarMePorId")
    @ResponseBody
    public ResponseEntity<Efetivo> buscarMePorId(@RequestParam(name="idme") Long idme) {
    	
    	Efetivo efetivo = efetivoRepository.findById(idme).get();
    	
    	return new ResponseEntity<Efetivo>(efetivo, HttpStatus.OK);
    	
    }
	
}
