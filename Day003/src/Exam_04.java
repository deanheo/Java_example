public class Exam_04 {
    public static void main(String[] args) {
        // 숫자를 저장하기 위한 공간 설정
        int /* 정수형으로 */ num1 /* num1 이라는 이름의 공간에 */ = 1;
        int num2 = 2;

        boolean a = true; // boolean형은 처음 선언 시 값을 꼭 넣어주어야 함

        byte b = 127;
//        byte c = 128; // 에러

        byte d = 127;
        d++; // 1 증가 시 결과는?? >> -128 >> 맨 앞자리 0과 1은 양수, 음수 표현

        short e = -32768;
        int f = 2147483647;
//        long g = 12312312312312321; // 기본 자료형을 int로 인식
        long h = 12312312312312312L; // 그래서 long은 뒤에 L 입력해줘야 함

        float i = 12.34F;
        double j = 12.3456;

        String name = "웨일";
    }
}
