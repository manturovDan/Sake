package man.dan.robot;

import io.vavr.Tuple3;

import javax.management.modelmbean.XMLParseException;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.InputStream;
import java.util.HashSet;

public class Maze {
    protected InputStream mazeStreamXML;
    protected HashSet<Passage> way;
    protected Tuple3<Integer, Integer, Integer> robot;

    public Maze(InputStream ms) throws Exception {
        mazeStreamXML = ms;

        XMLInputFactory xmlIF = XMLInputFactory.newInstance();
        XMLEventReader reader = xmlIF.createXMLEventReader(mazeStreamXML);

        boolean inMaze = false;
        boolean inSpaces = false;

        while (reader.hasNext()) {
            XMLEvent nextEvent = reader.nextEvent();
            if (nextEvent.isStartElement()) {
                StartElement startElement = nextEvent.asStartElement();
                if (startElement.getName().getLocalPart().equals("maze"))
                    inMaze = true;
                else if (startElement.getName().getLocalPart().equals("robot") && inMaze) {
                    if (robot != null)
                        throw new XMLParseException("there must be only one robot");

                    robot = new Tuple3<>(getIntFromArg(startElement, "X"), getIntFromArg(startElement, "Y"), getIntFromArg(startElement, "Z"));
                }
                else if (startElement.getName().getLocalPart().equals("spaces") && inMaze) {
                    inSpaces = true;
                    way = new HashSet<>();
                } else if (inMaze && inSpaces) {
                    if (startElement.getName().getLocalPart().equals("passage")) {
                        way.add(new Passage(getIntFromArg(startElement, "X"), getIntFromArg(startElement, "Y"), getIntFromArg(startElement, "Z")));
                    }
                    else if (startElement.getName().getLocalPart().equals("portal")) {
                        way.add(new Passage(getIntFromArg(startElement, "X"), getIntFromArg(startElement, "Y"), getIntFromArg(startElement, "Z"), true));
                    }
                    else
                        throw new XMLParseException("wrong XML tag");
                }
                else
                    throw new XMLParseException("wrong XML structure");
            }
        }
    }

    protected Integer getIntFromArg(StartElement startElement, String arg) {
        return Integer.parseInt(startElement.getAttributeByName(new QName(arg)).getValue());
    }
}
