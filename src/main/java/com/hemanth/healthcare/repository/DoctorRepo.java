package com.hemanth.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hemanth.healthcare.model.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor,Integer>{

}
