class Result {
    public static void main(String[] args) {
        Result result = new Result();
        /* 자동 형변환 */
        result.typePromotion();

        /* 강제 형변환 */
        result.typeCasting();

        /* 강제 형변환 데이터 손실 체크 */
        result.checkValueBeforeCasting();

        /* 정수 타입 -> 실수 타입 변환시 정밀도 손실 */
        result.fromIntToFloat();
    }

    /* 자동 형변환 */
    public void typePromotion() {
        byte b1 = 10;
        int i1 = b1; // int <- byte
        System.out.println(b1); // 10
        System.out.println(i1); // 10

        // 연산식에서의 자동 타입 변환
        int intValue = 10;
        double doubleValue = 5.5;
        double result = intValue + doubleValue;
        System.out.println(result); // 15.5

        byte byteValue1 = 10;
        byte byteValue2 = 20;
        // byte byteValue3 = byteValue1 + byteValue2; // 정수 계산시 int를 기본으로 하여 계산하기 떄문에
        // 컴파일 에러 발생
        int intValue3 = byteValue1 + byteValue2;
        System.out.println(intValue3);
    }

    /* 강제 형변환 */
    public void typeCasting() {
        long longValue = 300;
        int intValue = (int) longValue;
        System.out.println(intValue); // 300

        intValue = 'A';
        char charValue = (char) intValue;
        System.out.println(charValue); // A

        double doubleValue = 3.14;
        intValue = (int) doubleValue; // 정수 부분만 저장
        System.out.println(intValue); // 3
    }

    /* 강제 형변환 데이터 손실 체크 */
    public void checkValueBeforeCasting() {
        int i = 128;
        if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
            System.out.println("byte 타입으로 변환할 수 없습니다.");
            System.out.println("값을 다시 확인 해주세요");
        } else {
            byte b = (byte) i;
            System.out.println(b);
        }
    }

    /* 정수 타입 -> 실수 타입 변환시 정밀도 손실 */
    public void fromIntToFloat() {
        int num1 = 1234567890;
        int num2 = 1234567890;

        /**
         * 타입 크기 범위
         * float : 부호(1비트) + 지수(8비트) + 가수(23비트)
         * double : 부호(1비트) + 지수(11비트) + 가수(52비트)
         */
        float num3 = num2; // 가수 범위를 벗어나기 때문에 형변환시 문제가 됨. double 로 바꿀경우 정상 동작함
        num2 = (int) num3;

        int result = num1 - num2;
        System.out.println(result); // -4
    }
}