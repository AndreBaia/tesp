package br.unibh.seguros.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.Past;

import br.unibh.seguros.util.CharacterToBooleanUtil;



@Entity
@Table(name = "tb_questionario")
public class Questionario implements Serializable {
	

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "portador_necessidades_especiais", nullable = false)
	private Character portadorNecessidadesEspeciais;

	@Column(name = "portador_molestia_grave", nullable = false)
	private Character portadorMolestiaGrave;

	@Column(name = "utiliza_remedio_controlado", nullable = false)
	private Character utilizaRemedioControlado;

	@Past
	@Column(name = "data_ultima_internacao")
	@Temporal(TemporalType.DATE)
	private Date dataUltimaInternacao;

	@Past
	@Column(name = "data_ultima_consulta_medica")
	@Temporal(TemporalType.DATE)
	private Date dataUltimaConsultaMedica;

	@Column(name = "possui_plano_saude_particular", nullable = false)
	private Character possuiPlanoSaudeParticular;

	@Column(name = "pratica_esportes", nullable = false)
	private Character praticaEsportes;

	@Column(name = "executa_atividade_de_risco", nullable = false)
	private Character executaAtividadeDeRisco;

	@Column(name = "se_envolveu_em_acidente_ultimo_ano", nullable = false)
	private Character seEnvolveuEmAcidenteUltimoAno;

	@Column(name = "historico_cancer_familia", nullable = false)
	private Character historicoCancerFamilia;

	@Column(name = "possui_doenca_contagiosa", nullable = false)
	private Character possuiDoencaContagiosa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean isPortadorNecessidadesEspeciais() {
		return CharacterToBooleanUtil.getBoolean(portadorNecessidadesEspeciais);
	}

	public void setPortadorNecessidadesEspeciais(Boolean portadorNecessidadesEspeciais) {
		this.portadorNecessidadesEspeciais = CharacterToBooleanUtil.getCharacter(portadorNecessidadesEspeciais);
	}

	public Boolean isPortadorMolestiaGrave() {
		return CharacterToBooleanUtil.getBoolean(portadorMolestiaGrave);
	}

	public void setPortadorMolestiaGrave(Boolean portadorMolestiaGrave) {
		this.portadorMolestiaGrave = CharacterToBooleanUtil.getCharacter(portadorMolestiaGrave);
	}

	public Boolean isUtilizaRemedioControlado() {
		return CharacterToBooleanUtil.getBoolean(utilizaRemedioControlado);
	}

	public void setUtilizaRemedioControlado(Boolean utilizaRemedioControlado) {
		this.utilizaRemedioControlado = CharacterToBooleanUtil.getCharacter(utilizaRemedioControlado);
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

	public Boolean isPossuiPlanoSaudeParticular() {
		return CharacterToBooleanUtil.getBoolean(possuiPlanoSaudeParticular);
	}

	public void setPossuiPlanoSaudeParticular(Boolean possuiPlanoSaudeParticular) {
		this.possuiPlanoSaudeParticular = CharacterToBooleanUtil.getCharacter(possuiPlanoSaudeParticular);
	}

	public Boolean isPraticaEsportes() {
		return CharacterToBooleanUtil.getBoolean(praticaEsportes);
	}

	public void setPraticaEsportes(Boolean praticaEsportes) {
		this.praticaEsportes = CharacterToBooleanUtil.getCharacter(praticaEsportes);
	}

	public Boolean isExecutaAtividadeDeRisco() {
		return CharacterToBooleanUtil.getBoolean(executaAtividadeDeRisco);
	}

	public void setExecutaAtividadeDeRisco(Boolean executaAtividadeDeRisco) {
		this.executaAtividadeDeRisco = CharacterToBooleanUtil.getCharacter(executaAtividadeDeRisco);
	}

	public Boolean isSeEnvolveuEmAcidenteUltimoAno() {
		return CharacterToBooleanUtil.getBoolean(seEnvolveuEmAcidenteUltimoAno);
	}

	public void setSeEnvolveuEmAcidenteUltimoAno(Boolean seEnvolveuEmAcidenteUltimoAno) {
		this.seEnvolveuEmAcidenteUltimoAno = CharacterToBooleanUtil.getCharacter(seEnvolveuEmAcidenteUltimoAno);
	}

	public Boolean isHistoricoCancerFamilia() {
		return CharacterToBooleanUtil.getBoolean(historicoCancerFamilia);
	}

	public void setHistoricoCancerFamilia(Boolean historicoCancerFamilia) {
		this.historicoCancerFamilia = CharacterToBooleanUtil.getCharacter(historicoCancerFamilia);
	}

	public Boolean isPossuiDoencaContagiosa() {
		return CharacterToBooleanUtil.getBoolean(possuiDoencaContagiosa);
	}

	public void setPossuiDoencaContagiosa(Boolean possuiDoencaContagiosa) {
		this.possuiDoencaContagiosa = CharacterToBooleanUtil.getCharacter(possuiDoencaContagiosa);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataUltimaConsultaMedica == null) ? 0 : dataUltimaConsultaMedica.hashCode());
		result = prime * result + ((dataUltimaInternacao == null) ? 0 : dataUltimaInternacao.hashCode());
		result = prime * result + ((executaAtividadeDeRisco == null) ? 0 : executaAtividadeDeRisco.hashCode());
		result = prime * result + ((historicoCancerFamilia == null) ? 0 : historicoCancerFamilia.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((portadorMolestiaGrave == null) ? 0 : portadorMolestiaGrave.hashCode());
		result = prime * result
				+ ((portadorNecessidadesEspeciais == null) ? 0 : portadorNecessidadesEspeciais.hashCode());
		result = prime * result + ((possuiDoencaContagiosa == null) ? 0 : possuiDoencaContagiosa.hashCode());
		result = prime * result + ((possuiPlanoSaudeParticular == null) ? 0 : possuiPlanoSaudeParticular.hashCode());
		result = prime * result + ((praticaEsportes == null) ? 0 : praticaEsportes.hashCode());
		result = prime * result
				+ ((seEnvolveuEmAcidenteUltimoAno == null) ? 0 : seEnvolveuEmAcidenteUltimoAno.hashCode());
		result = prime * result + ((utilizaRemedioControlado == null) ? 0 : utilizaRemedioControlado.hashCode());
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
		Questionario other = (Questionario) obj;
		if (dataUltimaConsultaMedica == null) {
			if (other.dataUltimaConsultaMedica != null)
				return false;
		} else if (!dataUltimaConsultaMedica.equals(other.dataUltimaConsultaMedica))
			return false;
		if (dataUltimaInternacao == null) {
			if (other.dataUltimaInternacao != null)
				return false;
		} else if (!dataUltimaInternacao.equals(other.dataUltimaInternacao))
			return false;
		if (executaAtividadeDeRisco == null) {
			if (other.executaAtividadeDeRisco != null)
				return false;
		} else if (!executaAtividadeDeRisco.equals(other.executaAtividadeDeRisco))
			return false;
		if (historicoCancerFamilia == null) {
			if (other.historicoCancerFamilia != null)
				return false;
		} else if (!historicoCancerFamilia.equals(other.historicoCancerFamilia))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (portadorMolestiaGrave == null) {
			if (other.portadorMolestiaGrave != null)
				return false;
		} else if (!portadorMolestiaGrave.equals(other.portadorMolestiaGrave))
			return false;
		if (portadorNecessidadesEspeciais == null) {
			if (other.portadorNecessidadesEspeciais != null)
				return false;
		} else if (!portadorNecessidadesEspeciais.equals(other.portadorNecessidadesEspeciais))
			return false;
		if (possuiDoencaContagiosa == null) {
			if (other.possuiDoencaContagiosa != null)
				return false;
		} else if (!possuiDoencaContagiosa.equals(other.possuiDoencaContagiosa))
			return false;
		if (possuiPlanoSaudeParticular == null) {
			if (other.possuiPlanoSaudeParticular != null)
				return false;
		} else if (!possuiPlanoSaudeParticular.equals(other.possuiPlanoSaudeParticular))
			return false;
		if (praticaEsportes == null) {
			if (other.praticaEsportes != null)
				return false;
		} else if (!praticaEsportes.equals(other.praticaEsportes))
			return false;
		if (seEnvolveuEmAcidenteUltimoAno == null) {
			if (other.seEnvolveuEmAcidenteUltimoAno != null)
				return false;
		} else if (!seEnvolveuEmAcidenteUltimoAno.equals(other.seEnvolveuEmAcidenteUltimoAno))
			return false;
		if (utilizaRemedioControlado == null) {
			if (other.utilizaRemedioControlado != null)
				return false;
		} else if (!utilizaRemedioControlado.equals(other.utilizaRemedioControlado))
			return false;
		return true;
	}
	
	

}