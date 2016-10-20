import java.io.*;

public class Exam_02 {
    public static void main(String[] args) throws IOException {

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));

        int[] x = new int[]{5, 4, 7, 5, 1, 9, 7, 6};
        System.out.println("x.length = " + x.length); // length 속성 이용
        System.out.println();

        int num = 0;
        System.out.print("nun = ");
        num = Integer.parseInt(in.readLine());
        int[] y = new int[num]; // 입력받은 수 만큼 동적으로 배열 할당

        for (int i = 0; i < y.length; i++) {
            System.out.println("y [" + i + "] = " + y[i]);
        }

    }
}
