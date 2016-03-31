package br.unibh.escola.entidades;

import java.util.Date;

public class Questionario {
	private Long Id;
	private boolean portadorNecessidadesEspeciais;
	private boolean portadorMolestiaGrave;
	private boolean utilizaRemedioControlado;
	private Date dataUltimaInternacao;
	private Date dataUltimaConsultaMedica;
	private boolean possuiPlanoDeSaudeParticular;
	private boolean praticaEsportes;
	private boolean executaAtividadeDeRisco;
	private boolean seEnvolveuAcidenteUltimoAno;
	private double historicoCancerFamilia;
	private boolean possuiDoencaContagiosa;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public boolean isPortadorNecessidadesEspeciais() {
		return portadorNecessidadesEspeciais;
	}
	public void setPortadorNecessidadesEspeciais(boolean portadorNecessidadesEspeciais) {
		this.portadorNecessidadesEspeciais = portadorNecessidadesEspeciais;
	}
	public boolean isPortadorMolestiaGrave() {
		return portadorMolestiaGrave;
	}
	public void setPortadorMolestiaGrave(boolean portadorMolestiaGrave) {
		this.portadorMolestiaGrave = portadorMolestiaGrave;
	}
	public boolean isUtilizaRemedioControlado() {
		return utilizaRemedioControlado;
	}
	public void setUtilizaRemedioControlado(boolean utilizaRemedioControlado) {
		this.utilizaRemedioControlado = utilizaRemedioControlado;
	}
	public Date getDataUltimaInternacao() {
		return dataUltimaInternacao;
	}
	public void setDataUltimaInternacao(Date dataUltimaInternacao) {
		this.dataUltimaInternacao = dataUltimaInternacao;
	}
	public Date getDataUltimaConsultaMedica() {
		return dataUltimaConsultaMedica;
	}
	public void setDataUltimaConsultaMedica(Date dataUltimaConsultaMedica) {
		this.dataUltimaConsultaMedica = dataUltimaConsultaMedica;
	}
	public boolean isPossuiPlanoDeSaudeParticular() {
		return possuiPlanoDeSaudeParticular;
	}
	public void setPossuiPlanoDeSaudeParticular(boolean possuiPlanoDeSaudeParticular) {
		this.possuiPlanoDeSaudeParticular = possuiPlanoDeSaudeParticular;
	}
	public boolean isPraticaEsportes() {
		return praticaEsportes;
	}
	public void setPraticaEsportes(boolean praticaEsportes) {
		this.praticaEsportes = praticaEsportes;
	}
	public boolean isExecutaAtividadeDeRisco() {
		return executaAtividadeDeRisco;
	}
	public void setExecutaAtividadeDeRisco(boolean executaAtividadeDeRisco) {
		this.executaAtividadeDeRisco = executaAtividadeDeRisco;
	}
	public boolean isSeEnvolveuAcidenteUltimoAno() {
		return seEnvolveuAcidenteUltimoAno;
	}
	public void setSeEnvolveuAcidenteUltimoAno(boolean seEnvolveuAcidenteUltimoAno) {
		this.seEnvolveuAcidenteUltimoAno = seEnvolveuAcidenteUltimoAno;
	}
	public double getHistoricoCancerFamilia() {
		return historicoCancerFamilia;
	}
	public void setHistoricoCancerFamilia(double historicoCancerFamilia) {
		this.historicoCancerFamilia = historicoCancerFamilia;
	}
	public boolean isPossuiDoencaContagiosa() {
		return possuiDoencaContagiosa;
	}
	public void setPossuiDoencaContagiosa(boolean possuiDoencaContagiosa) {
		this.possuiDoencaContagiosa = possuiDoencaContagiosa;
	}
	
	
	
	
	
	

}
