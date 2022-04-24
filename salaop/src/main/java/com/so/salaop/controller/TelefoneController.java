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

import com.so.salaop.model.Telefone;
import com.so.salaop.repository.TelefoneRepository;

@Controller
public class TelefoneController {

	@Autowired
	private TelefoneRepository telefoneRepository;
	
	@PostMapping(value = "salvarTelefone")
	@ResponseBody
	public ResponseEntity<Telefone> salvarTelefone(@RequestBody Telefone telefone) {
	
		Telefone fone = telefoneRepository.save(telefone);
		
		return new ResponseEntity<Telefone>(fone, HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "listaTodosTelefones")
	@ResponseBody
	public ResponseEntity<List<Telefone>> listaTelefones() {
		
		List<Telefone> lista = telefoneRepository.findAll();
		
		return new ResponseEntity<List<Telefone>>(lista, HttpStatus.OK);
		
	}
	
	@GetMapping(value = "buscarTelefonePorId")
    @ResponseBody
    public ResponseEntity<Telefone> buscarTelefonePorId(@RequestParam(name="idFone") Long idFone) {
    	
		Telefone telefone = telefoneRepository.findById(idFone).get();
    	
    	return new ResponseEntity<Telefone>(telefone, HttpStatus.OK);
    	
    }
	
	@GetMapping(value = "buscarTelefonePorNome")
    @ResponseBody
	public ResponseEntity<List<Telefone>> pesquisarTelefonePorNome(@RequestParam(name="nome") String nome) {
		
		List<Telefone> lista = telefoneRepository.pesquisarTelefone(nome.trim().toUpperCase());
		
		return new ResponseEntity<List<Telefone>>(lista, HttpStatus.OK);
		
	}
	
	
	@DeleteMapping(value = "excluirtelefone")
	@ResponseBody
	public ResponseEntity<String> excluirTelefone(@RequestParam Long idFone) {
		
		telefoneRepository.deleteById(idFone);
		
		return new ResponseEntity<String>("Telefone excluído com sucesso!", HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
