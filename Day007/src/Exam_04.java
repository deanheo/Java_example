import java.io.*;

public class Exam_04 {

    public static int sum(int x, int y) {
        int tot = x + y;
        return tot;
    }

    public static int min(int x, int y) {
        int tot = x - y;
        return tot;
    }

    public static int mul(int x, int y) {
        int tot = x * y;
        return tot;
    }

    public static int div(int x, int y) {
        int tot = x / y;
        return tot;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
        int su1 = 0, su2 = 0;
        char yon = 0;
        int tot = 0;

        System.out.print("su1 = ");
        su1 = Integer.parseInt(in.readLine());
        System.out.print("su2 = ");
        su2 = Integer.parseInt(in.readLine());

        do {
            System.out.print("yon(+ - * /) = ");
            yon = (char) System.in.read();
            in.readLine();
        } while (yon != '+' && yon != '-' && yon != '*' && yon != '/');

        switch (yon) {
            case '+':
                tot = sum(su1, su2);
                break;
            case '-':
                tot = min(su1, su2);
                break;
            case '*':
                tot = mul(su1, su2);
                break;
            case '/':
                tot = div(su1, su2);
                break;
        }
        System.out.println(su1 + " " + yon + " " + su2 + " = " + tot);
    }

}
