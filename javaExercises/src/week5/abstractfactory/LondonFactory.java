package week5.abstractfactory;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class LondonFactory implements AbstractParserFactory {

    @Override
    public XMLParser getParserInstance(String parserType) {

        if(parserType.equals("LondonFEEDBACK")) {

            System.out.println("London Parsing feedback XML...");
            return new XMLParser("London Feedback XML Message");
        }

        return null;
    }
}
