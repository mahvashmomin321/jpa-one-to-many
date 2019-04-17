package com.capgemini.employeeonetomany.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="certificate")
public class Certificate {

	@Id
	private int certificateId;
	private String certificateName;
	
	@ManyToOne
	private Employee employee;
	
	public Certificate() {
		super();
	}

	

	public Certificate(int certificateId, String certificateName) {
		super();
		this.certificateId = certificateId;
		this.certificateName = certificateName;
	}



	public int getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}



	@Override
	public String toString() {
		return "Certificate [certificateId=" + certificateId + ", certificateName=" + certificateName + "]";
	}



	
	
	
}
