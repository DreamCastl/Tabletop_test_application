package RosterClasses;

import HTMLClasses.HTMLObject;

public class PowerLevel extends HTMLObject {
    int Value = 0;

    public PowerLevel(int value) {
        this.Value = value;
        this.Name = "PL";
        this.Tag = "PowerLevel";
    }
    public int GetValue(){return this.Value;}
    public String GetStringValue(){return Integer.toString(this.Value);}
}
