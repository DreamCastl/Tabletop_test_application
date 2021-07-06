//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String HTMLSTring = GetHtml();
        Document html = Jsoup.parse(HTMLSTring);
        String title = html.title();
        String h1 = html.body().getElementsByTag("h1").text();
        System.out.println("Input HTML String to JSoup :" + HTMLSTring);
        System.out.println("After parsing, Title : " + title);
        System.out.println("After parsing, Heading : " + h1);
    }

    public static String GetHtml() {
        String content = "";

        try {
            BufferedReader in;
            String str;
            for(in = new BufferedReader(new FileReader("D:/Roster.html")); (str = in.readLine()) != null; content = content + str) {
            }

            in.close();
            return content;
        } catch (IOException var3) {
            return "";
        }
    }
}
