public class Exam_03 {
    private int x;
    private int y;

    public Exam_03() { //생성자는 클래스 명과 같음
        x = 10;          //리턴 값 없음 (void 등 금지)
        y = 20;
    }

    public Exam_03(int a) { //생성자 오버로딩
        x = a;
    }

    public Exam_03(int a, int b) { //생성자 오버로딩
        x = a;
        y = b;
    }

    public Exam_03(float a) {
    } //생성자 오버로딩

    public Exam_03(char a) {
    } //생성자 오버로딩

    void disp() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
