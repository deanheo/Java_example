import java.io.*;

public class Exam_11 {
    public static void main(String[] args) throws IOException {

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.print("1: 남성, 2: 여성 = ");
        int x = Integer.parseInt(in.readLine());

        String str = x == 1 ? "남성" : "여성";
        // x == 1 ? str = "남성" : str = "여성"; << 자바에서는 오류 (C에서는 가능)

        System.out.println("str = " + str);

    }
}
