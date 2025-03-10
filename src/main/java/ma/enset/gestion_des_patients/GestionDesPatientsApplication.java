package ma.enset.gestion_des_patients;

import ma.enset.gestion_des_patients.entities.Patient;
import ma.enset.gestion_des_patients.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GestionDesPatientsApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(GestionDesPatientsApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null,"ahmed","23/02",true,2));
        List<Patient> patients = patientRepository.findAll();
        patients.forEach(p ->{
            System.out.println(p.toString());
        } );
        Patient p1 = patientRepository.findById(Long.valueOf(1).get());
        System.out.println(p1.toString());
    }
}
