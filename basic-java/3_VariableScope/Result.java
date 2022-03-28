public class Result {
    public static void main(String[] args) {
        int v1 = 15;
        if (v1 > 10) {
            int v2 = v1 - 10;
        }

        System.out.println(v1);
        // System.out.println(v2); // 지역변수 특성으로 인해 컴파일 에러 발생
    }
}
