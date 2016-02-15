package week5.composite;

import java.util.List;
import java.util.LinkedList;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class HtmlParentElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private List<HtmlTag> nestedHtml = new LinkedList<>();
    private String endTag;

    public HtmlParentElement(String tagName) {
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
        System.out.println(startTag);

        for(HtmlTag tag : nestedHtml) {
            tag.generateHtml();
        }

        System.out.println(endTag);
    }

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        nestedHtml.add(htmlTag);
    }
}
