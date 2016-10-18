import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Exam_07 {

    static int x; // 자동 초기화

    public static void main(String[] args) {
        int y; // 지역 변수
        System.out.println(x);
        System.out.println(y); // 에러 발생

        if(x > 0) {
            int z = 300;
        } // 지역 변수 z 소멸

        z = 100; // 에러 >> 위에서 소멸
    } // 변수 y 소멸
}
