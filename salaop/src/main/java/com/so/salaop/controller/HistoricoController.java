package com.so.salaop.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.so.salaop.model.Saida;
import com.so.salaop.repository.SaidaRepository;


@Controller
@RequestMapping(
		method={RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE}
)
public class HistoricoController {
	
	@Autowired
	private SaidaRepository saidaRepository;
	
	@GetMapping("historico/{viatura}")
	public ModelAndView abrirHistorico(@PathVariable("viatura") String viatura) {
		
		
		String str = viatura.replaceAll("[']", ""); //Long idl = Long.parseLong(strid);
		 
		 
		List<Saida> lista = saidaRepository.consultarSaidaPorNomeVtr(str);
		Collections.reverse(lista);
		ModelAndView mav = new ModelAndView("historicoviatura");
		mav.addObject("vtrHistorico", lista);
		return mav;
		
	}
	
	
	/*
	 * @GetMapping(value = "pesquisarhistorico")
	 * 
	 * @ResponseBody public ResponseEntity<List<Saida>>
	 * pesquisarTelefonePorNome(@RequestParam Long idvtr) {
	 * 
	 * List<Saida> lista = saidaRepository.consultarSaidaPorNomeVtr(idvtr);
	 * 
	 * return new ResponseEntity<List<Saida>>(lista, HttpStatus.OK);
	 * 
	 * }
	 */
	 
	
	
	
	 
	
}
