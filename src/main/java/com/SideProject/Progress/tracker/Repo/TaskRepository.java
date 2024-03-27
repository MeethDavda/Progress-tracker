package com.SideProject.Progress.tracker.Repo;

import com.SideProject.Progress.tracker.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task,String> {
     List<Task> findByName(String name);
}
