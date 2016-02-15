package week5.abstractfactory;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class ParserFactoryProducer {

    public static AbstractParserFactory getFactory(String type) {

        if(type.equals("NYCFactory")) { return new NYCFactory(); }

        if(type.equals("LondonFactory")) { return new LondonFactory(); }

        return null;
    }
}
