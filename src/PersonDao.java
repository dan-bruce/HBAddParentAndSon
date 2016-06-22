import org.hibernate.Session;

interface Dao {

}

public interface PersonDao extends Dao {
    void save(Session sess, Person p);

    void delete(Session sess, Person p);

    void delete(Session sess, int id);

    void update(Session sess, Person p);
}

