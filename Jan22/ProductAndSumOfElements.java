package Jan22;

/*

[ 문제 설명 ]
정수가 담긴 리스트 num_list가 주어질 때,
모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을
크면 0을 return 하도록 solution 함수를 완성해주세요.

 */
public class ProductAndSumOfElements {
    public int solution(int[] num_list) {
        int answer = 0;

        int sum  = 0;
        int mult = 1;

        for(int i : num_list) {
            sum += i;
            mult *= i;
        }

        answer = Math.pow(sum,2) > mult ? 1 : 0;

        return answer;
    }
}
