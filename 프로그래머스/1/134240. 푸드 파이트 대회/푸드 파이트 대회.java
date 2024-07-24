class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i] / 2; j++){
                answer += i;
            }
        }
        answer += 0;
        String[] answerList = answer.split("");
        for(int i = answerList.length - 2; i >= 0; i--){
            answer += answerList[i];
        }
        return answer;
    }
}