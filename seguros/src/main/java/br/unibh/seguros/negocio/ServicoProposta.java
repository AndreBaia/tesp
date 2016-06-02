package br.unibh.seguros.negocio;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.unibh.seguros.entidades.Proposta;

@Stateless
@LocalBean
public class ServicoProposta implements DAO<Proposta, Long> {
	
	@Inject
	EntityManager em;
	@Inject
	private Logger log;
	
	@Override
	public Proposta insert(Proposta t) throws Exception {
		log.info("Persistindo " + t);
		t.setData(new Date());
		em.persist(t);
		return null;
	}

	@Override
	public Proposta update(Proposta t) throws Exception {
		log.info("Atualizando" + t);
		return em.merge(t);
	}

	@Override
	public void delete(Proposta t) throws Exception {
		log.info("Deletando" + t);
		Object c = em.merge(t);
		em.remove(c);

	}

	@Override
	public Proposta find(Long k) throws Exception {
		log.info("Encontrando " + k);
		return em.find(Proposta.class, k);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Proposta> findAll() throws Exception {
		log.info("Encontrando todos as Propostas");
		return em.createQuery("from Proposta").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Proposta> findByName(String name) throws Exception {
		log.info("Encontrando o" + name);
		return em.createNamedQuery("Proposta.findByName").setParameter("id", name + "%").getResultList();
	}

}
