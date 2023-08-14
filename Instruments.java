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
            char[] chars = Array[0].toCharArray();
            for (char c : chars){
                if (!Character.isLetter(c)) {
                    throw new Exception();
                }
            }
        }catch(Exception e){
            flag = false;
            System.out.println("Фамилия не может сожержать цифры и знаки!");
        }
        try{
            char[] chars = Array[1].toCharArray();
            for (char c : chars){
                if (!Character.isLetter(c)) {
                    throw new Exception();
                }
            }
        }catch(Exception e){
            flag = false;
            System.out.println("Имя не может сожержать цифры и знаки!");
        }
        try{
            char[] chars = Array[2].toCharArray();
            for (char c : chars){
                if (!Character.isLetter(c)) {
                    throw new Exception();
                }
            }
        }catch(Exception e){
            flag = false;
            System.out.println("отчество не может сожержать цифры и знаки!");
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
