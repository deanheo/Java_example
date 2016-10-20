public class Exam_05 {
    int x; //전역 변수
    int y;

    public Exam_05() {
        x = 10;
        y = 20;
    }

    public Exam_05(int x) {
        this.x = x; //지역 변수 우선 순위 더 높음
        y = 20; //지역 변수 = 지역 변수 상태
    }

    public Exam_05(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void disp() {
        System.out.println("x = " + this.x);
        System.out.println("y = " + this.y);
    }
}
