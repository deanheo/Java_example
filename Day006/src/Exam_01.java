import java.io.*;

public class Exam_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.print("수 : ");
        int x = Integer.parseInt(in.readLine());

        if (x > 0) { //입력받은 값이 양수일 때만 출력
            System.out.print("x = " + x);
        }

    }
}
