import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;

public class Roster extends HTMLObject{
    public String NameRoster = "";
    public Factions Faction;
    public static PowerLevel PowerLevel = new PowerLevel();
    public RequistionPoints RP;
    public String HTMlView ="";
    public ArrayList<Unit> Units = new ArrayList<>();

    public Roster()
    {
        this.Name = "Roster";
        this.Style = "";
        this.Tag = "TableToRoster";
    }
    public static int GetPowerLevel() {
        return PowerLevel.Value;
    }
}
