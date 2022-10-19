import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));
    }

    public static int solution(int n) {
        int answer = 0;

        if(n <= 3000) {
            for(int i = 1; i <= n; i++) {
                if(n % i == 0)
                    answer += i;
            }
         }
        return answer;
    }
}
