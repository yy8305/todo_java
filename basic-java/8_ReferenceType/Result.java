public class Result {
    public static void main(String[] args) {
        int[] nums;
        // nums = { 1, 2, 3 }; // 컴파일 에러 발생
        nums = new int[] { 1, 2, 3 };

        int[][] scores = { { 95, 98 }, { 100, 23 } };
        System.out.println(scores[0][0]);
    }
}
