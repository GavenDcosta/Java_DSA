package Problems.Linear_Search;

public class MinimumNumber {
    public static void main(String[] args) {
        int arr[] = {20,69,10,33,-7,99,-3};

        System.out.println(minNumber(arr));
    }

    static int minNumber(int[] arr){
        int min = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }
}
