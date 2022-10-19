import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//나누어 떨어지는 숫자 배열
public class IntegerArrayDivisor {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {5,9,7,10};
        int[] arr2 = {2,36,1,3};
        int[] arr3 = {3,2,6};
        sol.solution(arr3, 10);

    }
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        long cnt = Arrays.stream(arr)
                    .filter(i -> i % divisor == 0)
                    .count();

        if(cnt == 0) {
            answer = new int[1];
            answer[0] = -1;
        }else {

            List<Integer> list = Arrays.stream(arr)
                    .filter(i -> i % divisor == 0)
                    .boxed()
                    .collect(Collectors.toList());

            answer = list.stream().mapToInt(Integer::intValue).toArray();

            Arrays.sort(answer);
        }


        return answer;
    }
}


//다른 사람 풀이
/*
class Solution {
  public int[] solution(int[] arr, int divisor) {
          int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
          if(answer.length == 0) answer = new int[] {-1};
          java.util.Arrays.sort(answer);
          return answer;
  }
}
 */