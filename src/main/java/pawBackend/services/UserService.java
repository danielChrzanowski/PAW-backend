package pawBackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pawBackend.model.User;
import pawBackend.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //Znajdź wszystkich użytkowników
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    //Znajdź użytkownika po id
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    //Znajdź użytkownika po loginie
    public User getUserByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    //Dodaj użytkownika
    public void addUser(User user) {
        userRepository.save(user);
    }

    //Usuń użytkownika
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }


}
