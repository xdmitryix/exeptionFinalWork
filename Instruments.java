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
}
