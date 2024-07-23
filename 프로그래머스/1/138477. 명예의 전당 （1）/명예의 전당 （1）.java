class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        int[] result = new int[score.length];
        int[] rank = new int[k];
        int day = 0;

        for(int i = 0; i < score.length; i++){
            for(int j = 0; j < k; j++){
                if(rank[j] < score[i]){
                    for(int l = k - 1; l > j; l--){
                        rank[l] = rank[l - 1];
                    }
                    rank[j] = score[i];
                    break;
                }
            }
            if(i < k){
                result[day++] = rank[i];
            }
            else{
                result[day++] = rank[k - 1];
            }
        }
        answer = result;
        return answer;
    }
}