package br.unibh.seguros.negocio;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.unibh.seguros.entidades.Proponente;

public class ServicoProponente implements DAO<Proponente, Long> {

	@Inject
	EntityManager em;
	@Inject
	private Logger log;

	@Override
	public Proponente insert(Proponente t) throws Exception {
		log.info("Persistindo " + t);
		em.persist(t);
		return null;
	}

	@Override
	public Proponente update(Proponente t) throws Exception {
		log.info("Atualizando" + t);
		return em.merge(t);
	}

	@Override
	public void delete(Proponente t) throws Exception {
		log.info("Deletando" + t);
		Object c = em.merge(t);
		em.remove(c);

	}

	@Override
	public Proponente find(Long k) throws Exception {
		log.info("Encontrando " + k);
		return em.find(Proponente.class, k);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Proponente> findAll() throws Exception {
		log.info("Encontrando todos os proponentes");
		return em.createQuery("from proponente").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Proponente> findByName(String name) throws Exception {
		log.info("Encontrando o" + name);
		return em.createNamedQuery("Proponente.findByName").setParameter("nome", name + "%").getResultList();
	}

}
