package HTMLClasses;

import RosterClasses.Roster;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


/* Класс формирующий вывод HTML строку*/
public class HTMLView {

    public String CreateHTMLView(Roster Roster) {

        Document doc = Jsoup.parse("<html></html>");
        // Название добавляем отдельно остальное циклом
        AddName(doc,Roster);
        return doc.toString();
    }


    //вот куда правельно поместить?
    private void AddName(Document doc,Roster Roster) {
        doc.body().addClass("TableTop_APP"); //Добавление основного класса
        doc.body().appendElement(Roster.Tag);
        doc.head().appendElement("style");

        Element style = doc.select("style").first();
        style.append(Roster.Tag + " " + Roster.Style);

        Element div = doc.select(Roster.Tag).first();
        div.append(Roster.OpenTag() + Roster.NameRoster + Roster.CloseTag());
    }
}


