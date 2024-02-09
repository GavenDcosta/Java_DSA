package Problems.BitWise_Operators;

// XOR follows associativity 
// eg [-2,3,2,4,-5,5,-1] => this will return 3 if we add all the numbes

public class find_unique_in_array {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};

        System.out.println(returnUnique(arr));
     }

    static int returnUnique(int[] arr){
        int ans = 0;
        for(int i = 0; i < arr.length; i ++){
          ans ^= arr[i];
        }

        return ans;
    }   
}

