public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2,5,3,1,10,4};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertion_Sort(arr);
        int i;
        for(i = 0; i < 6; i++){
            System.out.println("第"+ i + "个数字为 ："+ arr[i]);
        }
    }
    public void insertion_Sort(int arr[]){
        if (arr.length == 0){
            return;
        }
        int current;
        for (int i = 0; i < arr.length; i++){
            current = arr[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < arr[preIndex]){//向有序序列里面扫描并添加
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
    }
}
