package tnsif.c2tc.m07.Service;

import tnsif.c2tc.m07.entity.Certificate;

public interface ServiceLayer {
	
	public void addCertificate(Certificate ct);

	public Certificate updateCertificate(Certificate ct);

	public Certificate searchCertificate(int i);

	public int deleteCertificate(int id);

}
