import java.util.Scanner;

import java.util.*;
import java.text.SimpleDateFormat;

public class Solution{

    public static String getDay(String day, String month, String year){
    try{
        String date = (day + "/" + month + "/" + year);
        Date dt = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        return (sdf.format(dt).toUpperCase());
    }
        catch(Exception e){
            return "sdas";
        }
    }

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}
