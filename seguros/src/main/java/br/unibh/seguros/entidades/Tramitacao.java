package br.unibh.seguros.entidades;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="tb_tramitacao")
public class Tramitacao implements Serializable {
	
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
	@Pattern(regexp = "[A-zÁ-ú ]")
	@Max(30)
	@Column (name="etapa_processo",length=30, nullable=false)
	private String etapaProcesso;
	
	
	@Column(name="data_hora", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHora;
	
	@NotBlank
	@Pattern(regexp = "[A-zÁ-ú ]")
	@Max(50)
	@Column (name="situacao_inicial",length=50, nullable=false)
	private String situacaoInicial;
	
	@NotBlank
	@Pattern(regexp = "[A-zÁ-ú ]")
	@Max(50)
	@Column (name="situacao_final",length=50, nullable=false)
	private String situacaoFinal;
	
	@NotBlank
	@Pattern(regexp = "[A-zÁ-ú ]")
	@Max(100)
	@Column (name="tipo_decisao",length=100, nullable=false)
	private String tipoDecisao;
	
	@Pattern(regexp = "[A-zÁ-ú ]")
	@Max(4000)
	@Column (columnDefinition="TEXT(4000)", nullable=false)
	private String comentario;

	@Lob
	@Column
	private File documento;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Proposta proposta;

	@JoinColumn(name="setor_responsavel")
	@ManyToOne(fetch=FetchType.EAGER)
	private Setor setorResponsavel;
	
	@JoinColumn(name="usuario_decisao")
	@ManyToOne(fetch=FetchType.EAGER)
	private Usuario usuarioDecisao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEtapaProcesso() {
		return etapaProcesso;
	}
	public void setEtapaProcesso(String etapaProcesso) {
		this.etapaProcesso = etapaProcesso;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public String getSituacaoInicial() {
		return situacaoInicial;
	}
	public void setSituacaoInicial(String situacaoInicial) {
		this.situacaoInicial = situacaoInicial;
	}
	public String getSituacaoFinal() {
		return situacaoFinal;
	}
	public void setSituacaoFinal(String situacaoFinal) {
		this.situacaoFinal = situacaoFinal;
	}
	public String getTipoDecisao() {
		return tipoDecisao;
	}
	public void setTipoDecisao(String tipoDecisao) {
		this.tipoDecisao = tipoDecisao;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public File getDocumento() {
		return documento;
	}
	public void setDocumento(File documento) {
		this.documento = documento;
	}
	public Proposta getProposta() {
		return proposta;
	}
	public void setProposta(Proposta proposta) {
		this.proposta = proposta;
	}
	public Setor getSetorResponsavel() {
		return setorResponsavel;
	}
	public void setSetorResponsavel(Setor setorResponsavel) {
		this.setorResponsavel = setorResponsavel;
	}
	public Usuario getUsuarioDecisao() {
		return usuarioDecisao;
	}
	public void setUsuarioDecisao(Usuario usuarioDecisao) {
		this.usuarioDecisao = usuarioDecisao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
		result = prime * result + ((dataHora == null) ? 0 : dataHora.hashCode());
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + ((etapaProcesso == null) ? 0 : etapaProcesso.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((proposta == null) ? 0 : proposta.hashCode());
		result = prime * result + ((setorResponsavel == null) ? 0 : setorResponsavel.hashCode());
		result = prime * result + ((situacaoFinal == null) ? 0 : situacaoFinal.hashCode());
		result = prime * result + ((situacaoInicial == null) ? 0 : situacaoInicial.hashCode());
		result = prime * result + ((tipoDecisao == null) ? 0 : tipoDecisao.hashCode());
		result = prime * result + ((usuarioDecisao == null) ? 0 : usuarioDecisao.hashCode());
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
		Tramitacao other = (Tramitacao) obj;
		if (comentario == null) {
			if (other.comentario != null)
				return false;
		} else if (!comentario.equals(other.comentario))
			return false;
		if (dataHora == null) {
			if (other.dataHora != null)
				return false;
		} else if (!dataHora.equals(other.dataHora))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (etapaProcesso == null) {
			if (other.etapaProcesso != null)
				return false;
		} else if (!etapaProcesso.equals(other.etapaProcesso))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (proposta == null) {
			if (other.proposta != null)
				return false;
		} else if (!proposta.equals(other.proposta))
			return false;
		if (setorResponsavel == null) {
			if (other.setorResponsavel != null)
				return false;
		} else if (!setorResponsavel.equals(other.setorResponsavel))
			return false;
		if (situacaoFinal == null) {
			if (other.situacaoFinal != null)
				return false;
		} else if (!situacaoFinal.equals(other.situacaoFinal))
			return false;
		if (situacaoInicial == null) {
			if (other.situacaoInicial != null)
				return false;
		} else if (!situacaoInicial.equals(other.situacaoInicial))
			return false;
		if (tipoDecisao == null) {
			if (other.tipoDecisao != null)
				return false;
		} else if (!tipoDecisao.equals(other.tipoDecisao))
			return false;
		if (usuarioDecisao == null) {
			if (other.usuarioDecisao != null)
				return false;
		} else if (!usuarioDecisao.equals(other.usuarioDecisao))
			return false;
		return true;
	}
	
	
	
	
}