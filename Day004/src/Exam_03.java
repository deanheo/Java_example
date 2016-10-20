public class Exam_03 {
    public static void main(String[] args) {

        int a = 100;
        char b = 'A';
        float c = 12.345F;
        String d = "웨일";

        System.out.printf("a = %d \n", a); // %d = 10진수 출력
        System.out.printf("b = %c = %d \n", b, (int)b); // %c = char 문자 1개 출력
        System.out.printf("c = %6.2f \n", c); // %f = 실수 출력(전체 6자리, 소수점 2자리)
        System.out.printf("d = %s \n", d); // %s = 문자열 출력

    }
}
