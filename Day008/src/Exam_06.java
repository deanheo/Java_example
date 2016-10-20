public class Exam_06 {
    public static void main(String[] args) {

        int[][] a = new int[3][2];

		/*
		 a[0] = new int[3];
		 a[1] = new int[6];
		 a[2] = new int[5];  << 가능
		 */

        for (int i = 0; i < a.length; i++) { // a.length = 1차원의 길이 = 3
            for (int j = 0; j < a[i].length; j++) { //a[i].length = 2차원의 길이 = 2
                System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
            }
        }

    }
}