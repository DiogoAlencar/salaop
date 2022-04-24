package com.so.salaop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.so.salaop.model.Viatura;


@Repository
@Transactional
public interface ViaturaRepository extends JpaRepository<Viatura, Long> {

	@Query(value = "select v from Viatura v where upper(trim(v.prefixo)) like %?1%")
	List<Viatura> pesquisarViaturaPorPrefixo(String pref);
	
}
