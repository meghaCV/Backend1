package com.example.Backend1.topics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface TopicRepo extends JpaRepository<Topic, Long> {
}


