import java.io.FileWriter;
import java.io.IOException;

public class RedactFile {
    
    public static void WrFile(String name, String allData){
        try(FileWriter writer = new FileWriter(name + ".txt", true))
        {
            String text = allData;
            writer.write(text);
            writer.append('\n');
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
    }
}
