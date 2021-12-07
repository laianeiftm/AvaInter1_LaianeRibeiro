package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
public class Pessoa implements Serializable{	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer codPessoa;
public Integer getCodPessoa() {
		return codPessoa;
	}


	public void setCodPessoa(Integer codPessoa) {
		this.codPessoa = codPessoa;
	}


private String nome;
private String telefone;
private String endereço;


public Pessoa() {

}


public Pessoa(Integer codPessoa, String nome, String telefone, String endereço) {
	super();
	this.codPessoa = codPessoa;
	this.setNome(nome);
	this.setTelefone(telefone);
	this.setEndereço(endereço);
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getTelefone() {
	return telefone;
}


public void setTelefone(String telefone) {
	this.telefone = telefone;
}


public String getEndereço() {
	return endereço;
}


public void setEndereço(String endereço) {
	this.endereço = endereço;
}
}




