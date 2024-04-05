package ca.sheridancollege.martmanu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ca.sheridancollege.martmanu.beans.Doctor;
import ca.sheridancollege.martmanu.repositories.DoctorRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DoctorServiceImp implements DoctorService {

	private DoctorRepository doctorRepo;
	
	@Override
	public List<Doctor> findAll() {

		return doctorRepo.findAll();
	}

	@Override
	public Doctor findById(Long id) {
		
		Optional<Doctor> doctor = doctorRepo.findById(id);
		
		if(doctor.isPresent()) {
			return doctor.get();
		}
		else {
			return null;
		}
	}

	@Override
	public Doctor save(Doctor doctor) {
		
		return doctorRepo.save(doctor);
	}

}
