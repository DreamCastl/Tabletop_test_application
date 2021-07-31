
import java.io.*;

public class SaveToFile {


    public  void SaveRosterToFile(Roster Roster)
    {


        String text = Roster.CreateHTMLView(); // строка для записи
        try(FileOutputStream fos=new FileOutputStream("D://TableTop_App//src//main//resources//EditedRoster.html"))
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}


