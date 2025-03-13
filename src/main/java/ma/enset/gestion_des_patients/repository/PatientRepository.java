package ma.enset.gestion_des_patients.repository;

import ma.enset.gestion_des_patients.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface PatientRepository extends JpaRepository<Patient,Long> {
    List<Patient> findByNomContains(String motCle);
    @Query ("select p from Patient p where p.nom like : x")
    List<Patient> search(@Param("x") String motCle);
    @Modifying
    @Transactional
    @Query("UPDATE Patient p SET p.nom = :nom, p.dateNaissance = :dateNaissance, p.malade = :malade, p.score = :score WHERE p.id = :id ")
    int updatePatient(@Param("id") Long id,
                          @Param("nom") String nom,
                          @Param("dateNaissance") String dateNaissance,
                          @Param("malade") Boolean malade,
                          @Param("score") int score);
    @Modifying
    @Transactional
    @Query("DELETE FROM Patient p WHERE p.id = :id")
    int deletePatientById(@Param("id") Long id);


}
