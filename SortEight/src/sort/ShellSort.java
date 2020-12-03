package sort;

public class ShellSort {
    public static void main(String[] args) {
        int arr[] = {2,5,3,1,10,4};
        ShellSort shellSort = new ShellSort();
        shellSort.Shell_sort(arr);
        int i;
        for(i = 0; i < 6; i++){
            System.out.println("第"+ i + "个数字为 ："+ arr[i]);
        }
    }
    public void Shell_sort(int arr[]){
        if (arr.length == 0){
            return;
        }
        int gap = arr.length / 2;
        while(gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    if (arr[j] > arr[j - gap]) {
                        swap(arr, j, j - gap);
                    }
                }
            }
            gap = gap / 2;
        }
    }
    void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
