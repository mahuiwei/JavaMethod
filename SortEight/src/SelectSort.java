public class SelectSort {
    public static void main(String[] args) {
        int arr[] = {2,5,3,1,10,4};
        SelectSort selectSort = new SelectSort();
        selectSort.select_Sort(arr);

        int i;
        for(i = 0; i < 6; i++){
            System.out.println("第"+ i + "个数字为 ："+ arr[i]);
        }
    }

    public void select_Sort(int arr[]){
        if (arr.length == 0){
            return;
        }
        for(int i = 0; i < arr.length; i++){
            int maxIndex = i;
            for (int j = i; j < arr.length - 1; j++){
                if(arr[maxIndex] < arr[j + 1]){
                    maxIndex = j + 1;
                }
            }
            swap(arr, maxIndex, i);
        }
    }
    void swap(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
