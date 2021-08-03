package ParserClasses;

import RosterClasses.Roster;
import RosterClasses.Unit;
import org.jetbrains.annotations.NotNull;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

// Заполняет класс RosterClasses.Roster из HTML
public class ParserToRoster {

    public static void ParsToRoster(Roster Roster, String html)
    {
        Document doc = Jsoup.parse(html);

        //TODO Геты пишут в конец + отстствует стиль!!!!
        Roster.NameRoster = Get_Roster_name(doc);
    /*    RosterClasses.Roster.RosterClasses.Faction = Get_Faction(doc);
        RosterClasses.Roster.RosterClasses.PowerLevel = Get_PowerLevel(doc);
        RosterClasses.Roster.RP = Get_RP(doc);
    */

        //TODO основной парсер юнитов, разбить по ролям?...
        //Unit First = new Unit("First unit");  //тестовый
        //Roster.Units.add(First);

    }

    /*
    private static int Get_PowerLevel(Document doc) {
        String RosterClasses.PowerLevel = doc.body().getElementsByTag("RosterClasses.PowerLevel").text();
        if (RosterClasses.PowerLevel.equals("")) {
            String StringToParse = doc.body().getElementsByTag("h2").text();
            RosterClasses.PowerLevel = StringToParse.substring(StringToParse.lastIndexOf("[") + 1, StringToParse.lastIndexOf("PL") - 1);
        }


        return Integer.parseInt(RosterClasses.PowerLevel);
    }

    private static int Get_RP(Document doc) {
        String RP = doc.body().getElementsByTag("REQUISITIONPOINTS").text();
        if (RP.equals("")) {
            RP = "5";
        }
        return Integer.parseInt(RP);
    }

    private static String Get_Faction(Document doc) {
        String RosterClasses.Faction = doc.body().getElementsByTag("RosterClasses.Faction").text();
        if (RosterClasses.Faction.equals("")) {
            String StringToParse = doc.body().getElementsByTag("h2").text();
            RosterClasses.Faction = StringToParse.substring(StringToParse.lastIndexOf("(") + 1, StringToParse.lastIndexOf(")"));
        }

        return RosterClasses.Faction.RosterClasses.Factions.Eldar ; //RosterClasses.Faction
    }
    */
    private static String Get_Roster_name(@NotNull Document doc) {
        String Result = doc.body().getElementsByTag("h1").text();
        return Result.equals("") ? "" : doc.body().getElementsByTag("h1").text();
    }
}



