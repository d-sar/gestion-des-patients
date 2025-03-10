package ma.enset.gestion_des_patients.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_patient;
    private String nom_patient;
    private String dateNaissance_patient;
    private Boolean malade ;
    private int score_patient;

    public Patient(Long id_patient, String nom_patient, String dateNaissance_patient, Boolean malade, int score_patient) {
        this.id_patient = id_patient;
        this.nom_patient = nom_patient;
        this.dateNaissance_patient = dateNaissance_patient;
        this.malade = malade;
        this.score_patient = score_patient;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id_patient=" + id_patient +
                ", nom_patient='" + nom_patient + '\'' +
                ", dateNaissance_patient='" + dateNaissance_patient + '\'' +
                ", malade=" + malade +
                ", score_patient=" + score_patient +
                '}';
    }
}
