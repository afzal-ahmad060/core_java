package c2tc.project1.placementmanagement;

//import java.util.Scanner;

import c2tc.project1.placementmanagement.entities.Certificate;
import c2tc.project1.placementmanagement.service.ServiceLayer;
import c2tc.project1.placementmanagement.service.ServiceLayerImplementation;

public class Client {

	public static void main(String[] args) {
		ServiceLayer service = new ServiceLayerImplementation();
		
		Certificate ct = new Certificate();
		/*
		//ADD CERTIFICATE
		try {
		ct.setId(2110603);
		ct.setYear(2023);
		ct.setCollege("St. Francis Institute Of Engineering");
		
		service.addCertificate(ct);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Data insertion or Data already exists.");
		}
		
		//UPDATE CERTIFICATE
		try {
		ct.setId(2110606);
		ct.setYear(2016);
		ct.setCollege("St. Andrews Institute Of Engineering");
		
		service.updateCertificate(ct);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured while updating table. Please check if data is valid.");
		}
		
		/*
		//SEARCH CERTIFICATE
		System.out.println(service.searchCertificate(2110609));
		
		
		//DELETE CERTIFICATE
		try {
		service.deleteCertificate(2110609);
		}
		catch(Exception e)
		{
			System.out.println("Deletion Unsuccessful. Data corresponding to specified key does not exist.");
		}
		*/
	}

}
