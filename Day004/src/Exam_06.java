import java.io.*;

public class Exam_06 {
    public static void main(String[] args) throws IOException {

        System.out.print("글자 입력 : ");
        int x = System.in.read();
        System.out.println("x = " + x);

        // 변수 지정하지 않으면 스스로 제거함
        System.in.read(); //\r
        System.in.read(); //\n

        System.out.print("숫자 입력 : ");
        int y = System.in.read() - 48;
        System.out.println("y = " + y);

    }
}

