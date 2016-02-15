package week5.abstractfactory;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class NYCFactory implements AbstractParserFactory {

    @Override
    public XMLParser getParserInstance(String parserType) {
        return new XMLParser(parserType);
    }
}
