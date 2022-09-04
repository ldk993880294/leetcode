public class Duplicate {
    public static void main(ComString[] args) {
        int[] input=new int[]{2, 3, 1, 0, 2, 5};
        System.out.println(duplicate(input));
    }

    private static int duplicate(int[] input) {
        for(int i=0;i<input.length;i++){
            for(int j=i+1;j<input.length;j++){
                if(input[i]==input[j]){
                    return input[i];
                }
            }
        }
        return -1;
    }
}
