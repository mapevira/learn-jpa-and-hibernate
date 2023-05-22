package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * The Course Jdbc Command Line Runner.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 21 May 2023 - 19:17:49
 *
 */
@Slf4j
@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    private static final String IN28MINUTES = "in28minutes";

    // @Autowired
    // private CourseJdbcRepository repository;
    
    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS Jpa!", IN28MINUTES));
        repository.insert(new Course(2, "Learn Azure Jpa!", IN28MINUTES));
        repository.insert(new Course(3, "Learn DevOps Jpa!", IN28MINUTES));

        repository.deleteById(1);
        if (log.isInfoEnabled()) {
            log.info(repository.findById(2).toString());
            log.info(repository.findById(3).toString());
        }
        
    }

}
