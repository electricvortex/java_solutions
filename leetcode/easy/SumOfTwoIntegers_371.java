package leetcode.easy;

public class SumOfTwoIntegers_371 {

    public int getSum(int a, int b) {
        if (a == 0) return b;
        return getSum((a&b) << 1, a^b);
    }

}
