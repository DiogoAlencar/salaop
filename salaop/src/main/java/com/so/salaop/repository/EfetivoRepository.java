package com.so.salaop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.so.salaop.model.Efetivo;


@Repository
@Transactional
public interface EfetivoRepository extends JpaRepository<Efetivo, Long> {

}
