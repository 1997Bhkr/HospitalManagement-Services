package com.hemanth.healthcare.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hemanth.healthcare.model.Doctor;
import com.hemanth.healthcare.service.DoctorService;

@RestController
@RequestMapping("/doctor")
@CrossOrigin("*")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	// add doctor
	@PostMapping("/add")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return doctorService.addDoctor(doctor);
	}
	
	// get all doctor
	@GetMapping("/all")
	public List<Doctor> getAllDoctors() {
		return doctorService.getAllDoctors();
	}
	
	// get doctor by id
	@GetMapping("/{id}")
	public Doctor getDoctorById(@PathVariable("id") Integer id) {
		return doctorService.getDoctorById(id);
	}

}
