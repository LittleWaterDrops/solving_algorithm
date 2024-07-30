import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < ingredient.length; i++){
            stack.push(ingredient[i]);
            if(stack.size() > 3 && stack.peek() == 1){
                for(int j = 3; j > 0; j--){
                    if(stack.get(stack.size() - 1 - (4 - j)) != j){
                        break;
                    }
                    else{
                        if(j == 1){
                            answer++;
                            for(int k = 0; k < 4; k++){
                                stack.pop();
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}