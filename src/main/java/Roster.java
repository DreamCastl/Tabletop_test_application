import java.util.ArrayList;

public class Roster {
    public String NameRoster = "";
    public String Faction ="";
    public int PowerLevel = 0;
    public int RP = 0;
    public String HTMlView ="";
    public ArrayList<Unit> Units = new ArrayList<>();

    public String CreateHTMLView() {
        String Result = "";
        this.HTMlView = Result;
    return this.HTMlView;}


}
