public class Exam_05 {
    public static void main(String[] args) {

        int x = 10; //char형도 정수형이므로 가능
        int y = 3; //둘 중 하나 혹은 둘다 실수형이면 실수형으로 출력됨

        System.out.println("몫 = " + x / y);
        System.out.println("나머지 = " + x % y);

        byte a = 10;
        byte b = 20;
        //byte c = a + b; //에러
        //short d = a + b; //에러
        int e = a + b;

    }
}
