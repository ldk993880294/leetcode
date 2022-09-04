public class ReplaceSpace {
    public static void main(ComString[] args) {
        StringBuffer input=new StringBuffer("A B");
        System.out.println(replaceSpace(input));
    }

    private static String replaceSpace(StringBuffer input) {
        int P1=input.length()-1;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                input.append("  ");
            }
            int P2=input.length()-1;
            while(P1>0&&P2>P1){
                char c=input.charAt(P1--);
                if(c==' '){
                    input.setCharAt(P2--,'0');
                    input.setCharAt(P2--,'2');
                    input.setCharAt(P2--,'%');
                }else{
                    input.setCharAt(P2--,c);
                }
            }
        }
        return input.toString();
    }
}
