package ma.enset.gestion_des_patients.repository;

import ma.enset.gestion_des_patients.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patient,Long> {

}
