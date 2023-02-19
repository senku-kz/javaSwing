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
        configuration.configure();

        try(SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession()){
            System.out.println("db connected");
        }
    }
}