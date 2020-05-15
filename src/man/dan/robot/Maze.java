package man.dan.robot;

import io.vavr.Tuple3;
import man.dan.errors.SemanticSakeError;
import man.dan.langobj.Rippotai;

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

    protected int robotX = -1;
    protected int robotY = -1;
    protected int robotZ = -1;

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
                    if (robotX > -1)
                        throw new XMLParseException("there must be only one robot");

                    robotX = getIntFromArg(startElement, "X");
                    robotY = getIntFromArg(startElement, "Y");
                    robotZ = getIntFromArg(startElement, "Z");
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

    protected Integer getIntFromArg(StartElement startElement, String arg) throws XMLParseException {
        Integer res = Integer.parseInt(startElement.getAttributeByName(new QName(arg)).getValue());
        if (res < Rippotai.minCoord || res > Rippotai.maxCoord) {
            throw new XMLParseException("Bad coordinates");
        }
        return res;
    }

    protected RoboState RoboState() {
        Passage checkPas = new Passage(robotX, robotY, robotZ, false);
        Passage checkPasPortal = new Passage(robotX, robotY, robotZ, true);

        if (way.contains(checkPas))
            return RoboState.inMotion;

        if(way.contains(checkPasPortal))
            return RoboState.success;

        return RoboState.died;
    }

    public void up() {
        robotZ++;
    }

    public void down() {
        robotZ--;
    }

    public void leftward() {
        robotX++;
    }

    public void rightward() {
        robotX--;
    }

    public void forward() {
        robotY++;
    }

    public void back() {
        robotY--;
    }

    public int rX() {
        return robotX;
    }

    public int rY() {
        return robotY;
    }

    public int rZ() {
        return robotZ;
    }

    public int look_up() {
        int dist = 0;
        Passage mwn = new Passage(robotX, robotY, robotZ);
        mwn.incZ();
        while(isPassage(mwn)) {
            dist++;
            mwn.incZ();
        }

        return dist;
    }

    public int look_down() {
    }

    public int look_left() {
    }

    public int look_right() {
    }

    public int look_forward() {
    }

    public int look_back() {
    }

    protected boolean isPassage(Passage pass) {
        pass.portal = false;
        boolean notPor = way.contains(pass);
        pass.portal = true;
        boolean por = way.contains(pass);
        return por | notPor;
    }
}
