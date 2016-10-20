public class Exam_07 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break; //if를 제외한 가장 가까운 블록에서 탈출
            }
            System.out.println("*");
        }//break가 for문을 빠져나감

        System.out.println();

        for (int i = 0; i < 5; i++) { //for문의 가장 마지막은 증감 부분
            if (i == 2) { //2일때만 *을 찍지 않음
                continue; //if를 제외한 가장 가까운 블록의 마지막으로
            }
            System.out.println("*");
        }

    }
}
