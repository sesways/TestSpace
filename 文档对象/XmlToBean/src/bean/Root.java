/**
 * @Project Name:XmlToBean
 * @Package Name:bean
 */
package bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @Description:
 * @Author: ZC
 * @Email: chao_actor@163.com
 * @data: 2018/9/18 14:35
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Root {
    @XmlElement(name = "girl")
    private List<Girl> girls;

    public List<Girl> getGirls() {
        return girls;
    }

    public void setGirls(List<Girl> girls) {
        this.girls = girls;
    }

    @Override
    public String toString() {
        return "Root{" +
                "girls=" + girls +
                '}';
    }
}
