public class Exam_09 {
    public static void main(String[] args) {

        aaa:
        for (int i = 0; i < 5; i++) { //aaa 레이블
            bbb:
            for (int n = 0; n < 5; n++) { //bbb 레이블
                if (n == 2) {
                    break aaa; //첫번째 줄 별 2개 찍고 aaa 밖으로 탈출
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
