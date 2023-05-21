package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

/**
 * The Course Jdbc Command Line Runner.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 21 May 2023 - 19:17:49
 *
 */
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    private static final String IN28MINUTES = "in28minutes";

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS Now!", IN28MINUTES));
        repository.insert(new Course(2, "Learn Azure Now!", IN28MINUTES));
        repository.insert(new Course(3, "Learn DevOps Now!", IN28MINUTES));

        repository.deleteById(1);
    }

}
