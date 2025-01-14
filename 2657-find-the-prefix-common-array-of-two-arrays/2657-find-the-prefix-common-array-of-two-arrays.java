class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] r = new int[n];
        int[] c = new int[n + 1];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            c[A[i]]++;
            if(c[A[i]] == 2) cnt++;
            c[B[i]]++;
            if(c[B[i]] == 2) cnt++;
            r[i] = cnt;
        }
        return r;
    }
}