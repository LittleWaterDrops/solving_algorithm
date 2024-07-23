class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sList = s.split("");
        int sameCount = 0;
        int diffCount = 0;
        String currentString = sList[0];
        
        for(int i = 0; i < sList.length; i++){
            if(sList[i].equals(currentString)){
                sameCount++;
            }
            else{
                diffCount++;
            }
            if(sameCount == diffCount && i < sList.length - 1){
                currentString = sList[i + 1];
                answer++;
            }
        }
        return ++answer;
    }
}