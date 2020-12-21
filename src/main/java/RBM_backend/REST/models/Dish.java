package RBM_backend.REST.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "danie")

public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer danie_id;
    private String nazwa, skladniki, kategoria;
    private Double cena;
    private Integer kalorie;
    private byte[] zdjecie;
}
