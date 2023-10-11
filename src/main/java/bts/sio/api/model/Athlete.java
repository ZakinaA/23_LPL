package bts.sio.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "athlete")
public class Athlete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Column(name="date_naissance")

    private LocalDate date_naissance;


    @Column(name = "image")
    private String image;

    @ManyToOne
    @JoinColumn(name = "pays_id")
    private Pays pays;

    @ManyToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;

}
