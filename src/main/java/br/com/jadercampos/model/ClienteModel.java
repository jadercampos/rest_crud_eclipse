package br.com.jadercampos.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cliente")
public class ClienteModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_cliente;

	@Column(name="nome")
	String nome;
	
	@Column(name="cpf_cnpj")
	String cpf_cnpj;
	
	@Column(name="rg")
	String rg;
	
	@Column(name="endereco")
	String endereco;
	
	@Column(name="bairro")
	String bairro;
	
	@Column(name="cidade")
	String cidade;

	@Column(name="estado")
	String estado;
	
	@Column(name="telefone")
	String telefone;
	
	@Column(name="email")
	String email;
	
	@Column(name="datacadastro")
	@Temporal(TemporalType.TIMESTAMP)
	Date datacadastro;
	
	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
