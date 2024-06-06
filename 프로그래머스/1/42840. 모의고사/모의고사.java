import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        // 가장 많이 맞춘 사람 반환하는 문제
        // 각 사람별로 규칙을 설정
        // 가장 많이 맞춘 사람 반환
        
        // 1번 수포자의 답안
        int[] first_man = new int[answers.length];
        for(int i = 0; i < answers.length; i++) {
            first_man[i] = (i + 1) % 5;
            if(first_man[i] == 0) {
                first_man[i] = 5;
            }
        }
        // 2번 수포자의 답안
        int[] second_man = new int[answers.length];
        int odd = 1;
        for(int i = 0; i < answers.length; i++) {
            if(i % 2 == 0) {
                second_man[i] = 2;
            } else {
                second_man[i]  = odd++ % 5;
                if(second_man[i] == 0) {
                    second_man[i] = 5;
                } else if(second_man[i] == 2) {
                    second_man[i]  = odd++ % 5;
                }
            }
        }       
        // 3번 수포자의 답안
        int[] third_man = new int[answers.length];
        int value = 3;
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            third_man[i] = value;
            count++;
            if (count == 2) {
                if (value > 4) {
                    value = 2;
                } else if (value == 3) {
                    value = 0;
                } else if (value == 2) {
                    value = 3;
                }
                value++;
                count = 0; 
            }
        }
        for(int i = 0; i < answers.length; i++) {
            System.out.print(first_man[i] + ", ");
        }
        System.out.println("");
        for(int i = 0; i < answers.length; i++) {
            System.out.print(second_man[i] + ", ");
        }
        System.out.println("");
        for(int i = 0; i < answers.length; i++) {
            System.out.print(third_man[i] + ", ");
        }
        
        // 채점
        int[] correct = {0,0,0};
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == first_man[i]) {
                correct[0]++;
            }
            if(answers[i] == second_man[i]) {
                correct[1]++;
            }
            if(answers[i] == third_man[i]) {
                correct[2]++;
            }
        }
        
        // 1등 반환
        int maxCorrect = Math.max(correct[0], Math.max(correct[1], correct[2]));
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            if(maxCorrect == correct[i]) {
                result.add(i+1);
            }
        }
        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}