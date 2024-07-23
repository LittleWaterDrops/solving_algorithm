import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int[] skipArray = new int[skip.split("").length];
        
        for(int i = 0; i < skip.split("").length; i++){
            skipArray[i] = skip.charAt(i);
        }
        Arrays.sort(skipArray);
        for(int i = 0; i < s.split("").length; i++){
            int ascCode = (int)s.charAt(i);
            for(int j = 0; j < index; j++){
                ascCode += 1;
                if(ascCode == (int)'z' + 1){
                    ascCode = (int)'a';
                }
                for(int k = 0; k < skipArray.length; k++){
                    if(ascCode == skipArray[k]){
                        ascCode += 1;
                        if(ascCode == (int)'z' + 1){
                            ascCode = (int)'a';
                        }
                    }
                }
                
                for(int k = 0; k < skipArray.length; k++){
                    if(ascCode == skipArray[k]){
                        ascCode += 1;
                        if(ascCode == (int)'z' + 1){
                            ascCode = (int)'a';
                        }
                    }
                }
            }
            answer = answer + (char)ascCode;
        }
        
        return answer;
    }
}