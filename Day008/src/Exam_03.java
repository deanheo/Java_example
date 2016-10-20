import java.io.*;

public class Exam_03 {
    public static void main(String[] args) throws IOException {

        //동적 배열 할당 부분.
        if (args.length != 1) { // 하나의 매개변수만 받음
            System.out.print("인원 수 없음 입력 요망");
            System.exit(0);
        }

        int inwon = Integer.parseInt(args[0]);

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
        String[] name = new String[inwon];

        for (int i = 0; i < name.length; i++) {
            System.out.print(i + "번째 사람 ");
            name[i] = in.readLine();
        }
        System.out.println();

        for (int i = 0; i < name.length; i++) {
            System.out.println(i + "번째 이름 " + name[i]);
        }

    }
}
