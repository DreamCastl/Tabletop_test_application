import org.jetbrains.annotations.NotNull;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

// Заполняет класс Roster из HTML
public class ParserToRoster {

    public static void ParsToRoster(Roster Roster,String html)
    {
        Document doc = Jsoup.parse(html);

        //TODO Геты пишут в конец + отстствует стиль!!!!
        Roster.NameRoster = Get_Roster_name(doc);
        Roster.Faction = Get_Faction(doc);
        Roster.PowerLevel = Get_PowerLevel(doc);
        Roster.RP = Get_RP(doc);
        Roster.HTMlView = doc.html();

        //TODO основной парсер юнитов, разбить по ролям?...
        Unit First = new Unit("First unit");  //тестовый
        Roster.Units.add(First);

    }

    private static int Get_PowerLevel(Document doc) {
        String PowerLevel = doc.body().getElementsByTag("PowerLevel").text();
        if (PowerLevel.equals("")) {
            String StringToParse = doc.body().getElementsByTag("h2").text();
            PowerLevel = StringToParse.substring(StringToParse.lastIndexOf("[") + 1, StringToParse.lastIndexOf("PL") - 1);
            Element div = doc.select("li").first();
            div.append("<PowerLevel>" + PowerLevel + "</PowerLevel>");

        }


        return Integer.parseInt(PowerLevel);
    }

    private static int Get_RP(Document doc) {
        String RP = doc.body().getElementsByTag("REQUISITIONPOINTS").text();
        if (RP.equals("")) {
            RP = "5";
            Element div = doc.select("li").first();
            div.append("<REQUISITIONPOINTS>" + RP + "</REQUISITIONPOINTS>");
        }

        return Integer.parseInt(RP);
    }

    private static String Get_Faction(Document doc) {
        String Faction = doc.body().getElementsByTag("Faction").text();
        if (Faction.equals("")) {
            String StringToParse = doc.body().getElementsByTag("h2").text();
            Faction = StringToParse.substring(StringToParse.lastIndexOf("(") + 1, StringToParse.lastIndexOf(")"));
            Element div = doc.select("li").first();
            div.append("<Faction>" + Faction + "</Faction>");
        }

        return Faction;
    }

    private static String Get_Roster_name(@NotNull Document doc) {
        String Result = doc.body().getElementsByTag("h1").text();
        return Result.equals("") ? "" : doc.body().getElementsByTag("h1").text();
    }
}



