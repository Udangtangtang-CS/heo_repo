package Mar04;

/*

[ 문제 설명 ]

정수가 담긴 리스트 num_list가 주어집니다.
num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을
return 하도록 solution 함수를 완성해주세요.

 */
public class ConcatenatedNumber {
    public int solution(int[] num_list) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (int num : num_list) {
            (num % 2 == 0 ? a : b).append(num);
        }

        return Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
    }
}
