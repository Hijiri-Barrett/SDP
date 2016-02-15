package week5.abstractfactory;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class NYCFactory implements AbstractParserFactory {

    @Override
    public XMLParser getParserInstance(String parserType) {

        if(parserType.equals("NYCORDER")) {

            System.out.println("NYC Parsing order XML...");
            return new XMLParser("NYC Order XML Message");
        }

        return null;
    }
}
