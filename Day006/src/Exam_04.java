import java.io.*;

public class Exam_04 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int su1 = 0, su2 = 0, su3 = 0;

        System.out.print("su1 = ");
        su1 = Integer.parseInt(in.readLine());
        System.out.print("su2 = ");
        su2 = Integer.parseInt(in.readLine());
        System.out.print("su3 = ");
        su3 = Integer.parseInt(in.readLine());

        if (su2 > su1 && su2 > su3) {
            int temp = su1;
            su1 = su2;
            su2 = temp;
        } else if (su3 > su1 && su3 > su2) {
            int temp = su1;
            su1 = su3;
            su3 = temp;
        }
        if (su3 > su2) {
            int temp = su2;
            su2 = su3;
            su3 = temp;
        }
        System.out.println(su1 + " >= " + su2 + " >= " + su3);

    }
}
