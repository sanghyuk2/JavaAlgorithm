public class SelectionSort {
    public static void main(String[] args) {
        int min, temp, index = 0;
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        for(int i = 0; i < 10; i++) {
            min = 9999;
            for(int j = i; j < 10; j++) {
                if(min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }

            //아래의 일련의 과정을 swapping이라고 한다.
            //맨 앞에 있는 값을 temp에 저장한다.
            temp = array[i];
            //최솟값을 맨 앞으로 옮겨준다.
            array[i] = array[index];
            //원래 맨 앞에 있던 값을 최솟값이 있던 위치로 옮겨준다.
            array[index] = temp;

        }

        for(int i = 0; i < 10; i++) {
            System.out.print(array[i]);
        }


    }


}

/*
등차수열 : n * (n+1) / 2
1, 10, 5, 8, 7, 6, 4, 3, 2, 9 를 하나하나 앞에서부터 정렬하려면
10 + 9 + 8 + ... + 1 = 55
즉, 수행시간은 등차수열과 동일하게 'n * (n+1) / 2' 이나, n의 값이 어마어마하게 크다면 사실 '+ 1'이나 '/2' 와 같은 공식은 없는 것과 마찬가지이다.
따라서 수행시간은 N * N => Big O 표기법으로 인하여 O(N^2) 이다.
*/
