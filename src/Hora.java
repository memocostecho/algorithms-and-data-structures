import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hora {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        if(time.contains("PM")){
            time=time.replace("PM","");
            String[] splittedTime =time.split(":");
            splittedTime[0] = String.valueOf(Integer.parseInt(splittedTime[0])+12==24?0:Integer.parseInt(splittedTime[0])+12);
            System.out.println(splittedTime[0]+":"+splittedTime[1]+":"+splittedTime[2]);
        }else if (time.contains("AM")){
            time=time.replace("AM","");
            System.out.println(time);
        }else{
            System.out.println("Malformed");
        }

    }
}
