package edu.fscj.cen3024c.taskmanager.service;

import edu.fscj.cen3024c.taskmanager.dto.UserDTO;
import edu.fscj.cen3024c.taskmanager.entity.User;
import edu.fscj.cen3024c.taskmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    // Save a new user by converting from UserDTO to User entity
    public UserDTO save(UserDTO userDTO) {
        // Convert UserDTO to User entity
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());

        // Save the User entity
        User savedUser = userRepository.save(user);

        // Convert saved User entity back to UserDTO and return
        return convertToDTO(savedUser);
    }

    // Convert User entity to UserDTO
    private UserDTO convertToDTO(User user) {
        // Extract the task IDs from the User's tasks
        Set<Integer> taskIds = user.getTasks().stream()
                .map(task -> task.getId())
                .collect(Collectors.toSet());

        // Return a UserDTO with the task IDs included
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail(), taskIds);
    }
}
