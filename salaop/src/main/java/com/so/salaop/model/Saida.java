package com.so.salaop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_saida", sequenceName = "seq_saida", allocationSize = 1, initialValue = 1)
public class Saida implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_saida")
	private Long id;
	private String viatura;
	private String prefixo;
	private String dataSaida;
	private String dataChegada;
	private String horaSaida;
	private String horaChegada;
	private String destino;
	private String motorista;
	private String observacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	public String getViatura() {
		return viatura;
	}
	public void setViatura(String viatura) {
		this.viatura = viatura;
	}
	
	public String getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}
	public String getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(String dataChegada) {
		this.dataChegada = dataChegada;
	}
	public String getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}
	public String getHoraChegada() {
		return horaChegada;
	}
	public void setHoraChegada(String horaChegada) {
		this.horaChegada = horaChegada;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getMotorista() {
		return motorista;
	}
	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	
	
}
