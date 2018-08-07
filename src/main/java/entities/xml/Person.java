package entities.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("TROUBLEMAKER")
public class Person {

    @XStreamAlias("NAME1")
    private String firstName;

    @XStreamAlias("NAME2")
    private String lastName;

    @XStreamAlias("AGE") // String will be auto converted to int value
    private int age;

    @XStreamAlias("NUMBER")
    private String documentNumber;
}