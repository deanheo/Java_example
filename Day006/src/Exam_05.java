import java.io.*;

public class Exam_05 {
    public static void main(String[] args) throws IOException {

        //int su1 = 0;
        char su1 = 0;

        System.out.print("수 입력(1~5) = ");
        //su1 = System.in.read()-48;
        su1 = (char)System.in.read();

        switch(su1) { //문자 입력시 ' '
            case '1':
                System.out.println("1을 입력하셨습니다");
                break;
            case '2':
                System.out.println("2을 입력하셨습니다");
                break;
            case '3':
                System.out.println("3을 입력하셨습니다");
                break;
            case '4':
                System.out.println("4을 입력하셨습니다");
                break;
            case '5':
                System.out.println("5을 입력하셨습니다");
                break;
            default:
                System.out.println("잘못입력하셨습니다");
        }

    }
}
