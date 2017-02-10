package tests.rss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Asta on 10.02.2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {

    @XmlElement(name = "title")
    public String title;

    @XmlElement(name = "line")
    public String line;

    @XmlElement(name = "description")
    public String description;
}
