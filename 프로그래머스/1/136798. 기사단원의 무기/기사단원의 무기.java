class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        for(int i = 2; i <= number; i++){
            int temp = 0;
            for(int j = 1; j <= (int)Math.sqrt(i); j++){
                if(temp > limit){
                    break;
                }
                if(Math.sqrt(i) == j){
                    temp += 1;
                }
                else if(i % j == 0){
                    temp += 2;
                }
            }
            answer += temp > limit ? power : temp;
        }
        return answer;
    }
}