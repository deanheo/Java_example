public class Exam_04 {
    public static void main(String[] args) {

        int x = 10;
        int y = ++x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = 10;
        y = x++;
        System.out.println("x = " + x);
        System.out.println("x = " + y);

    }
}
