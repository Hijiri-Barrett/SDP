package week5.strategy;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class LowerTextFormatter implements TextFormatter {

    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
