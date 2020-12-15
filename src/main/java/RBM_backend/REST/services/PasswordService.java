package RBM_backend.REST.services;

import RBM_backend.REST.models.Password;
import RBM_backend.REST.repositories.PasswordRepository;
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

        passwordRepository.changePassword(id, newPassword);
    }
}
