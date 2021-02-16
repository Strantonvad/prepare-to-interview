package ru.geekbrains.students.dao;

import ru.geekbrains.students.entity.Student;

import java.util.List;

public interface StudentDaoInterface {
  void persist(Student student);

  void delete(Student student);

  void update(Student student);

  void add(Student student);

  Student findById(Long id);

  List<Student> findAll();
}
