package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * The Spring Jdbc Repository.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 21 May 2023 - 19:13:07
 *
 */
@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static final String INSERT_QUERY =
            """
                insert into course (id, name, author)
                values(1, 'Learn AWS','in28minutes');
            """;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }

}
