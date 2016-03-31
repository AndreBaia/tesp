package br.unibh.escola.entidades;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Proposta {
	private Long Id;
	private Date data;
	private Proponente proponente;
	private List questionario;
	private String tipoSeguro;
	private BigDecimal valorSegurado;
	private String classe;
	private Date dataInicioVigencia;
	private Date dataTerminoVigencia;
	private int carenciaEmMeses;
	private String situacaoAtual;
	private List tramitacoes;
	private BigDecimal valorPremio;
	private int dataPagamento;
	private String bancoPagamento;
	private String agencia;
	private String conta;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Proponente getProponente() {
		return proponente;
	}
	public void setProponente(Proponente proponente) {
		this.proponente = proponente;
	}
	public List getQuestionario() {
		return questionario;
	}
	public void setQuestionario(List questionario) {
		this.questionario = questionario;
	}
	public String getTipoSeguro() {
		return tipoSeguro;
	}
	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}
	public BigDecimal getValorSegurado() {
		return valorSegurado;
	}
	public void setValorSegurado(BigDecimal valorSegurado) {
		this.valorSegurado = valorSegurado;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public Date getDataInicioVigencia() {
		return dataInicioVigencia;
	}
	public void setDataInicioVigencia(Date dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}
	public Date getDataTerminoVigencia() {
		return dataTerminoVigencia;
	}
	public void setDataTerminoVigencia(Date dataTerminoVigencia) {
		this.dataTerminoVigencia = dataTerminoVigencia;
	}
	public int getCarenciaEmMeses() {
		return carenciaEmMeses;
	}
	public void setCarenciaEmMeses(int carenciaEmMeses) {
		this.carenciaEmMeses = carenciaEmMeses;
	}
	public String getSituacaoAtual() {
		return situacaoAtual;
	}
	public void setSituacaoAtual(String situacaoAtual) {
		this.situacaoAtual = situacaoAtual;
	}
	public List getTramitacoes() {
		return tramitacoes;
	}
	public void setTramitacoes(List tramitacoes) {
		this.tramitacoes = tramitacoes;
	}
	public BigDecimal getValorPremio() {
		return valorPremio;
	}
	public void setValorPremio(BigDecimal valorPremio) {
		this.valorPremio = valorPremio;
	}
	public int getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(int dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public String getBancoPagamento() {
		return bancoPagamento;
	}
	public void setBancoPagamento(String bancoPagamento) {
		this.bancoPagamento = bancoPagamento;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	
	
	

}
