import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by guillermo.rosales on 16/12/15.
 */
public class Solution {

    public static void main(String[] args) {


        HashMap<String,Integer> map = new HashMap();
        char a = 'a';
        for(char c='a';c<='z';c++){
            map.put(String.valueOf(c),0);
        }

        String phrase = new Scanner(System.in).nextLine();

        for ( char cha : phrase.toLowerCase().toCharArray()){
            map.put(String.valueOf(cha),1);
        }

        for (String key : map.keySet()) {


            if(map.get(key)==0){
                System.out.print("not pangram");
                return;
            }
        }
        System.out.print("pangram");
        return;





        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
