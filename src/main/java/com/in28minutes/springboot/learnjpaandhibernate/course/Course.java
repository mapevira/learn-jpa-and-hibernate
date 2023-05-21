package com.in28minutes.springboot.learnjpaandhibernate.course;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The course class.
 *
 * @author architecture - raulp
 * @since Java 1.17
 * @version 21 May 2023 - 19:24:23
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private long id;
    private String name;
    private String author;

}
