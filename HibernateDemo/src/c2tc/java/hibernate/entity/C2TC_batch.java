package c2tc.java.hibernate.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("C2TC_batch")
public class C2TC_batch extends Student{
	private String tech_tr;
	private String softSkill_tr;
	
	
	public String getTech_tr() {
		return tech_tr;
	}
	public void setTech_tr(String tech_tr) {
		this.tech_tr = tech_tr;
	}
	public String getSoftSkill_tr() {
		return softSkill_tr;
	}
	public void setSoftSkill_tr(String softSkill_tr) {
		this.softSkill_tr = softSkill_tr;
	}
	
	
}
