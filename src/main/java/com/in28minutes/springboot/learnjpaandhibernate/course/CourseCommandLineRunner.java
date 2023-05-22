package com.in28minutes.springboot.learnjpaandhibernate.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.srpingdatajpa.CourseSpringDataJpaRepository;

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

    //@Autowired
    //private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS Jpa!", IN28MINUTES));
        repository.save(new Course(2, "Learn Azure Jpa!", IN28MINUTES));
        repository.save(new Course(3, "Learn DevOps Jpa!", IN28MINUTES));
        repository.save(new Course(4, "Learn Docker Jpa!", "pvraul1"));

        repository.deleteById(1L);

        if (log.isInfoEnabled()) {
            log.info(repository.findById(2L).toString());
            log.info(repository.findById(3L).toString());
        }

        List<Course> courses = repository.findAll();
        courses.stream().forEach(o -> {
            if (log.isInfoEnabled()) {
                log.info(o.toString());
            }
        });

        courses = repository.findByAuthor(IN28MINUTES);
        courses.stream().forEach(o -> {
            if (log.isInfoEnabled()) {
                log.info(o.toString());
            }
        });

    }

}
