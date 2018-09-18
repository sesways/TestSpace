/**
 * @Project Name:XmlToBean
 * @Package Name:bean
 */
package bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @Description:
 * @Author: ZC
 * @Email: chao_actor@163.com
 * @data: 2018/9/18 14:33
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Girl {
    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "cup")
    private String cap;

    @XmlElement(name = "age")
    private int age;

    public Girl() {
    }

    public Girl(String name, String cap, int age) {
        this.name = name;
        this.cap = cap;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", cap=" + cap +
                ", age=" + age +
                '}';
    }
}
