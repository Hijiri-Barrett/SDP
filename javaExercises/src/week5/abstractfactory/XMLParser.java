package week5.abstractfactory;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class XMLParser {

    private String msg;

    public XMLParser(String type) {
        msg = type;
    }

    public String parse() {

        return msg;
    }
}
