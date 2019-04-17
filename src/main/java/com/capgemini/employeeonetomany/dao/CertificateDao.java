package com.capgemini.employeeonetomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.employeeonetomany.entities.Certificate;

@Repository
public interface CertificateDao extends JpaRepository<Certificate, Integer> {

}
