package RBM_backend.REST.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "zamowienie")
public class Order {
    @ManyToMany
    @JoinTable(
            name = "zamowienie_danie",
            joinColumns = @JoinColumn(name = "zamowienie_id"),
            inverseJoinColumns = @JoinColumn(name = "danie_id"))
    Set<Dish> dania = new HashSet<>();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer zamowienie_id;
    private Integer uzytkownik_id;
    private String data, stan;
    private double suma_cen;
}
