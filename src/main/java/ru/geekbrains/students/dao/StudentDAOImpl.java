package ru.geekbrains.students.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.geekbrains.students.entity.Student;

import java.util.List;

public class StudentDAOImpl implements StudentDaoInterface{

  private final Session currentSession;

  @Override
  public void persist(Student student) {
    add(student);
  }

  @Override
  public void add(Student student) {
    Transaction transaction = currentSession.beginTransaction();
    currentSession.saveOrUpdate(student);
    transaction.commit();
  }

  @Override
  public void delete(Student student) {
    Transaction transaction = currentSession.beginTransaction();
    currentSession.remove(student);
    transaction.commit();
  }

  @Override
  public void update(Student student) {
    add(student);
  }

  @Override
  public Student findById(Long id) {
    return currentSession.get(Student.class, id);
  }

  @Override
  public List<Student> findAll() {
    return (List<Student>) currentSession.createQuery("from Student").list();
  }

  public StudentDAOImpl(Session session) {
    this.currentSession = session;
  }
}
