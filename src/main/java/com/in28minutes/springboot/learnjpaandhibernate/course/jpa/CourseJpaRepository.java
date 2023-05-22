package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

/**
 * The course JPA repository.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 22 May 2023 - 18:21:17
 *
 */
@Transactional
@Repository
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

}
