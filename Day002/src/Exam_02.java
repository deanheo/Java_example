public class Exam_02 {
    public String name;
    public String _abc;
    public String $abc;
    public String abcabcabcabcabcabcabcabcabc;

    public String abc abc;      // 공백 불가
    public String *abc;         // 다른 특수 문자 불가
    public String a&b;          // 다른 특수 문자 불가
    public String 1abc;         // 숫자 맨 처음 불가능
    public String for;          // 예약어 불가
}
