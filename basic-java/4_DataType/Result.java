public class Result {
    public static void main(String[] args) {
        byte b1 = 127;
        // byte v2 = 128; // 컴파일 에러
        System.out.println(b1);
        b1 += 1;
        System.out.println(b1); // 127을 넘어갈 경우 -128 부터 시작

        char c1 = 'A';
        char c2 = '\u0041';
        System.out.println(c1);
        System.out.println(c2);

        int i1 = 10; // 10진수로 저장
        int i2 = 012; // 8진수로 저장
        int i3 = 0xA; // 16진수로 저장
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        float f1 = 3.14f;
        // float f2 = 3.14; // 뒤에 f를 안붙힐 경우 double 형으로 인식되 컴파일 에러 발생

        long l1 = 20;
        long l2 = 2000000000000L;
        // long l3 = 2000000000000; //범위가 넘어서는 리터럴뒤에 L을 붙이지 않을 경우 컴파일 에러 발생
        System.out.println(l1);
        System.out.println(l2);

        int val1 = 3000000;
        double val2 = 3e6;
        float val3 = 3e6f;
        double val4 = 2e-3;
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);

        boolean bool1 = true;
        if (bool1) {
            System.out.println("boolean is true");
        }
    }
}
