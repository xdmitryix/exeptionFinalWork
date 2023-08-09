import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Instruments {
    

    public static boolean CoutnOfArray(String[] Array){
        int count = 0;
        for (int i = 0; i < Array.length; i++) {
            count++;
        }
        if (count==6) {
            return true;
        }else{
        return false;
        }
    }

    public static void CheckData(String[] Array){
        try{
            String firstStr = (String) Array[0];
        }catch(Exception e){
            System.out.println("Некорректно введена фамилия!" + e);
        }
        try{
            String secondStr = (String) Array[1];
        }catch(Exception e){
            System.out.println("Некорректно введено Имя!" + e);
        }
        try{
            String thirdStr = (String) Array[2];
        }catch(Exception e){
            System.out.println("Некорректно введено отчество!" + e);
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        try{
            formatter.parse(Array[3]);
        }catch(Exception e){
            System.out.println("Некорректно введена дата. нужен формат dd.MM.yyyy");
        }



    }
}
