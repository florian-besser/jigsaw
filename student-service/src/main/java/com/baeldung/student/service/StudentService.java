package com.baeldung.student.service;

import com.baeldung.student.model.Student;

public interface StudentService {

    String create(Student student);

    Student read(String registrationId);

    Student update(Student student);

    String delete(String registrationId);
}