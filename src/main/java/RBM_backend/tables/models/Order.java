package RBM_backend.tables.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "zamowienie")
/*
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "zamowienie_id")*/
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer zamowienie_id;

    private Integer uzytkownik_id;

    private String data, stan;

    private double suma_cen;

   // @JsonBackReference
    @ManyToMany
    @JoinTable(
            name = "zamowienie_danie",
            joinColumns = @JoinColumn(name = "zamowienie_id"),
            inverseJoinColumns = @JoinColumn(name = "danie_id"))
    Set<Dish> dishes=new HashSet<>();
}
