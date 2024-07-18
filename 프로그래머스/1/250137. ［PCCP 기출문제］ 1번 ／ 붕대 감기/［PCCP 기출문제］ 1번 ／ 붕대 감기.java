class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int currentAttack = 0;
        int maxHealth = health;
        int bandageTime = 0;
        for (int time = attacks[0][0]; time <= attacks[attacks.length - 1][0]; time++){
            if (attacks[currentAttack][0] == time) {
                bandageTime = 0;
                health -= attacks[currentAttack][1];
                currentAttack++;
                if (health <= 0) {
                    break;
                }
            }
            else {
                health += bandage[1];
	            bandageTime++;
	            if ( bandageTime == bandage[0] ) {
                    health += bandage[2];
                    bandageTime = 0;
	            }
                health = health > maxHealth ? maxHealth : health;  
            }
        }
        return health <= 0 ? -1 : health;
    }
}