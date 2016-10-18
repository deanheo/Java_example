public class Exam_05 {
    public static void main(String[] args) {

        int a = 100;
        int b = a;      // 문제 없음

        int c = 200;
        long d = c;     // 공간 낭비는 있지만 값에는 문제 없음 >> promotion

        long e = 300L;
//        byte f = e;     // 큰 공간에서 작은 공간으로 >> 에러
//        f = (byte)e;    // 강제 형 변환 >> casting >> 에러 없지만 값 손실 우려

        char g = 65;
//        short h = g;    // 에러 >> char와 short모두 2byte로 같지만 범위의 차이

        long i = 100L;
        float j = i;

        float k = 100F;
//        long l = k;     // 에러 >> 실수가 정수보다 큰 개념

    }
}
