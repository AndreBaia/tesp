package br.unibh.seguros.negocio;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.unibh.seguros.entidades.Tramitacao;

public class ServicoTramitacao implements DAO<Tramitacao, Long> {
	@Inject
	EntityManager em;
	@Inject
	private Logger log;

	@Override
	public Tramitacao insert(Tramitacao t) throws Exception {
		log.info("Persistindo " + t);
		em.persist(t);
		return t;
	}

	@Override
	public Tramitacao update(Tramitacao t) throws Exception {
		log.info("Atualizando " + t);
		return em.merge(t);
	}

	@Override
	public void delete(Tramitacao t) throws Exception {
		log.info("Removendo " + t);
		Object c = em.merge(t);
		em.remove(c);
	}

	@Override
	public Tramitacao find(Long k) throws Exception {
		log.info("Encontrando " + k);
		return em.find(Tramitacao.class, k);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tramitacao> findAll() throws Exception {
		log.info("Encontrando todas as Tramitacões");
		return em.createQuery("from Tramitacao").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tramitacao> findByName(String name) throws Exception {
		log.info("Encontrando a " + name);
		return em.createNamedQuery("Tramitacao.findByName").setParameter("id", name + "%").getResultList();
	}

}
