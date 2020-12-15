package RBM_backend.REST.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "uzytkownik")
public class Password {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uzytkownik_id;

    private String password;
}
