package ca.sheridancollege.martmanu.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.martmanu.beans.Doctor;
import ca.sheridancollege.martmanu.services.DoctorService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BootStrap implements CommandLineRunner {

	private DoctorService doctorService;
	
	@Override
	public void run(String... args) throws Exception {
		
		doctorService.save(new Doctor("John"));
		doctorService.save(new Doctor("Sally"));
		doctorService.save(new Doctor("Bob"));
		
	}
}
