package week5.strategy;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class LowerTextFormatter implements TextFormatter {

    @Override
    public void format(String text) {
        text.toLowerCase();
    }
}