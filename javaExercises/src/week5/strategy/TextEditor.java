package week5.strategy;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class TextEditor {

    private TextFormatter formatter;

    public TextEditor(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void publishText(String text) {
        System.out.println(formatter.format(text));
    }
}
