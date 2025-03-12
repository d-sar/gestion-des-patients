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
        patientRepository.save(new Patient(null,"SARA","3/02",true,2));
        patientRepository.save(new Patient(null,"AAAm","23/02",false,5));
        List<Patient> patients = patientRepository.findAll();
        patients.forEach(p ->{
            System.out.println(p.toString());
                }
                );
        Patient p1 = patientRepository.findById(2L).orElse(null);

        System.out.println("$$$$$$$$$$$$");
        System.out.println(p1.getId_patient());
        System.out.println(p1.getNom_patient());

    }
}
