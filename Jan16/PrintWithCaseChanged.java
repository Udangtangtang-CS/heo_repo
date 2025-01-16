package Jan16;

import java.util.Scanner;

public class PrintWithCaseChanged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<a.length; i++){
            if(Character.isLowerCase(a[i])){
                sb.append(Character.toUpperCase(a[i]));
            }
            else if(Character.isUpperCase(a[i])){
                sb.append(Character.toLowerCase(a[i]));
            }
        }
        System.out.println(sb.toString());
    }
}