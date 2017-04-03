import java.util.Scanner;

public class TimeFormatter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        if (time.contains("PM")) {
            time = time.replace("PM", "");
            String[] splitTime = time.split(":");
            splitTime[0] = String.valueOf(Integer.parseInt(splitTime[0]) + 12 == 24 ? 0 : Integer.parseInt(splitTime[0]) + 12);
            System.out.println(splitTime[0] + ":" + splitTime[1] + ":" + splitTime[2]);
        } else if (time.contains("AM")) {
            time = time.replace("AM", "");
            System.out.println(time);
        } else {
            System.out.println("Malformed");
        }

    }
}
