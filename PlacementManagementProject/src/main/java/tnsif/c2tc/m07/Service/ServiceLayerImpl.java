package tnsif.c2tc.m07.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnsif.c2tc.m07.entity.Certificate;
import tnsif.c2tc.m07.repo.CertificateRepo;

@Service
public class ServiceLayerImpl implements ServiceLayer {

	@Autowired
	CertificateRepo cr;
	
	@Override
	public void addCertificate(Certificate ct) {
		
		cr.save(ct);

	}

	
	@Override
	public Certificate searchCertificate(int i) {
		Certificate c = cr.findById(i).get();
		return c;
	}
	
	@Override
	public Certificate updateCertificate(Certificate ct) {
		Certificate c = cr.save(ct);
		return c;
	}


	@Override
	public int deleteCertificate(int id) {
		Certificate c = cr.findById(id).get();
		cr.delete(c);
		return 1;
	}

}
