public class Exam_04 {
    public static void main(String[] args) {

        int x = 12;
        int y = 24;

        System.out.println("x = " + x); //나열 의미의 + 기호
        System.out.println(x + y); //36 > 연산 의미의 + 기호
        System.out.println("x" + x + y); //x1224 나열 연속
        System.out.println(x + y + "x"); //36x 연산 후 나열
        System.out.println(x + "x" + y); //12x24
        System.out.println(x + "x" + y * 2); //12x48

        System.out.println('A' + x + y); //101 >> A = 65(아스키코드)
        System.out.println('A' + 'B'); //아스키코드 끼리의 덧셈

        System.out.println("" + 'A' + x); //연산 불가시에는 문자로 남음

    }
}
