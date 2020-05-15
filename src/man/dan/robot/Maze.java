package man.dan.robot;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.InputStream;

public class Maze {
    protected InputStream mazeStreamXML;

    public Maze(InputStream ms) throws Exception {
        mazeStreamXML = ms;

        XMLInputFactory xmlIF = XMLInputFactory.newInstance();
        XMLEventReader reader = xmlIF.createXMLEventReader(mazeStreamXML);

        while (reader.hasNext()) {
            XMLEvent nextEvent = reader.nextEvent();
            if (nextEvent.isStartElement()) {
                StartElement startElement = nextEvent.asStartElement();
                if (startElement.getName().getLocalPart().equals("maze")) {
                    System.out.println("MAZE");
                }
            }
        }
    }
}
