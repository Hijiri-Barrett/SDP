package week5.abstractfactory;

/**
 * Created by Hijiri on 15/02/2016.
 */
public interface AbstractParserFactory {

    public XMLParser getParserInstance(String parserType);
}
