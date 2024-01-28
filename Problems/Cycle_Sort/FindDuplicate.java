package Problems.Cycle_Sort;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};

        System.out.println(cyclicSort(nums));
    }

     static int cyclicSort(int[] arr){
        int i = 0; 
        while(i < arr.length){

            if(arr[i] != i+1){
                int correctIndex = arr[i] - 1;
                if(arr[i] != arr[correctIndex]){
                    swap(arr, i , correctIndex);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int i, int correctIndex){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

    
}
