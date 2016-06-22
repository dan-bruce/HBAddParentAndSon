import org.hibernate.Session;

public interface SonDao extends Dao {
    void save(Session sess, Son p);

    void delete(Session sess, Son p);

    void delete(Session sess, int id);

    void update(Session sess, Son p);
}
