package br.com.etechoracio.projetofinal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="cadastro")
public class Registros {
	
	@Id
	@Column(name="id_codigo")
	private int id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cep")
	private String cep;
	
	@Column(name="endereco")
	private String endereco;
	
	@Column(name="bairro")
	private String bairro;
	
	@Column(name="cidade")
	private String cidade;
	
	@Column(name="latitude")
	private double latitude;
	
	@Column(name="longitude")
	private double longitude;
	
	@Column(name="dt_criacao")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;
	
	
	@PrePersist
	private void preencherDataCriacao() {
		if(dataCriacao == null) {
			dataCriacao = new Date(); 
		}
	}
	
	
	
}
