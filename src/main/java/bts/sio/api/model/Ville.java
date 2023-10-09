package bts.sio.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Ville")
public class Ville {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="nom")

    private String nom ;

    @ManyToOne
    @JoinColumn(name = "id_Pays")
    private Pays pays;

}