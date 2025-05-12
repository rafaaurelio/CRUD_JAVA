package crud_users.com.services;

import crud_users.com.models.User;
import org.springframework.stereotype.Service;
import crud_users.com.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User getUser(Long id){
        return this.userRepository.getUser(id);
    }

    public List<User> getUsers(){
        return this.userRepository.getUsers();
    }

    public User createUser(User user){
        return this.userRepository.createUser(user);
    }

    public void deleteUser(Long id){
        this.userRepository.deleteUser(id);
    }

    public User updateUser(Long id, User user){
        return this.userRepository.updateUser(id, user);
    }
}
