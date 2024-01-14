package DataStructuresIntro;

public class MergeSort {
    public static void main(String[] args) {
         int arr[] = {3,5,1,4,6,2};

         System.out.println("Before Sorting");
         printArr(arr);

         mergeSort(arr, 0, arr.length-1);

         System.out.println();

         System.out.println("After Sorting");
         printArr(arr);
    }

    public static void printArr(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);
        }
    }
 
    private static void merge(int[] arr, int left, int mid, int right){
         int n1 = mid-left+1;
         int n2 = right - mid;

         int lArr[] = new int[n1];
         int rArr[] = new int[n2];

         for(int i = 0; i<n1; i++){
            lArr[i] = arr[left + i];
         }

         for(int i = 0; i<n2; i++){
            rArr[i] = arr[mid+1 + i];
         }

         int x = 0;
         int y = 0;
         int k = left;

         while(x<n1 && y<n2){
            if(lArr[x] <= rArr[y]){
                arr[k] = lArr[x];
                x++;
            }else{
                arr[k] = rArr[y];
                y++;
            }
            k++;
         }

         while(x<n1){
            arr[k] = lArr[x];
            x++;
            k++;
         }

         while(y<n2){
            arr[k] = rArr[y];
            y++;
            k++;
         }

         
    }
}

// O(n log n)