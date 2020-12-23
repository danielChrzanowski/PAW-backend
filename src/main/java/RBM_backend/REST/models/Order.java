package RBM_backend.REST.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
    List<Dish> dania;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer zamowienie_id;
    @ManyToOne
    @JoinColumn(name = "uzytkownik_id")
    private User uzytkownik;
    private String data, stan, adres, telefon;
    private double suma_cen;
}
