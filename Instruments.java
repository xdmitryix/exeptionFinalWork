import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Instruments {
    

    public static int CoutnOfArray(String[] Array){
        int count = 0;
        for (int i = 0; i < Array.length; i++) {
            count++;
        }
        return count;
    }

    public static boolean CheckData(String[] Array){
        Boolean flag = true;
        try{
            String firstStr = (String) Array[0];
        }catch(Exception e){
            flag = false;
            System.out.println("Некорректно введена фамилия!" + e);
        }
        try{
            String secondStr = (String) Array[1];
        }catch(Exception e){
            flag = false;
            System.out.println("Некорректно введено имя!" + e);
        }
        try{
            String thirdStr = (String) Array[2];
        }catch(Exception e){
            flag = false;
            System.out.println("Некорректно введено отчество!" + e);
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        try{
            formatter.parse(Array[3]);
        }catch(Exception e){
            flag = false;
            System.out.println("Некорректно введена дата. нужен формат dd.MM.yyyy");
        }
        try{
            long fiveLong = Long.valueOf(Array[4]);
        }catch(Exception e){
            flag = false;
            System.out.println("введены некорректные данные номера телефона (введены не числа)");
        }
        try{
            if ((!Array[5].equals("f")) && (!Array[5].equals("m"))){
                throw new Exception();
            }
        }catch(Exception e){
            flag = false;
            System.out.println("Введены некорректные данные пола (введите f или m)");
        }
        return flag;
    }
}
