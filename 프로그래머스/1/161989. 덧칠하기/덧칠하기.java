class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int endSection = 0;
        for(int i = 0; i < section.length; i++){
            if(section[i] == 0 || endSection < section[i]){
            endSection = section[i] + m - 1;
                answer++;
            }
        }
        
        return answer;
    }
}