package ru.geekbrains.students;

import org.hibernate.Session;
import ru.geekbrains.students.dao.StudentDAOImpl;
import ru.geekbrains.students.dao.StudentDaoInterface;
import ru.geekbrains.students.entity.Student;
import ru.geekbrains.students.util.HibernateSessionFactory;

public class StudentsApplication {

  public static void main(String[] args) {
    final int MIN_MARK = 1;
    final int MAX_MARK = 5;

    Session session = HibernateSessionFactory.getSessionFactory().openSession();
    StudentDaoInterface studentDao = new StudentDAOImpl(session);

    for (int i = 0; i < 1000; i++) {
      Student student = new Student("student" + i,
          MIN_MARK + (int)(Math.random() * ((MAX_MARK - MIN_MARK) + 1)));
      studentDao.persist(student);
    }

    System.out.println(studentDao.findAll());

    Student student = studentDao.findById(555L);
    String studentsName = studentDao.findById(555L).getName();
    System.out.println(student);
    System.out.println(studentsName);

    studentDao.delete(student);

    System.out.println(studentDao.findById(555L));

    student = studentDao.findById(444L);
    student.setMark(5);
    studentDao.update(student);
    System.out.println(studentDao.findById(444L).getMark());
  }

}
