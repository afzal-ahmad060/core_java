package tnsif.c2tc.m07.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tnsif.c2tc.m07.Service.ServiceLayer;
import tnsif.c2tc.m07.entity.Certificate;

@RestController
public class CertificateController {
	@Autowired
	ServiceLayer service;
	
	@PostMapping("/addCertificate")
	public void addCertificate(@RequestBody Certificate ct)
	{
		service.addCertificate(ct);
	}

	@GetMapping("/searchCertificate/{id}")
	public Certificate searchCertificate(@PathVariable int id)
	{
		return service.searchCertificate(id);
	}
	
	@PutMapping("/updateCertificate")
	public Certificate updateCertificate(@RequestBody Certificate ct)
	{
		return service.updateCertificate(ct);
	}
	
	@DeleteMapping("/deleteCertificate/{id}")
	public int deleteCertificate(@PathVariable int id)
	{
		return deleteCertificate(id);
		
	}
}
