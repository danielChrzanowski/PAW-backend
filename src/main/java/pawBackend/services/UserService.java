package pawBackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pawBackend.model.User;
import pawBackend.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

/*    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }*/

    public void changePassword(User user) {
        int id = user.getUzytkownik_id();
        String newPassword = user.getPassword();

        userRepository.changePassword(id, newPassword);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userRepository.findByLogin(login);
        if (user != null) {
            return user;
        }
        throw new UsernameNotFoundException("Nie znaleziono użytkownika: " + login);
    }
}
