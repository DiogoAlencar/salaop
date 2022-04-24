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

import com.so.salaop.model.Viatura;
import com.so.salaop.repository.ViaturaRepository;

@Controller
public class ViaturaController {

	@Autowired
	private ViaturaRepository viaturaRepository;
	
	
	@PostMapping(value = "salvarViatura")
	@ResponseBody
	public ResponseEntity<Viatura> salvarViatura(@RequestBody Viatura viatura) {
	
		Viatura vtr = viaturaRepository.save(viatura);
		
		return new ResponseEntity<Viatura>(vtr, HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "listaTodasViaturas")
	@ResponseBody
	public ResponseEntity<List<Viatura>> listaViaturas() {
		
		List<Viatura> lista = viaturaRepository.findAll();
		
		return new ResponseEntity<List<Viatura>>(lista, HttpStatus.OK);
		
	}
	
	
	@GetMapping(value = "buscarViaturaPorId")
    @ResponseBody
    public ResponseEntity<Viatura> buscarViaturaPorId(@RequestParam(name="idViatura") Long idViatura) {
    	
		Viatura viatura = viaturaRepository.findById(idViatura).get();
    	
    	return new ResponseEntity<Viatura>(viatura, HttpStatus.OK);
    	
    }
	
	
	@GetMapping(value = "pesquisarViaturaPorPrefixo")
    @ResponseBody
	public ResponseEntity<List<Viatura>> pesquisarViaturaPorPrefixo(@RequestParam(name="pref") String pref) {
		
		List<Viatura> lista = viaturaRepository.pesquisarViaturaPorPrefixo(pref.trim().toUpperCase());
		
		return new ResponseEntity<List<Viatura>>(lista, HttpStatus.OK);
		
	}
	
	@DeleteMapping(value = "excluirviatura")
	@ResponseBody
	public ResponseEntity<String> excluirViatura(@RequestParam Long idVtr) {
		
		viaturaRepository.deleteById(idVtr);
		
		return new ResponseEntity<String>("Viatura excluída com sucesso!", HttpStatus.OK);
		
	}
	
	
}
