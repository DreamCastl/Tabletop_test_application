package HTMLClasses;

import org.jetbrains.annotations.NotNull;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OpenHTMLRoster {


    public static String GetHtml() {
        String content = "";

        try {
            String Path_To_File = OpenFile();
            BufferedReader in;
            String str;
            for(in = new BufferedReader(new FileReader(Path_To_File)); (str = in.readLine()) != null; content = content + str) {
            }

            in.close();
            return content;
        } catch (IOException var3) {
            return "";
        }
    }

    //TODO возвращает путь к файлу указанный пользователем
    private static String OpenFile() {
        return "D://TableTop_App//src//main//resources//Roster.html";
    }

}
