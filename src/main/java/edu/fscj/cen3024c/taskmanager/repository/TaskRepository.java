package edu.fscj.cen3024c.taskmanager.repository;

import edu.fscj.cen3024c.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> { }