//행렬의 덧셈
public class matrixSum {
    public static void main(String[] args) {
        int[][] answer = {};
        int[][] arr_1 = {{1},{2}};
        int[][] arr_2 = {{3},{4}};

        answer = new int[arr_1.length][arr_1[0].length];

        if(arr_1[0].length > 1) {
            for (int i = 0; i < arr_1.length; i++) {
                for (int j = 0; j < arr_1[0].length; j++) {
                    answer[i][j] = arr_1[i][j] + arr_2[i][j];
                }
            }
        }else {
            for(int i = 0; i < arr_1.length; i++) {
                answer[i][0] = arr_1[i][0] + arr_2[i][0];
            }
        }





    }
}

//다른 사람 풀이
/*
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}

*/
