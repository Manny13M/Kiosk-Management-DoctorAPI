package ca.sheridancollege.martmanu.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.martmanu.beans.Doctor;
import ca.sheridancollege.martmanu.services.DoctorService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/doctors")
public class DoctorRestController {
	
	private DoctorService doctorService;
	
	@GetMapping(value = "/findAll")
	public List<Doctor> getAllDoctors() {
		return doctorService.findAll();
	}
	
	@GetMapping(value = "/findById/{id}")
	public Doctor getDoctorById(@PathVariable Long id) {
		return doctorService.findById(id);
	}
	
	@PostMapping(value = "/save", headers = {"Content-type=application/json"})
	public List<Doctor> saveDoctor(@RequestBody Doctor doctor) {
		doctorService.save(doctor);
		return doctorService.findAll();
	}

}
