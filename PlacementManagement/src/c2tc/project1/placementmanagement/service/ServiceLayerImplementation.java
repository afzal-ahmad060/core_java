package c2tc.project1.placementmanagement.service;

import c2tc.project1.placementmanagement.dao.Dao;
import c2tc.project1.placementmanagement.dao.DaoImplementation;
import c2tc.project1.placementmanagement.entities.Certificate;

public class ServiceLayerImplementation implements ServiceLayer {
	Dao dao;
	
	public ServiceLayerImplementation()
	{
		dao = new DaoImplementation();
	}

	@Override
	public void addCertificate(Certificate ct) {
		dao.startTransaction();
		dao.addCertificate(ct);
		dao.endTransaction();
		
	}

	@Override
	public void updateCertificate(Certificate ct) {
		dao.startTransaction();
		dao.updateCertificate(ct);
		dao.endTransaction();
		
	}

	@Override
	public Certificate searchCertificate(long i) {
		return dao.searchCertificate(i);
		
	}

	@Override
	public void deleteCertificate(long i) {
		dao.startTransaction();
		dao.deleteCertificate(i);
		dao.endTransaction();
	}
	

}
