import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class HTMLView {

        public String CreateHTMLView(Roster Roster) {

            Document doc = Jsoup.parse("<html></html>");

            doc.body().addClass("TableToRoster");

            doc.body().appendElement("div");

            doc.head().appendElement("style");

            Element style = doc.select("style").first();
            style.append("div powerlevel {font-size: 25px;}");

            Element div = doc.select("div").first();
            div.append("<PowerLevel>" +"Power Level:" + Roster.GetPowerLevel() + "</PowerLevel>");

            return doc.toString();
        }
    }

