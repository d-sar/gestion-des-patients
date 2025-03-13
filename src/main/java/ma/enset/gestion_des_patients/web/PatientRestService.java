package ma.enset.gestion_des_patients.web;

import jakarta.persistence.Access;
import ma.enset.gestion_des_patients.entities.Patient;
import ma.enset.gestion_des_patients.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestService {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> patients(){
        return patientRepository.findAll();
    }
    @GetMapping("/patients/{id}")
    public Patient findPatient(@PathVariable Long id){
        Patient patient = patientRepository.findById(id).orElse(null);// return un objet optionnel
        return patient;
    }

}
