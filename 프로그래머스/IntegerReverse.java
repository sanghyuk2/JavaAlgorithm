import java.util.Scanner;

public class IntegerReverse {
    public static void main(String[] args) {
        Solution sol = new Solution();

        Scanner sc = new Scanner(System.in);

        long num = sc.nextInt();

        sol.solution(num);
    }
}


class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int cnt = 0;
        //로컬 변수 num 대신 n을 이용하여 아래 코드를 실행하게 되면 n = 0이라는 값을 가지고 이어진다.
        long num = n;

        while(num != 0) {
            cnt++;
            num /= 10;
        }

        answer = new int[cnt];

        for(int i = 0; i < cnt; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }



        return answer;
    }
}

/*
* class Solution {
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
* */