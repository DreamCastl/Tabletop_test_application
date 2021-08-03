package HTMLClasses;

import org.jsoup.nodes.Document;

public class HTMLObject {
    public String  Name = "";
    public String Style = "";
    public String Tag = "";

    //Обертка вывода в ростер
    // doc - сам документ в который добавляем
    // родительский тег
    // объект печати - дочерний от HTMLObject - как указать правельно сигнатуру?
    private void AddToHTML(Document doc, String ParentsTag) {

    }

    public String OpenTag() {
        return "<" + Tag + ">";
    }

    public String CloseTag() {
        return "</" + Tag + ">";
    }
}

