package com.hemanth.healthcare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemanth.healthcare.model.Doctor;
import com.hemanth.healthcare.repository.DoctorRepo;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepo doctorRepo;
	
	public Doctor addDoctor(Doctor doc) {
		return doctorRepo.save(doc);
	}

	public List<Doctor> getAllDoctors() {
		return doctorRepo.findAll();
	}

	public Doctor getDoctorById(Integer id) {
		return doctorRepo.findById(id).orElse(new Doctor());
	}

	public void updatePatientDoctor(Integer doctorId) {
		Doctor doc = doctorRepo.findById(doctorId).orElse(null);
		if(doc != null) {
			doc.setNumberOfPatients(doc.getNumberOfPatients()+1);
			doctorRepo.save(doc);
		}
	}

}
