import java.io.*;

public class Exam_07 {
    public static void main(String[] args) throws IOException {

        byte[] by = new byte[10];
        System.out.print("이름 : ");

        System.in.read(by);

        System.out.println("입력한 값은 = " + new String(by));

    }
}

