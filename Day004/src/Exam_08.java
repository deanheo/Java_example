import java.io.*;

public class Exam_08 {
    public static void main(String[] args) throws IOException {

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.print("이름 : ");
        String name = in.readLine(); // 엔터 입력 시 까지의 모든 글자 입력
        // 엔터 값 처리 할 필요없음
        System.out.print("나이 : ");
        String age = in.readLine();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age + "세");

    }
}

