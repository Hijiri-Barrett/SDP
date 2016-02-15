package week5.composite;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class HtmlElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String body;
    private String endTag;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        endTag = tag;
    }

    @Override
    public void generateHtml() {
        System.out.print(startTag);
        System.out.print(body);
        System.out.print(endTag + "\n");

    }

    @Override
    public void setTagBody(String tagBody) {
        body = tagBody;
    }
}
