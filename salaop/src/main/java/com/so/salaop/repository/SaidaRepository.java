package com.so.salaop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.so.salaop.model.Saida;


@Repository
@Transactional
public interface SaidaRepository extends JpaRepository<Saida, Long> {
	
	@Query(value = "select s from Saida s where s.viatura like %?1% ")
	List<Saida> consultarSaidaPorNomeVtr(String viatura);
}
