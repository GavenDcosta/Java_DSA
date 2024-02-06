package Problems.Binary_Search;

public class H_Index_2 {
    public static void main(String[] args) {
        int[] citations = {0,1,3,5,6};

        System.out.println(hIndex(citations));
    }

    static int hIndex(int[] citations) {
        int s = 0;
        int e = citations.length - 1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(citations[mid] < citations.length - mid){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }

        return citations.length - s;
    }
}
