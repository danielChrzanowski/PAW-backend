package RBM_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "uzytkownik")
public class LoggedUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uzytkownik_id;

    private String imie, nazwisko, email;

    private boolean czy_pracownik;

}
