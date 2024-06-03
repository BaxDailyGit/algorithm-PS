class Solution {
    public int[] solution(int start, int end_num) {
        int size = start - end_num + 1;
        
        int[] answer = new int[size];
        
        for (int i = 0; i < size; i++) {
            answer[i] = start - i;
        }
        
        return answer;
    }
}
