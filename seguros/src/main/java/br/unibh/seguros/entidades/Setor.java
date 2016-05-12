package br.unibh.seguros.entidades;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_setor")
@NamedQueries({ @NamedQuery(name = "Setor.findByName", query = "select o from Setor o where o.nome like :nome") })
public class Setor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Version
	@Column(columnDefinition = "bigint NOT NULL DEFAULT 0")
	private Long version;

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Setor() {

	}

	public Setor(Long id, String nome, Collection<Setor> setoresInferiores, Setor setorSuperior,
			Collection<Usuario> mebros) {
		super();
		this.id = id;
		this.nome = nome;
		this.setoresInferiores = setoresInferiores;
		this.setorSuperior = setorSuperior;
		this.mebros = mebros;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 3, max = 150)
	@Pattern(regexp = "[A-zÁ-ú ]*", message = "Deve conter apenas letras e espaços")
	@Column(length = 150, nullable = false, unique = true)
	private String nome;

	@OneToMany(mappedBy = "setorSuperior", fetch = FetchType.LAZY)
	private Collection<Setor> setoresInferiores;

	@JoinColumn(name = "setor_superior")
	@ManyToOne(fetch = FetchType.LAZY)
	private Setor setorSuperior;

	@OneToMany(mappedBy = "setor", fetch = FetchType.LAZY)
	private Collection<Usuario> mebros;

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

	public Setor getSetorSuperior() {
		return setorSuperior;
	}

	public void setSetorSuperior(Setor setorSuperior) {
		this.setorSuperior = setorSuperior;
	}

	public Collection<Usuario> getMebros() {
		return mebros;
	}

	public void setMebros(Collection<Usuario> mebros) {
		this.mebros = mebros;
	}

	public Collection<Setor> getSetoresInferiores() {
		return setoresInferiores;
	}

	public void setSetoresInferiores(Collection<Setor> setoresInferiores) {
		this.setoresInferiores = setoresInferiores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mebros == null) ? 0 : mebros.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((setorSuperior == null) ? 0 : setorSuperior.hashCode());
		result = prime * result + ((setoresInferiores == null) ? 0 : setoresInferiores.hashCode());
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
		Setor other = (Setor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mebros == null) {
			if (other.mebros != null)
				return false;
		} else if (!mebros.equals(other.mebros))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (setorSuperior == null) {
			if (other.setorSuperior != null)
				return false;
		} else if (!setorSuperior.equals(other.setorSuperior))
			return false;
		if (setoresInferiores == null) {
			if (other.setoresInferiores != null)
				return false;
		} else if (!setoresInferiores.equals(other.setoresInferiores))
			return false;
		return true;
	}

}