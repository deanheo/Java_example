public class Exam_10 {

    public static boolean a() {
        System.out.println("A");
        return false;
    }

    public static boolean b() {
        System.out.println("B");
        return true;
    }

    public static void main(String[] args) {
        //boolean bool = a() && b();
        boolean bool = a() & b(); // 비트 연산자 이용
        System.out.println("bool = " + bool);
    }
}
