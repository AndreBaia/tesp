package br.unibh.seguros.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="tb_pessoa_fisica")
@Inheritance(strategy=InheritanceType.JOINED)
public class PessoaFisica implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Version
	@Column(columnDefinition="bigint NOT NULL DEFAULT 0")
	private Long version;
	public Long getVersion() {
	return version;
	}
	public void setVersion(Long version) {
	this.version = version;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Pattern(regexp = "[A-zÁ-ú ]*", message="Favor fornecer apenas letras e espaços")
	@Size(min = 5, max = 100)
	@Column (length=100, nullable=false)
	private String nome;
	
	@NotBlank
	@Size(min = 11, max = 11)
	@Pattern(regexp = "[0-9]*")
	@Column (length=11, nullable=false,unique=true)
	private String cpf;
	
	@Pattern(regexp = "\\(\\d{2}\\)\\d{4}-\\d{4}", message="Favor fornecer no formato (00)0000-0000")
	@Column (name="telefone_comercial",length=14)
	private String telefoneComercial;
	
	@NotBlank
	@Pattern(regexp = "\\(\\d{2}\\)\\d{4}-\\d{4}")
	@Column (name="telefone_residencial",length=14)
	private String telefoneResidencial;
	
	@Pattern(regexp = "\\(\\d{2}\\)\\d{4}-\\d{4}")
	@Column (name="telefone_celular",length=14)
	private String telefoneCelular;
	
	@Email
	@Size(max = 100)
	@Column (length=100)
	private String email;
	
	@Min(18)
	@Max(99)
	@Column (nullable=false)
	private int idade; 
	
	@NotNull
	@Past
	@Column (name="data_nascimento", nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}
	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefoneComercial() {
		return telefoneComercial;
	}
	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefoneCelular == null) ? 0 : telefoneCelular.hashCode());
		result = prime * result + ((telefoneComercial == null) ? 0 : telefoneComercial.hashCode());
		result = prime * result + ((telefoneResidencial == null) ? 0 : telefoneResidencial.hashCode());
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
		PessoaFisica other = (PessoaFisica) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefoneCelular == null) {
			if (other.telefoneCelular != null)
				return false;
		} else if (!telefoneCelular.equals(other.telefoneCelular))
			return false;
		if (telefoneComercial == null) {
			if (other.telefoneComercial != null)
				return false;
		} else if (!telefoneComercial.equals(other.telefoneComercial))
			return false;
		if (telefoneResidencial == null) {
			if (other.telefoneResidencial != null)
				return false;
		} else if (!telefoneResidencial.equals(other.telefoneResidencial))
			return false;
		return true;
	}
	
	
	
}