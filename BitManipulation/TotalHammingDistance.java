package BitManipulation;

/**
 * Created by rliu on 2/20/17.
 * 477. Total Hamming Distance
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Now your job is to find the total Hamming distance between all pairs of the given numbers.
 * Example:
 * Input: 4, 14, 2
 * <p>
 * Output: 6
 * <p>
 * Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (just
 * showing the four bits relevant in this case). So the answer will be:
 * HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
 * Note:
 * Elements of the given array are in the range of 0 to 10^9
 * Length of the array will not exceed 10^4.
 */
public class TotalHammingDistance {
    public static void main(String[] args) {
        System.out.println(totalHammingDistance(new int[]{2, 14, 4}));

    }

    //
    public static int totalHammingDistance(int[] nums) {
        int total = 0;
        int n = nums.length;
        for (int i = 0; i < 32; i++) { //32 bits for integer
            int bitCount = 0;
            for (int j = 0; j < n; j++) {
                bitCount += (nums[j] >> i) & 1;
            }
            total += bitCount * (n - bitCount);
        }
        return total;
    }
}
