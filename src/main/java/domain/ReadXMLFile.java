package domain;

import com.thoughtworks.xstream.XStream;
import entities.xml.Ban;
import entities.xml.Data;
import entities.xml.Person;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadXMLFile {


    public static void main(String[] args) {

        FileReader reader = null;  // load file
        try {
            reader = new FileReader("\\resources\\xml\\example.xml");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        XStream xstream = new XStream();
        xstream.processAnnotations(Data.class);     // inform XStream to parse annotations in Data class
        xstream.processAnnotations(Ban.class);      // and in two other classes...
        xstream.processAnnotations(Person.class);   // we use for mappings



    }

}

