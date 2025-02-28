package Feb28;

/*
[ 문제 설명 ]

정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberLessThanX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput = br.readLine().split(" ");
        int N = Integer.parseInt(firstInput[0]);
        int X = Integer.parseInt(firstInput[1]);

        String[] secondInput = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(secondInput[i]);
            if (a < X) {
                sb.append(a).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}

