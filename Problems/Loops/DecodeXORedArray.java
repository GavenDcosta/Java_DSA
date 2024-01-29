package Problems.Loops;

public class DecodeXORedArray {
    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;

        int[] result = decode(encoded, first);

        for(int i = 0; i < result.length; i ++){
            System.out.print(result[i] + " ");
        }
    }

    public static int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length+1];

        res[0] = first;

        for(int i = 0; i < encoded.length; i++){
            res[i+1] = res[i] ^ encoded[i];
        }

        return res;
    }

}
