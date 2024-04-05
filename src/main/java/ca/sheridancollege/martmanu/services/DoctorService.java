package ca.sheridancollege.martmanu.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ca.sheridancollege.martmanu.beans.Doctor;

@Service
public interface DoctorService {
	
	public List<Doctor> findAll();
	public Doctor findById(Long id);
	public Doctor save(Doctor doctor);
}
