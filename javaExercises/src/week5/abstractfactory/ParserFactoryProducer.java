package week5.abstractfactory;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class ParserFactoryProducer {

    public static AbstractParserFactory getFactory(String type) {
        return new NYCFactory();
    }
}
