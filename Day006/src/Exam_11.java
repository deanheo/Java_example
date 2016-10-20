import java.io.*;

public class Exam_11 {
    public static void main(String[] args) throws IOException {

        while (true) { //n 입력 시 까지 루프
            System.out.print("문자 = ");
            char ch = (char)System.in.read();
            System.in.read();
            System.in.read();
            System.out.println(ch + " = " + (int) ch);

            System.out.print("y/n? = ");
            char c = (char) System.in.read();
            System.in.read();
            System.in.read();

            if (c == 'N' || c == 'n') break; //n 입력시 종료
        }

    }
}