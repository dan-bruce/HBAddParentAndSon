import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class AppFactory {
    private Map<String, Object> appMap = new HashMap<String, Object>();
    private static AppFactory   df;

    private AppFactory() throws Exception {
        Document doc = new SAXReader()
                .read(new File(
                        "E:\\Lidong\\WebDevelopment\\HBAddParentAndSon\\WEB-INF\\classes\\appContext.xml"));

        Element root = doc.getRootElement();

        List el = root.elements();
        for (Iterator it = el.iterator(); it.hasNext();) {

            Element em = (Element) it.next();
            String id = em.attributeValue("id");

            String impl = em.attributeValue("class");

            Class implClazz = Class.forName(impl);
            Object d = implClazz.newInstance();
            appMap.put(id, d);
        }
    }

    public static AppFactory instance() throws Exception {
        if (df == null) {
            df = new AppFactory();

        }
        return df;
    }

    public Object getApp(String id) {
        return appMap.get(id);
    }

}
