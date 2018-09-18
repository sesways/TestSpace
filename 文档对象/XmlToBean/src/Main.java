import bean.Root;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {

    public static void main(String[] args) throws JAXBException {
        File file = new File("out/production/XmlToBean/xmls/Girls.xml");
        JAXBContext context = JAXBContext.newInstance(Root.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Root o =(Root) unmarshaller.unmarshal(file);
        System.out.println(o);
    }
}
