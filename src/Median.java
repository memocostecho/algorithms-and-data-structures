/**
 * Created by guillermo.rosales on 10/09/15.
 */
public class Median {

    public static float findMedian(int[] arr1,int[] arr2){

        int[] mergedArray= merge(arr1,arr2);
        if(mergedArray.length%2!=0)
            return mergedArray[(int)Math.floor(mergedArray.length / 2)];
        else
            return (float)(mergedArray[mergedArray.length/2]+mergedArray[mergedArray.length/2-1])/2;

    }

    public static int[] merge(int[] arr1,int[] arr2){

        //since the arrays are sorted you can compare just the first part of the arrays
        int pointer1 =0;
        int pointer2 =0;
        int pointerResult=0;
        int[] result = new int[arr1.length+arr2.length]; //fail

        while(pointer1<arr1.length && pointer2<arr2.length){
            if(arr1[pointer1]<=arr2[pointer2]){
                result[pointerResult] = arr1[pointer1];
                pointer1++;
            }else{
                result[pointerResult] = arr2[pointer2];
                pointer2++;
            }
            pointerResult++;

        }
        while(pointer1<arr1.length){

            result[pointerResult] = arr1[pointer1];
            pointer1++;
            pointerResult++;

        }
        while (pointer2<arr2.length){
            result[pointerResult] = arr2[pointer2];
            pointer2++;
            pointerResult++;
        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(findMedian(new int[]{1, 2, 4}, new int[]{5, 6}));


    }




}
