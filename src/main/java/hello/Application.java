package hello;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try{

            Student student = new Student("Stephanie", "Chen", "yoyoyo@gmail.com");
            session.beginTransaction();
            session.save(student);
            Student tempStudent = session.get(Student.class, student.getId());
            System.out.println(tempStudent);

            session.getTransaction().commit();

        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            sessionFactory.close();
        }
    }

}