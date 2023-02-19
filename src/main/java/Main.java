import entity.User;
import form.FrmLogin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FrmLogin frmLogin = new FrmLogin(null);
//        frmLogin.setVisible(true);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(User.class);
        configuration.configure();

        try(SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession()){
            System.out.println("db connected");
            session.beginTransaction();

            User user = User.builder()
                    .iin("1234560789012")
                    .surname("Petrov")
                    .firstname("Ivan")
                    .patronymic("Ivanovich")
                    .password("123")
                    .build();
            session.save(user);
            session.getTransaction().commit();
        }
    }
}