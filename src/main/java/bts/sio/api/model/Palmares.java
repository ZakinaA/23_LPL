package bts.sio.api.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "Palmares")
public class Palmares {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="annee")
    private String annee ;

    @ManyToOne
    @JoinColumn(name = "id_ville")
    private Ville ville;

    @ManyToOne
    @JoinColumn(name = "id_athlete")
    private Athlete athlete;


}