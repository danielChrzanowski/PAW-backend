package RBM_backend.junctionTables.models;

import RBM_backend.tables.models.Dish;
import RBM_backend.tables.models.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "zamowienie_danie")
public class OrderDish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer zamowienie_danie_id;

    @ManyToOne
    @JoinColumn(name="zamowienie_id")
    private Order zamowienie;

    @ManyToOne
    @JoinColumn(name="danie_id")
    private Dish danie;

}
