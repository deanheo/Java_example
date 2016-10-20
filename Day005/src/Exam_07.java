public class Exam_07 {
    public static void main(String[] args) {

        boolean bool1 = 5 < 3;
        boolean bool2 = 10 == 10;
        System.out.println(bool1);
        System.out.println(bool2);

        boolean a = bool1 != bool2;
        boolean b = bool1 = !bool2; //기호주의. bool2 을 부정해서 bool1에 대입
        System.out.println(a);
        System.out.println(b);

    }
}
