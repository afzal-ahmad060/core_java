package c2tc.project1.placementmanagement.dao;

import javax.persistence.EntityManager;

import c2tc.project1.placementmanagement.entities.Certificate;

public class DaoImplementation implements Dao {

	EntityManager em;
	
	public DaoImplementation()
	{
		em = Configuration.getEntityManager();
	}
	
	@Override
	public void startTransaction() {
		em.getTransaction().begin();
		
	}
	
	@Override
	public void endTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void addCertificate(Certificate ct) {
		em.persist(ct);
		
	}

	@Override
	public void updateCertificate(Certificate ct) {
		em.merge(ct);
		
	}

	@Override
	public Certificate searchCertificate(long i) {
		return em.find(Certificate.class, i);
		
	}

	@Override
	public void deleteCertificate(long i) {
		Certificate c = em.find(Certificate.class, i);
		em.remove(c);
	}



}
