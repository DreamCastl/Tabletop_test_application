package ParserClasses;

import RosterClasses.*;
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
        Roster.Faction = Get_Faction(doc);
        Roster.PowerLevel = Get_PowerLevel(doc);
        Roster.RP = Get_RP(doc);


        //TODO основной парсер юнитов, разбить по ролям?...
        //Unit First = new Unit("First unit");  //тестовый
        //Roster.Units.add(First);

    }


    private static PowerLevel Get_PowerLevel(Document doc) {
        String PowerLevel = doc.body().getElementsByTag("RosterClasses.PowerLevel").text();
        if (PowerLevel.equals("")) {
            String StringToParse = doc.body().getElementsByTag("h2").text();
            PowerLevel = StringToParse.substring(StringToParse.lastIndexOf("[") + 1, StringToParse.lastIndexOf("PL") - 1);
        }

        return new PowerLevel(Integer.parseInt(PowerLevel));
    }

       private static RequistionPoints Get_RP(Document doc) {
           String RP = doc.body().getElementsByTag("REQUISITIONPOINTS").text();
           if (RP.equals("")) {
               RP = "5";
           }
           return new RequistionPoints(Integer.parseInt(RP));
       }

    private static Faction Get_Faction(Document doc) {
        String FactionString = doc.body().getElementsByTag("RosterClasses.Faction").text();
        if (FactionString.equals("")) {
            String StringToParse = doc.body().getElementsByTag("h2").text();
            FactionString = StringToParse.substring(StringToParse.lastIndexOf("(") + 1, StringToParse.lastIndexOf(")"));
        }
        return new Faction(FactionString) ; //RosterClasses.Faction
    }

    private static String Get_Roster_name(@NotNull Document doc) {
        String Result = doc.body().getElementsByTag("h1").text();
        return Result.equals("") ? "" : doc.body().getElementsByTag("h1").text();
    }
}



