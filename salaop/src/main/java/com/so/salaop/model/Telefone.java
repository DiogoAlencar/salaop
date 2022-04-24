package com.so.salaop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_telefone", sequenceName = "seq_telefone", allocationSize = 1, initialValue = 1)
public class Telefone implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_telefone")
	private Long id;
	
	private String nome;
	private String telefoneEmergencia;
	private String telefonePrincipal;
	private String telefoneFixoUm;
	private String telefoneFixoDois;
	private String celularUm;
	private String celularDois;
	private String observacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefoneEmergencia() {
		return telefoneEmergencia;
	}
	public void setTelefoneEmergencia(String telefoneEmergencia) {
		this.telefoneEmergencia = telefoneEmergencia;
	}
	public String getTelefonePrincipal() {
		return telefonePrincipal;
	}
	public void setTelefonePrincipal(String telefonePrincipal) {
		this.telefonePrincipal = telefonePrincipal;
	}
	public String getTelefoneFixoUm() {
		return telefoneFixoUm;
	}
	public void setTelefoneFixoUm(String telefoneFixoUm) {
		this.telefoneFixoUm = telefoneFixoUm;
	}
	public String getTelefoneFixoDois() {
		return telefoneFixoDois;
	}
	public void setTelefoneFixoDois(String telefoneFixoDois) {
		this.telefoneFixoDois = telefoneFixoDois;
	}
	public String getCelularUm() {
		return celularUm;
	}
	public void setCelularUm(String celularUm) {
		this.celularUm = celularUm;
	}
	public String getCelularDois() {
		return celularDois;
	}
	public void setCelularDois(String celularDois) {
		this.celularDois = celularDois;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	
}
