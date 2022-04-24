package com.so.salaop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.so.salaop.model.Telefone;


@Repository
@Transactional
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
	
	@Query(value = "select t from Telefone t where upper(trim(t.nome)) like %?1%")
	List<Telefone> pesquisarTelefone(String nome);

}
