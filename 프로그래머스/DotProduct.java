public class DotProduct {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a1 = {1,2,3,4};
        int[] b1 = {-3,-1,0,2};
        int[] a2 = {-1, 0, 1};
        int[] b2 = {1,0,-1};
        sol.solution(a2,b2);
    }
}

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i = 0; i < a.length; i++)
            answer += a[i]*b[i];

        System.out.println(answer);

        return answer;
    }
}

//다른 사람 풀이
/*
class Solution {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
}


 */