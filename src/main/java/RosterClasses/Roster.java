package RosterClasses;

import HTMLClasses.HTMLObject;
import RosterClasses.Factions;
import RosterClasses.PowerLevel;
import RosterClasses.RequistionPoints;

import java.util.ArrayList;

public class Roster extends HTMLObject {
    public String NameRoster = "";
    public Faction Faction;
    public static RosterClasses.PowerLevel PowerLevel;
    public RequistionPoints RP;
    public String HTMlView ="";
    public ArrayList<Unit> Units = new ArrayList<>();

    public Roster()
    {
        this.Name = "Name";
        this.Style = "{font-size: 25px;}";
        this.Tag = "Roster";
    }
}
