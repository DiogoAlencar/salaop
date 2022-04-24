package com.so.salaop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_efetivo", sequenceName = "seq_efetivo", allocationSize = 1, initialValue = 1)
public class Efetivo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_efetivo")
	private Long id;
	private String nome;
	private String telefonePrincipal;
	private String telefoneEmergencia;
	private String graduacao;
	private String idfunc;
	private String email;
	
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
	public String getGraduacao() {
		return graduacao;
	}
	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}
	public String getTelefonePrincipal() {
		return telefonePrincipal;
	}
	public void setTelefonePrincipal(String telefonePrincipal) {
		this.telefonePrincipal = telefonePrincipal;
	}
	public String getTelefoneEmergencia() {
		return telefoneEmergencia;
	}
	public void setTelefoneEmergencia(String telefoneEmergencia) {
		this.telefoneEmergencia = telefoneEmergencia;
	}
	public String getIdfunc() {
		return idfunc;
	}
	public void setIdfunc(String idfunc) {
		this.idfunc = idfunc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
	
}
