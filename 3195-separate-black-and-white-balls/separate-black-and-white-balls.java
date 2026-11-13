class Solution {
    public long minimumSteps(String s) {
        long ones=0,zeros=0,zerosfirst=0;
        for(char c:s.toCharArray()){
            if(c=='0'){
                zeros++;
                zerosfirst+=ones;
            }
            else{
                ones++;
            }
        }
        return zerosfirst;
    }
}