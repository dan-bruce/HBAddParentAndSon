import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonServiceImpl implements PersonService {
    public void createPersonAndSon(String name, String gender,
            String[] sonNames,
            int[] sonAges) throws Exception {
        try
        {
            PersonDao pd = (PersonDao) DaoFactory.instance()
                    .getDao("personDao");
            SonDao sd = (SonDao) DaoFactory.instance().getDao("sonDao");

            Session s = HibernateUtil.currentSession();
            Transaction tx = s.beginTransaction();

            Person p = new Person();
            p.setName(name);
            p.setGender(gender);
            pd.save(s, p);

            for (int i = 0; i < sonNames.length; i++) {
                Son son = new Son(sonNames[i], sonAges[i]);
                son.setParent(p);
                sd.save(s, son);
            }

            tx.commit();
            HibernateUtil.closeSession();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
