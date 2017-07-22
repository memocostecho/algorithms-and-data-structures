import java.util.HashSet;

/**
 * Taken from https://codefights.com/interview-practice/
 * method number one was my solution, method number to was the most voted one in the comments
 */
public class FirstRepeatedElementInArray {

    private static int firstDuplicate(int[] a) {

        HashSet map = new HashSet<Integer>();

        for(int i = 0; i< a.length; i++) {
            if(map.contains(i)) {
                return i;
            } else {
                map.add(i);
            }
        }

        return -1;
    }


    static int firstDuplicate2(int[] a) {
        for(int i=0;i<a.length;i++)
            if(a[Math.abs(a[i])-1]<0)
                return Math.abs(a[i]);
            else{
                a[Math.abs(a[i])-1]=-a[Math.abs(a[i])-1];
            }
        return -1;
    }

    public static void main(String[] args) {
        firstDuplicate(new int[] {2, 3, 3, 1, 5, 2});
        firstDuplicate2(new int[] {2, 3, 3, 1, 5, 2});
    }




}
