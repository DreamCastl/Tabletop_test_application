
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.ArrayList;
import java.util.Collection;

public class MainMenu {

    public ArrayList<Roster> RosterList  = new ArrayList<>(); //TODO пока пустой



    // метод открывающий меню
    public Runnable Open(){
    //TODO пока отрабатываем только открытие
    AddNewRoster();


        return null; //возвращаем для дебага
    }


    public void AddNewRoster()
        {
            String HTMLSTring = OpenHTMLRoster.GetHtml();

            Roster CurrentRoster = new Roster();
            ParserToRoster.ParsToRoster(CurrentRoster,HTMLSTring);


            this.RosterList.add(CurrentRoster);

            SaveToFile saveToFile = new SaveToFile();
            saveToFile.SaveRosterToFile(CurrentRoster);

        }
}
