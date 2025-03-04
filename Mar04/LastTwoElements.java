package Mar04;

import java.util.Arrays;

public class LastTwoElements {
    public int[] solution(int[] num_list) {
        int a = num_list[(num_list.length)-1]; // 배열에서 마지막 원소
        int b = num_list[(num_list.length)-2]; // 배열에서 마지막의 이전 원소

        // 1개 값 추가될 새로운 배열 생성
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        if(a > b){
            answer[num_list.length] = a - b;
        } else {
            answer[num_list.length] = a * 2;
        }

        return answer;
    }
}
