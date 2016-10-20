public class Exam_02 {
    public static void main(String[] args) {

        System.out.write(65); // write(int a) int(아스키코드) 출력 가능
        // write 메소드의 특성상 버퍼를 내보내는 플러시가 자동으로 되어있지 않아서 출력 안됨
        System.out.flush(); // 출력
        // 지금은 불편할지도 모르지만 네트워크 및 파일 입출력에서 중요함
        System.out.println();

        byte[] by = new byte[]{'3', 'a', 'v', 'a'};
        System.out.write(by, 0, 4); // 0번째부터(시작) 4개 출력, Auto flush
        System.out.println();

        int x = 100;
        char y = 'a';
        System.out.print(x);
        System.out.print(y); // x, y가 붙어서 나옴
        System.out.println();
        System.out.println(x); // println()은 개행기능
        System.out.println(y);

    }
}
