package com.eddypepy.ci.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.eddypepy.ci.domain.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
}