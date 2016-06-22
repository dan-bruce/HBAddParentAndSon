import org.hibernate.Session;


public class PersonDaoImpl implements PersonDao {
    public void save(Session sess, Person p) {
        sess.save(p);
    }

    public void delete(Session sess, Person p)
    {
        sess.delete(p);
    }
    public void delete(Session sess , int id)
    {
        sess.delete(sess.get(Person.class , new Integer(id)));
    }
    public void update(Session sess, Person p) {
        sess.update(p);
    }
   
}
