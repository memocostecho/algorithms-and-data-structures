/**
 * Created by guillermo.rosales on 11/09/15.
 */
public class IncrementGoogle {

    static int[] increment(int[] number){

        int index =number.length-1;

        if (number[index]!=9){
            number[index]++;
            return number;
        }

        while(number[index] == 9){

            if(index == 0 && number[index]==9){
                int[] newArray = new int[number.length+1];
                newArray[0]=1;
                for(int i=1;i<newArray.length;i++){
                    newArray[i]= 0;
                }
                return newArray;
            }
            number[index] =0;
            if(number[index-1]!=9){
                number[index-1]++;
            }
            index--;
        }
        return number;

    }

    public static void main(String[] args) {
        int[] result = increment(new int[]{9, 9, 9});
        System.out.println(result);

    }


}
