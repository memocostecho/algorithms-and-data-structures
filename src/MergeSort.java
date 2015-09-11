/**
 * Created by guillermo.rosales on 25/08/15.
 */
public class MergeSort {


    public static void doMergeSort(double[] array, int start, int end) { //since is a recursive algorithm
        if (start < end) {

            int middle = start+(end - start) / 2;
            doMergeSort(array, start, middle);
            doMergeSort(array, middle +1, end);
            Merge(array, start, middle, end);

        } else return; //base condition
    }

    public static void Merge(double[] array, int start, int middle, int end) {

        int leftPartLength = middle - start + 1;
        int rightPartLength = end - middle;
        int aux1=0,aux2 =0,auxPosition=start;
        double leftPart[] = new double[leftPartLength], rightPart[] = new double[rightPartLength];

        for (int i = 0; i < leftPartLength; i++) {
            leftPart[i] = array[start+i];
        }

        for (int i = 0; i < rightPartLength; i++) {
            rightPart[i] = array[middle+i];
        }

        while(aux2<rightPartLength && aux1<leftPartLength ){

            if(leftPart[aux1]<rightPart[aux2]){
                array[auxPosition] = leftPart[aux1];
                aux1++;
                auxPosition++;
            }else{
                array[auxPosition] = rightPart[aux2];
                aux2++;
                auxPosition++;
            }
        }

        while(aux1 < leftPartLength){
            array[auxPosition] = leftPart[aux1];
            aux1++;
            auxPosition++;
        }

        while(aux2 < rightPartLength){
            array[auxPosition] = rightPart[aux2];
            aux2++;
            auxPosition++;
        }

    }


    public static void main(String[] args) {
        double[] unordered = {10, 20, 6, 9, 51, 1};
        doMergeSort(unordered, 0, unordered.length-1);
        for (int i=0;i< unordered.length;i++)
            System.out.print(unordered[i]+" ");
    }
}
