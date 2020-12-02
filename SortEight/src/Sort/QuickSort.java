package Sort;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {2,5,3,1,10,4};
        QuickSort quickSort = new QuickSort();
        quickSort.Quick_Sort(arr, 0,5);
        int i;
        for(i = 0; i < 6; i++){
            System.out.println("第"+ i + "个数字为 ："+ arr[i]);
        }
    }
    /*public void Quick_Sort(int arr[], int left, int right){
        int l = left;
        int r = right;
        if(left > right){
            return;
        }

        int temp = arr[left];
        while(l < r){
            while(temp <= arr[r] && l < r){
                r--;
            }
            while(temp >= arr[l] && l < r){
                l++;
            }
            if(l < r){
                int t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
            }
        }
        //最后将基准为i，和j相等位置的数字交换
        arr[left] = arr[l];
        arr[l] = temp;
        //递归调用左半数组
        Quick_Sort(arr, left,r - 1);
        //递归调用右半数组
        Quick_Sort(arr,l + 1, right);
    }*/

    public void Quick_Sort(int arr[], int left, int right){
        int l = left;
        int r = right;
        int temp = arr[left];
        if(left > right){
            return;
        }
        while(l < r && arr[l] > temp){
            l++;
        }
    }
}
