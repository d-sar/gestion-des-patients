package ma.enset.gestion_des_patients.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.gestion_des_patients.repository.PatientRepository;
import org.springframework.data.annotation.Id;

import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Medcin {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String nom;
    private String email;
    private String specialite;
    @OneToMany(mappedBy = "medcin",fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezVous;
}
