package br.unibh.escola.entidades;

import java.math.BigDecimal;

public class Dependente {
	private Long Id;
	private String grauParentesco;
	private BigDecimal percentualBeneficio;
	private boolean dependenteIR;
	private Proponente proponente;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getGrauParentesco() {
		return grauParentesco;
	}
	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}
	public BigDecimal getPercentualBeneficio() {
		return percentualBeneficio;
	}
	public void setPercentualBeneficio(BigDecimal percentualBeneficio) {
		this.percentualBeneficio = percentualBeneficio;
	}
	public boolean isDependente() {
		return dependenteIR;
	}
	public void setDependente(boolean dependente) {
		this.dependenteIR = dependente;
	}
	public Proponente getProponente() {
		return proponente;
	}
	public void setProponente(Proponente proponente) {
		this.proponente = proponente;
	}
	
	

}
