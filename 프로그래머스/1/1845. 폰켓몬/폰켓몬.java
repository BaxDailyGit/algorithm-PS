import java.util.*;

class Solution {
    public static final int MAX_CNT = 0;
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> ponketmonSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            ponketmonSet.add(nums[i]);
        }
        // System.out.println(ponketmonSet.toString());
        if(ponketmonSet.size() > nums.length / 2) {
            return nums.length / 2;
        }
        else {
            return ponketmonSet.size();
        }
    }
}