package c2tc.project1.placementmanagement.service;

import c2tc.project1.placementmanagement.entities.Certificate;

public interface ServiceLayer {

	void addCertificate(Certificate ct);

	void updateCertificate(Certificate ct);

	Certificate searchCertificate(long i);

	void deleteCertificate(long i);

}
