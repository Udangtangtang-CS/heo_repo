package Feb27;

/*
[ 문제 설명 ]

문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다.
my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로
이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

 */
public class CreateAStringByConcatenatingLetters {
    public String solution(String my_string, int[] index_list) {
        char[] arr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int j : index_list) {
            sb.append(arr[j]);
        }

        return sb.toString();
    }
}
