class Solution {
    public String interpret(String command) {
        int n=command.length();
        int k=0;
         char []ch=new char[n];
        for(int  i=0;i<n;i++){
            char ch1=command.charAt(i);
            if(ch1=='('&&command.charAt(i+1)==')'){
                ch[k++]='o';
            }
            else if(ch1!='('&&ch1!=')')ch[k++]=ch1;
        }
        StringBuilder b=new StringBuilder();
        for(int i=0;i<k;i++)b.append(ch[i]);
        return new String(b);
    }
}
