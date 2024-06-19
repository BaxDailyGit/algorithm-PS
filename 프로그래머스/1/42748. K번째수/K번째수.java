import java.util.*;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        // array를 commands[i][0]번째부터 commands[i][1]번째까지
        // 자르고 정렬 후
        // commands[i][2]번째 값을 answer[i]에 저장
        for(int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++)
                list.add(array[j]);
            Collections.sort(list);
            answer[i] = list.get(commands[i][2] - 1);
        }
        return answer;
    }
}