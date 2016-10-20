public class Exam_03 {

    public static int a() {
        return 7;
    }

    public static int b(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void main(String[] args) {
        int n = a();
        System.out.println("n = " + n);

        int m = b(5, 7);
        System.out.println("m = " + m);
    }

}