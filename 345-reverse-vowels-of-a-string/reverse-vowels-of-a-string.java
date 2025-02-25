class Solution {
    public boolean isVowel(char D){
        
        if(D=='a' || D=='e' || D=='i' || D=='o'|| D=='u' || D=='A' || D=='E' || D=='I' || D=='O'|| D=='U'){
            return true;
        }
        else{
            return false;
        }
    }
    public String reverseVowels(String s) {
        char[] c=s.toCharArray();
        int left=0;
        int right=c.length-1;
        String s1="";
        while(left<right){
            while(left<right && !isVowel(c[left])){
                left++;

            }
            while(left<right &&!isVowel(c[right])){
                right--;
            }
            if(left<right){
                char temp=c[left];
                c[left]=c[right];
                c[right]=temp;
                left++;
                right--;
            }
        }
        for(char num:c){
            s1+=num;
        }
        return s1;
        
    }
}