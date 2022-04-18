package c2tc.project1.placementmanagement.dao;

import c2tc.project1.placementmanagement.entities.Certificate;

public interface Dao {

	void startTransaction();

	void endTransaction();
	
	void addCertificate(Certificate ct);

	void updateCertificate(Certificate ct);
	
	Certificate searchCertificate(long i);

	void deleteCertificate(long i);

	

	

}
