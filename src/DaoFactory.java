import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class DaoFactory {
    private Map<String, Dao>  daoMap = new HashMap<String, Dao>();
    private static DaoFactory df;

    private DaoFactory() throws Exception {
        Document doc = new SAXReader()
                .read(new File(
                        "E:\\Lidong\\WebDevelopment\\HBAddParentAndSon\\WEB-INF\\classes\\daoContext.xml"));

        Element root = doc.getRootElement();

        List el = root.elements();
        for (Iterator it = el.iterator(); it.hasNext();) {

            Element em = (Element) it.next();
            String id = em.attributeValue("id");

            String impl = em.attributeValue("class");

            Class implClazz = Class.forName(impl);
            Dao d = (Dao) implClazz.newInstance();
            daoMap.put(id, d);
        }
    }

    public static DaoFactory instance() throws Exception {
        if (df == null) {
            df = new DaoFactory();

        }
        return df;
    }

    public Dao getDao(String id) {
        return daoMap.get(id);
    }

}
