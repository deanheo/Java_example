public class Exam_02 {

    public static void view_star(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        //x = 75;   >> main의 원본데이터 변경 불가 >> Call By Value
    }

    public static void main(String[] args) {
        view_star(5);
        System.out.println();
        view_star(3);
        System.out.println();
        view_star(10);
    }

}
