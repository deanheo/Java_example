import java.io.*;

public class Exam_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
        //int x=0, y=0, z=0;
        int x[] = new int[3];

        for (int i = 0; i < x.length; i++) {
            System.out.print("i = ");
            x[i] = Integer.parseInt(in.readLine());
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println(i + " : " + x[i]);
        }

    }
}