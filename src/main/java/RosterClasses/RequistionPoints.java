package RosterClasses;

import HTMLClasses.HTMLObject;

public class RequistionPoints extends HTMLObject {
    int Value = 0;

    public RequistionPoints(int value) {
        this.Value = value;
        this.Name = "RP";
        this.Tag = "RequistionPoints";
    }
    public int GetValue(){return this.Value;}

    public String GetStringValue(){return Integer.toString(this.Value);}
}