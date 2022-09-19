package com.hemanth.healthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemanth.healthcare.model.Patient;
import com.hemanth.healthcare.repository.PatientRepo;

@Service
public class PatientService {
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private PatientRepo patientRepo;

	public Patient addPatient(Patient patient) {
		Patient newPatient =  patientRepo.save(patient);
		doctorService.updatePatientDoctor(newPatient.getDoctorId());
		return newPatient;
	}

	public Patient getPatientById(Integer id) {
		return patientRepo.findById(id).orElse(new Patient());
	}

}
