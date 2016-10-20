class AA {
    int a = 1;
    int b = 2;
    int c = 3;

    void aa() {
        System.out.print(a + " , " + b + " , " + c);
    }
}

public class Exam_02 {
    public static void main(String[] args) {

        AA sump = new AA();

        System.out.println("ap.a = " + sump.a);
        System.out.println("ap.b = " + sump.b);
        System.out.println("ap.c = " + sump.c);

        sump.aa();

    }
}
