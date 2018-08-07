package entities.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import entities.xml.Person;

@XStreamAlias("BAN") // another mapping
public class Ban {

    /*
     We want to have different field names in Java classes so
     we define what element should be mapped to each field
    */
    @XStreamAlias("UPDATED_AT") //
    private String dateOfUpdate;

    @XStreamAlias("TROUBLEMAKER")
    private Person person;
}
