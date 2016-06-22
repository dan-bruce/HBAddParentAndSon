import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static Configuration                  cfg;
    private static StandardServiceRegistry        sr;
    private static SessionFactory                 sf;
    private static StandardServiceRegistryBuilder srb;
    private static Session                        session;

    public static Session currentSession() throws Exception {

        cfg = new Configuration().configure();
        srb = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties());
        sr = srb.build();
        sf = cfg.buildSessionFactory(sr);
        session = sf.openSession();
        return session;
    }

    public static void closeSession() {
        session.close();
        sf.close();
    }

}
