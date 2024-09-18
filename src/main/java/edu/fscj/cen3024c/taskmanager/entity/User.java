package edu.fscj.cen3024c.taskmanager.entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users") // Assuming you've renamed the table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "username", nullable = false, length = 255)
    private String username;

    @Column(name = "email", nullable = false, length = 255, unique = true)
    private String email;

    @ManyToMany(mappedBy = "users")
    private Set<Task> tasks = new HashSet<>();  // Initialize with an empty set

    // Constructors, getters, and setters

    public User() {
        // Default constructor
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.tasks = new HashSet<>();  // Ensure tasks is initialized
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }
}
