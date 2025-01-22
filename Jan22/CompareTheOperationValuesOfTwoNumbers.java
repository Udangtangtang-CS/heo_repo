package Jan22;

public class CompareTheOperationValuesOfTwoNumbers {
    public int solution(int a, int b) {
        int answer = 0;
        int stringAnswer =  Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int intAnswer =  2 * a * b;
        return (Math.max(stringAnswer, intAnswer));
    }
}
