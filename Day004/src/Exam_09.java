import java.io.*;

public class Exam_09 {
    public static void main(String[] args) throws IOException {

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));

        String numb = "";
        byte a = 0;
        int b = 0;
        float c = 0.0F;
        //문자열에서 char, boolean 형으로의 변환은 안됨.

        System.out.print("수 입력 : ");
        numb = in.readLine();

        a = Byte.parseByte(numb); //Wrapper 클래스 이용
        b = Integer.parseInt(numb);
        c = Float.parseFloat(numb);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
