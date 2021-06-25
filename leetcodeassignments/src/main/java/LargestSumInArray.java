public class LargestSumInArray {
    public static int largestSumOfThreeNumbers(int[] arrayOfNums) {
        int MAX_A = Integer.MIN_VALUE;
        int MAX_B = Integer.MIN_VALUE;
        int MAX_C = Integer.MIN_VALUE;
        if(arrayOfNums.length<3)
            return -1;
        for(int i = 0;i< arrayOfNums.length; i++) {
            if(arrayOfNums[i]>MAX_A) {
                MAX_C = MAX_B;
                MAX_B = MAX_A;
                MAX_A = arrayOfNums[i];
            } else if(arrayOfNums[i] > MAX_B) {
                MAX_C = MAX_B;
                MAX_B = arrayOfNums[i];
            } else if(arrayOfNums[i] > MAX_C) {
                MAX_C = arrayOfNums[i];
            }
        }
        return MAX_A+MAX_B+MAX_C;
    }
    public static void main(String[] args) {
        System.out.println(largestSumOfThreeNumbers(new int[]{1,4,5,2,-3}));
    }
}
