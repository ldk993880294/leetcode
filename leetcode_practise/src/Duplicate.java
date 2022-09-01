public class Duplicate {
    public static void main(String[] args) {
        int[] input=new int[]{2, 3, 1, 0, 2, 5};
        System.out.println(duplicate(input));
    }

    private static int duplicate(int[] input) {
        int res=0;
        for(int i=0;i<input.length;i++){
            for(int j=i+1;j<input.length;j++){
                if(input[i]==input[j]){
                    res=input[i];
                }
            }
        }
        return res;
    }
}
