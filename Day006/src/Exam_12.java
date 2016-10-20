import java.io.*;

public class Exam_12 {
    public static void main(String[] args) throws IOException {

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));

        int kor = 0, eng = 0, mat = 0, tot = 0;
        float avg = 0.0F;

        do {
            System.out.print("kor = ");
            kor = Integer.parseInt(in.readLine());
        } while (kor <= 0 || kor >= 100);

        do {
            System.out.print("eng = ");
            eng = Integer.parseInt(in.readLine());
        } while (eng <= 0 || eng >= 100);

        do {
            System.out.print("mat = ");
            mat = Integer.parseInt(in.readLine());
        } while (mat <= 0 || mat >= 100);

        tot = kor + eng + mat;
        avg = tot / 3.0F;

    }
}