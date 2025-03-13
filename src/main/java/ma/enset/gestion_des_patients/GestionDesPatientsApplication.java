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
        //Ajouter des patients
        //patientRepository.save(new Patient(null,"AAA","4/2",true,72));
       // patientRepository.save(new Patient(null,"ahmed","23/02",true,2));
     //   patientRepository.save(new Patient(null,"SARA","3/02",true,2));
        //patientRepository.save(new Patient(null,"BBB","23/02",false,5));
        //Consulter tous les patients
        List<Patient> patients = patientRepository.findAll();
        patients.forEach(p ->{
            System.out.println(p.toString());
                }
                );

        //Consulter un patient
//        Patient p1 = patientRepository.findById(2L).orElse(null);
//        System.out.println("$$$$$$$$$$$$");
//        System.out.println(p1.getNom());
//        System.out.println(p1.getMalade());


        //Chercher des patients
        System.out.println("Chercher des patients **methode 1: $$$$$$$$$$$$");
        List<Patient> patients2 = patientRepository.findByNomContains("AA");
        patients2.forEach(p->{
            System.out.println(p);
                });
//        System.out.println("Chercher des patients  **methode 2: $$$$$$$$$$$$");
//        List<Patient> patientsList = patientRepository.search("%%");
//        patientsList.forEach(p->{
//            System.out.println(p);
//        });
        // Mettre à jour un patient
        System.out.println("***Mettre à jour un patient**");
         patientRepository.updatePatient(1L,"Ali","22/02",true,55);
        List<Patient> patientsUPDAT = patientRepository.findAll();
        patientsUPDAT .forEach(p ->{
                    System.out.println(p.toString());
                }
        );

        // supprimer un patient
        System.out.println("***Supprimer un patient**");
        patientRepository.deletePatientById(2L);

    }
}
