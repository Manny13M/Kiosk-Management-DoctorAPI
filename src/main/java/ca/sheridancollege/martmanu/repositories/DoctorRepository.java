package ca.sheridancollege.martmanu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.martmanu.beans.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
