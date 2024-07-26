class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int start = 0;
        int end = 0;
        long sum = 0;
        int indexDiff = Integer.MAX_VALUE;
        
        while(true){
            if(sum >= k){
                if(sum == k && end - 1 - start < indexDiff){
                    indexDiff = end - 1 - start;
                    answer[0] = start;
                    answer[1] = end - 1;
                }
                sum -= sequence[start++];
            }
            else{
                if(end == sequence.length){
                    break;
                }
                sum += sequence[end++];
            }
        }
        return answer;
    }
}