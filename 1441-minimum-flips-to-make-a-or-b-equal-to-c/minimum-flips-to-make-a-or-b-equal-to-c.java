class Solution {
    public int minFlips(int a, int b, int c) {
        int flip=0;
        while(a>0 || b>0 || c>0){
            int abit=a&1;
            int bbit=b&1;
            int cbit=c&1;
            if(cbit==1){
                if((abit | bbit)==0)
                flip+=1;}
                else{
                if(abit==1 && bbit==1){
                    flip+=2;}
                    else if(bbit==1 || abit==1){
                        flip+=1;}}
                a=a>>1;
                b=b>>1;
                c=c>>1;
        }
        return flip;
    }
}