import org.hibernate.Session;


public class SonDaoImpl implements SonDao {
    public void save(Session sess, Son p) {
        sess.save(p);
    }

    public void delete(Session sess, Son p)
    {
        sess.delete(p);
    }
    public void delete(Session sess , int id)
    {
        sess.delete(sess.get(Son.class , new Integer(id)));
    }
    public void update(Session sess, Son p) {
        sess.update(p);
    }
   
}
