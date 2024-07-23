class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] tStringList = t.split("");
        String[] pStringList = p.split("");
        int[] tList = new int[tStringList.length];
        int[] pList= new int[pStringList.length];
        
        for(int i = 0; i < tStringList.length; i++){
            tList[i] = Integer.parseInt(tStringList[i]);
        }
        
        for(int i = 0; i < pStringList.length; i++){
            pList[i] = Integer.parseInt(pStringList[i]);
        }
        
        for(int i = 0; i < tList.length - pList.length + 1; i++){
            for(int j = 0; j < pList.length; j++){
                if(tList[i + j] < pList[j]){
                    answer++;
                    break;
                }
                else if(tList[i + j] > pList[j]){
                    break;
                }
                else if(j == pList.length - 1 && tList[i + j] == pList[j]){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}