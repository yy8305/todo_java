public class Result {
    public static void main(String[] args) {
        /**
         * int : 변수 자료형
         * value1 : 변수명, 메모리에 담긴 위치의 이름
         * 10 : 정수형 리터럴
         */
        int value1 = 10;

        // 변수앞에 $(달러)나 _(언더바) 가 올수 있음, 숫자는 못옴
        int $value2 = 10;
        int _value3 = 10;

        // 실수 리터럴
        float flt = 3.14f; // float 형의 경우 뒤에 'f' 삽입 해줘야함

        // 문자형 리터럴
        char str = 'A';

        // 논리 리터럴
        boolean bool = true;

        System.out.println(flt); // 3.14
        System.out.println(str); // A
        System.out.println(bool); // true

        int result = value1 + 10;
        System.out.println(result); // 20
    }
}
