import java.io.*;

public class Exam_03 {
    public static void main(String[] args) throws IOException {

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
        int su1 = 0, su2 = 0;

        System.out.print("su1 = ");
        su1 = Integer.parseInt(in.readLine());
        System.out.print("su2 = ");
        su2 = Integer.parseInt(in.readLine());

        if (su1 > su2)
            System.out.println("su1 이 더 큰수 입니다.");
        else if (su1 < su2)
            System.out.println("su2 이 더 큰수 입니다.");
        else
            System.out.println("같은 수 입니다.");

    }
}
