package com.in28minutes.springboot.learnjpaandhibernate.course.srpingdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

/**
 * The srping data JPA repository.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 22 May 2023 - 20:17:52
 *
 */
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);

}
