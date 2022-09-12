import java.util.Arrays;

public class IntegerSorting {
    public long solution(long n) {
        long answer;
        int cnt = 0;
        long temp = n;

        while(temp != 0){
            cnt++;
            temp /= 10;
        }

        int[] arr = new int[cnt];

        for(int i = 0; i < cnt; i++) {
            arr[i] = (int)(n % 10);
            n /= 10;
        }

        Arrays.sort(arr);
        for(int i : arr)
            System.out.print(i);

        System.out.println();


        StringBuilder sb = new StringBuilder();

        for(int i : arr)
            sb.append(i);

        sb.reverse();

        answer = Long.parseLong(sb.toString());


        return answer;
    }

    public static void main(String[] args) {
        IntegerSorting sol = new IntegerSorting();
        System.out.println(sol.solution(54123));

    }
}
