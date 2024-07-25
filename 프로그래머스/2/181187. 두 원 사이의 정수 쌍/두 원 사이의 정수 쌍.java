class Solution {
    public long solution(int r1, int r2) {
        long answer = (long)(r2 - r1 + 1)*4L;
        for(int i = 1; i < r2; i++){
            int bigY = (int)Math.sqrt((long)r2*r2 - (long)i*i);
            int smallY = (int)Math.sqrt((long)r1*r1 - (long)i*i);
            answer += (long)(bigY - smallY)*4L;
            if(i<r1 && Math.sqrt((long)r1*r1-(long)i*i)%1 ==0){
                answer+=4L;
            } 
        }
        return answer;
    }
}