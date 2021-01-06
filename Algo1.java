  class Solution {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int base = 0;
        int max = 0;
        int needToChange=A.length;;
        for (int k = 0; k < A.length; k++) {
            int X = A[k];
            if (X >= 1 && X <= N) {

                if (result[X - 1] < base) {
                    result[X - 1] = base;
                }
                result[X - 1]++;
                if (max < result[X - 1]) {
                    max = result[X - 1];
                }
            }
            if (X == N + 1) {
                base = max;
                needToChange= X-1;

            }
        }
        for (int i = 0; i < needToChange; i++) {
            if (result[i] < base) {
                result[i] = base;
            }
        }
        return result;
        }
        