package br.unibh.escola.entidades;

import java.util.Date;
import java.util.List;

public class Proponente {
	private Long Id;
	private String matricula;
	private Date dataCadastro;
	private String situacaoCadastro;
	private List enderecos;
	private List dependentes;
	private List vinculos;
	private String status;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getSituacaoCadastro() {
		return situacaoCadastro;
	}
	public void setSituacaoCadastro(String situacaoCadastro) {
		this.situacaoCadastro = situacaoCadastro;
	}
	public List getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List enderecos) {
		this.enderecos = enderecos;
	}
	public List getDependentes() {
		return dependentes;
	}
	public void setDependentes(List dependentes) {
		this.dependentes = dependentes;
	}
	public List getVinculos() {
		return vinculos;
	}
	public void setVinculos(List vinculos) {
		this.vinculos = vinculos;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
