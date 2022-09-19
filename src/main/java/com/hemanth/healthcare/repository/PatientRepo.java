package com.hemanth.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hemanth.healthcare.model.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer>{

}
