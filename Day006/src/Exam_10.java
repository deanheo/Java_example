public class Exam_10 {
    public static void main(String[] args) {

        int tot = 0;
        int i = 1;

        for (; i <= 10; ) {
            tot += 1;
            ++i;
        }
        System.out.println("tot = " + tot);

        while (i <= 10) {
            tot += 1;
            ++i;
        }
        System.out.println("tot = " + tot);

    }
}