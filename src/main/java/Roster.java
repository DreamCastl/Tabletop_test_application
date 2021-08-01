import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;

public class Roster {
    public String NameRoster = "";
    public String Faction ="";
    public int PowerLevel = 0;
    public int RP = 0;
    public String HTMlView ="";
    public ArrayList<Unit> Units = new ArrayList<>();

    public String CreateHTMLView() {

        Document doc = Jsoup.parse("<html></html>");

        doc.body().addClass("TableToRoster");

        doc.body().appendElement("div");

        doc.head().appendElement("style");

        Element style = doc.select("style").first();
        style.append("div powerlevel {font-size: 25px;}");

        Element div = doc.select("div").first();
        div.append("<PowerLevel>" +"Power Level:" + PowerLevel + "</PowerLevel>");

        this.HTMlView = doc.toString();
    return this.HTMlView;}


}
