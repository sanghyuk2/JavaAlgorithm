
//프로그래머스) 제일 작은 수 제거하기
import java.util.*;
import java.util.stream.Collectors;

public class removeTheSmallest {
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,1};
        int[] arr2 = {10};
        Solution sol = new Solution();
        sol.solution(arr2);
    }
}

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};


        //boxed() : primitive 타입을 wrapper 타입으로 박싱하여 반환한다.
        //이유 : collect 메소드는 제네릭 메소드이기에 primitive 타입이 제네릭으로 올 수 없다.
        List<Integer> ls = Arrays.stream(arr).boxed().collect(Collectors.toList());

        answer = new int[ls.size()];

        //Collections.min 메소드를 이용하여 컬렉션 인스턴스인 ls 요소 중 가장 작은 요소를 뽑는다.
        int min = Collections.min(ls);

        //반복자를 사용하여 처음 요소를 가리킨다.
        Iterator<Integer> itr = ls.iterator();


        int next;
        //.hasNext() : 다음 가리킬 요소가 있다면 true 반환
        while(itr.hasNext()) {
            //.next() : 다음 요소를 가리킨다.
            next = itr.next();
            if(next == min) {
                //.remove() 메소드를 이용하여 제거한다.
                itr.remove();
            }
        }



        if(arr.length == 1) {
            answer[0] = -1;
        } else {
            answer = new int[ls.size()];
            for (int i = 0; i < ls.size(); i++)
                answer[i] = ls.get(i);
        }



        return answer;
    }
}

//다른 사람 풀이
/*
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

class Solution {
  public int[] solution(int[] arr) {
      if (arr.length <= 1) return new int[]{ -1 };
      int min = Arrays.stream(arr).min().getAsInt();
      return Arrays.stream(arr).filter(i -> i != min).toArray();
  }
}
 */
