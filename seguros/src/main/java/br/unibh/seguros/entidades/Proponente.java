package br.unibh.seguros.entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "tb_proponente")
@NamedQueries({ @NamedQuery(name = "Proponente.findByName", query = "select o from Proponente o where o.matricula like :matricula") })

public class Proponente extends PessoaFisica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank
	@Pattern(regexp = "[0-9]*")
	@Size(min = 5, max = 8)
	@Column(columnDefinition = "char(8)", nullable = false)
	private String matricula;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_cadastro", nullable = false)
	private Date dataCadastro;

	@NotBlank
	@Pattern(regexp = "[A-zÁ-ú ]*")
	@Max(30)
	@Column(name = "situacao_cadastro", nullable = false, length = 30)
	private String situacaoCadastro;

	@NotBlank
	@Pattern(regexp = "[A-zÁ-ú ]*")
	@Max(30)
	@Column(nullable = false, length = 30)
	private String status;

	@OneToMany(mappedBy = "proponente", fetch = FetchType.LAZY)
	private Collection<Endereco> enderecos;

	@OneToMany(mappedBy = "proponente", fetch = FetchType.LAZY)
	private Collection<Dependente> dependentes;

	@OneToMany(mappedBy = "proponente", fetch = FetchType.LAZY)
	private Collection<Vinculo> vinculos;

	@OneToMany(mappedBy = "proponente", fetch = FetchType.LAZY)
	private Collection<Proposta> propostas;

	@OneToMany(mappedBy = "proponente", fetch = FetchType.LAZY)
	private Collection<Seguro> seguros;

	public Collection<Seguro> getSeguros() {
		return seguros;
	}

	public void setSeguros(Collection<Seguro> seguros) {
		this.seguros = seguros;
	}

	public Collection<Proposta> getPropostas() {
		return propostas;
	}

	public void setPropostas(Collection<Proposta> propostas) {
		this.propostas = propostas;
	}

	public Collection<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Collection<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Collection<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(Collection<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public Collection<Vinculo> getVinculos() {
		return vinculos;
	}

	public void setVinculos(Collection<Vinculo> vinculos) {
		this.vinculos = vinculos;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((dependentes == null) ? 0 : dependentes.hashCode());
		result = prime * result + ((enderecos == null) ? 0 : enderecos.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((propostas == null) ? 0 : propostas.hashCode());
		result = prime * result + ((seguros == null) ? 0 : seguros.hashCode());
		result = prime * result + ((situacaoCadastro == null) ? 0 : situacaoCadastro.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((vinculos == null) ? 0 : vinculos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proponente other = (Proponente) obj;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (dependentes == null) {
			if (other.dependentes != null)
				return false;
		} else if (!dependentes.equals(other.dependentes))
			return false;
		if (enderecos == null) {
			if (other.enderecos != null)
				return false;
		} else if (!enderecos.equals(other.enderecos))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (propostas == null) {
			if (other.propostas != null)
				return false;
		} else if (!propostas.equals(other.propostas))
			return false;
		if (seguros == null) {
			if (other.seguros != null)
				return false;
		} else if (!seguros.equals(other.seguros))
			return false;
		if (situacaoCadastro == null) {
			if (other.situacaoCadastro != null)
				return false;
		} else if (!situacaoCadastro.equals(other.situacaoCadastro))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (vinculos == null) {
			if (other.vinculos != null)
				return false;
		} else if (!vinculos.equals(other.vinculos))
			return false;
		return true;
	}

}