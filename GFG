class Solution {
    public int myAtoi(String s) {
        // code here
        boolean zero=false;
        StringBuilder sb=new StringBuilder();
        int sign=1;
     for(int i=0;i<s.length();i++){
     char ch=s.charAt(i);
     if(ch>='1'&&ch<='9')zero=true;
     if(ch=='-'&&sb.length()==0)sign=-1;
     if(ch>='0'&&ch<='9'&&zero){
        sb.append(ch);
     }
     else if(sb.length()>0||Character.isLetter(ch)) break;
     
    }
    if(sb.length()==0) return 0;
    long num=Long.parseLong(sb.toString());
    num*=sign;
    if(num>Integer.MAX_VALUE) return Integer.MAX_VALUE;
    else if(num<Integer.MIN_VALUE) return Integer.MIN_VALUE;
    else return (int)num;
}
    
}
https://www.geeksforgeeks.org/problems/license-key-formatting/1
// User function Template for Java

class Solution {
    static String ReFormatString(String S, int K) {
        // code here
        boolean first=false;
        int k=0;
        int j=0;
        StringBuilder formatedString=new StringBuilder();
        for(int i=S.length()-1;i>=0;i--){
            char ch=S.charAt(i);
            if(ch>='a'&&ch<='z'){
                ch=(char)(ch-32);
            }
            if(Character.isLetterOrDigit(S.charAt(S.length()-i-1))&&!first){
                first=true;
                j=S.length()-i-1;
            }
            if(ch!='-')
            formatedString.append(ch);
            
            if(ch!='-'){
                k++;
            }
            if(k==K&&i>0&&i!=j){
                k=0;
                formatedString.append('-');
            }
            
        }
        return formatedString.reverse().toString();
    }
}
