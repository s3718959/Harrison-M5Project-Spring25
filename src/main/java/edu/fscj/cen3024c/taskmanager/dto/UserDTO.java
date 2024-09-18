package edu.fscj.cen3024c.taskmanager.dto;

import java.util.Set;

public class UserDTO {

    private Integer id;
    private String username;
    private String email;
    private Set<Integer> taskIds;  // Task IDs for the user's tasks

    public UserDTO() {}

    public UserDTO(Integer id, String username, String email, Set<Integer> taskIds) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.taskIds = taskIds;
    }

    // Getters and Setters
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

    public Set<Integer> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(Set<Integer> taskIds) {
        this.taskIds = taskIds;
    }
}
