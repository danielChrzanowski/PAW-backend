package RBM_backend.services;

import RBM_backend.model.Password;
import RBM_backend.repositories.PasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {
    @Autowired
    PasswordRepository passwordRepository;

    public Password passwordById(int id) {
        return passwordRepository.findById(id);
    }

    public void changePassword(Password password) {
        int id = password.getUzytkownik_id();
        String newPassword = password.getPassword();
        System.out.println("DATA: " + id + " " + newPassword);

        passwordRepository.changePassword(id, newPassword);
    }
}
