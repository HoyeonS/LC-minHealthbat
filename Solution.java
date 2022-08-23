class Solution {
    public long minimumHealth(int[] damage, int armor) {
        int max_d = 0;
        for(int i = 0; i < damage.length; i++) {
            if(damage[max_d] < damage[i])
                max_d = i;
        }
        long minhp = 1;
        for(int i = 0; i < damage.length; i++) {
            if(i == max_d){
                minhp += Math.max(damage[i] - armor, 0);
            }
            else
            {
                minhp += damage[i];
            }
        }
        return minhp;
    }
}