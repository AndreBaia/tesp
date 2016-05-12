package br.unibh.seguros.entidades;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import br.unibh.seguros.util.CharacterToBooleanUtil;

@Entity
@Table(name = "tb_dependente")
@PrimaryKeyJoinColumn
public class Dependente extends PessoaFisica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank
	@Pattern(regexp = "[A-zÁ-ú ]*")
	@Max(30)
	@Column(name = "grau_parentesco", length = 30, nullable = false)
	private String grauParentesco;

	@NotNull
	@DecimalMin("0.00")
	@DecimalMax("100.00")
	@Column(name = "percentual_beneficio", columnDefinition = "DECIMAL(30)", nullable = false)
	private BigDecimal percentualBeneficio;

	@Column(name = "dependente_ir", columnDefinition = "CHAR(1)", nullable = false)
	private Character dependenteIR;

	@ManyToOne(fetch = FetchType.LAZY)
	private Proponente proponente;

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

	public Boolean isDependenteIR() {
		return CharacterToBooleanUtil.getBoolean(dependenteIR);
	}

	public void setDependenteIR(Boolean dependenteR) {
		this.dependenteIR = CharacterToBooleanUtil.getCharacter(dependenteR);
	}

	public Proponente getProponente() {
		return proponente;
	}

	public void setProponente(Proponente proponente) {
		this.proponente = proponente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dependenteIR == null) ? 0 : dependenteIR.hashCode());
		result = prime * result + ((grauParentesco == null) ? 0 : grauParentesco.hashCode());
		result = prime * result + ((percentualBeneficio == null) ? 0 : percentualBeneficio.hashCode());
		result = prime * result + ((proponente == null) ? 0 : proponente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dependente other = (Dependente) obj;
		if (dependenteIR == null) {
			if (other.dependenteIR != null)
				return false;
		} else if (!dependenteIR.equals(other.dependenteIR))
			return false;
		if (grauParentesco == null) {
			if (other.grauParentesco != null)
				return false;
		} else if (!grauParentesco.equals(other.grauParentesco))
			return false;
		if (percentualBeneficio == null) {
			if (other.percentualBeneficio != null)
				return false;
		} else if (!percentualBeneficio.equals(other.percentualBeneficio))
			return false;
		if (proponente == null) {
			if (other.proponente != null)
				return false;
		} else if (!proponente.equals(other.proponente))
			return false;
		return true;
	}

}