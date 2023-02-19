
import entity.Department;
import entity.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HibernateTest {

    public static void main(String[] args) {

//        Session session = HibernateUtil.getSessionFactory().openSession();

        Configuration configuration = new Configuration();
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            System.out.println("db connected");


            session.beginTransaction();
            Department department = new Department("java");
            session.save(department);
            session.save(new Employee("Jakab Gipsz", department));
            session.save(new Employee("Captain Nemo", department));

            session.getTransaction().commit();
            Query q = session.createQuery("From Employee ");

            List<Employee> resultList = q.list();
            System.out.println("num of employess:" + resultList.size());
            for (Employee next : resultList) {
                System.out.println("next employee: " + next);
            }
        }
    }

}
