package br.unibh.escola.entidades;

import java.io.File;
import java.util.Date;

public class Tramitacao {
	private String etapaProcesso;
	private Date dataHora;
	private String situacaoInicial;
	private String situacaoFinal;
	private Setor setorResponsavel;
	private String tipoDecisao;
	private Usuario usuarioDecisao;
	private String comentario;
	private File documento;
	
	
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
	public Setor getSetorResponsavel() {
		return setorResponsavel;
	}
	public void setSetorResponsavel(Setor setorResponsavel) {
		this.setorResponsavel = setorResponsavel;
	}
	public String getTipoDecisao() {
		return tipoDecisao;
	}
	public void setTipoDecisao(String tipoDecisao) {
		this.tipoDecisao = tipoDecisao;
	}
	public Usuario getUsuarioDecisao() {
		return usuarioDecisao;
	}
	public void setUsuarioDecisao(Usuario usuarioDecisao) {
		this.usuarioDecisao = usuarioDecisao;
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
	
	
	
	

}
