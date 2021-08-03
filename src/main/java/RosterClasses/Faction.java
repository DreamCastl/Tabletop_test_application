package RosterClasses;

import HTMLClasses.HTMLObject;

public class Faction extends HTMLObject {
    Factions Value;


    public Faction(String FactionName){
    this.Name = "faction:"; // потом стереть ибо не нужно
    this.Style = "";
    this.Tag = "faction";
    this.Value = Factions.Eldar; //TODO getter from fraction

    }
    public Factions GetValue() { return this.Value;}
    public String GetStringValue() { return this.Value.toString();}
}

