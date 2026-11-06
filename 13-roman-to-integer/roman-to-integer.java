class Solution {
    public int romanToInt(String s) {
        char[] s1=s.toCharArray();
        int[] nofs=new int[s1.length];
        for(int i=0;i<s1.length;i++){
            if(s1[i]=='I')nofs[i]=1;
            else if(s1[i]=='V')nofs[i]=5;
            else if(s1[i]=='X')nofs[i]=10;
            else if(s1[i]=='L')nofs[i]=50;
            else if(s1[i]=='C')nofs[i]=100;
            else if(s1[i]=='D')nofs[i]=500;
            else if(s1[i]=='M')nofs[i]=1000;
        }
        int sum=0;
        //if(nofs[0]>=nofs[1]) sum=nofs[0];
        int i=nofs.length-1;
        while(i>=0){
            if(i>0 && nofs[i-1]<nofs[i]) {sum+=nofs[i]-nofs[i-1];i-=2;}
            else {sum+=nofs[i];i-=1;}
        }
        return sum;
    }
}