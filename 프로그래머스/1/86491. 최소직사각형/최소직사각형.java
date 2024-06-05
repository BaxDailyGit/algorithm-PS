class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        // 두 변중 긴것을 세로, 짧은것을 가로로 두기
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        // for(int i = 0; i < sizes.length; i++) {
        //     System.out.println(sizes[i][0] + ", " + sizes[i][1]);
        // }
        
        int maxW = Integer.MIN_VALUE;
        int maxH = Integer.MIN_VALUE;
        for(int i = 0; i < sizes.length; i++) {
            if(maxW < sizes[i][0]) {
                maxW = Math.max(maxW, sizes[i][0]);
            }
            if(maxH < sizes[i][1]) {
                maxH = Math.max(maxH, sizes[i][1]);
            }
        }
        return maxW * maxH;
    }
}