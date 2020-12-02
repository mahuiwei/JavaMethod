package Sort;

public class HeapSort {
    public static void main(String[] args) {
        int tree[] = {2,5,3,1,10,4};
        HeapSort heapSort = new HeapSort();
       // heapSort.heapfy(tree,6,0);
        heapSort.heap_sort(tree,6);

        int i;
        for(i = 0; i < 6; i++){
            System.out.println("第"+ i + "个数字为 ："+ tree[i]);
        }
    }
    public void heapify(int tree[], int n, int i){
        if (i >= n){
            return;
        }
        int c1 = i * 2 + 1;//左子节点
        int c2 = i * 2 + 2;//右子节点
        int max = i;//假设父节点为三个当中的最大值
        //找到最大值，找到最大值与i做交换，当i已经是最大值的时候，就不用做交换了
        if (c1 < n && tree[c1] > tree[max]){
            max = c1;
        }
        if (c2 < n && tree[c2] > tree[max]){
            max = c2;
        }
        if (max != i){
            swap(tree,max,i);
            heapify(tree, n, max);
        }
    }
    void swap(int tree[], int a, int b){
        int temp;
        temp = tree[a];
        tree[a] = tree[b];
        tree[b] = temp;
    }
    void build_heap(int tree[], int n){
        int last_node = n - 1;
        int parent_node = (last_node - 1) / 2;
        for (int i = parent_node; i >= 0; i--){
            heapify(tree, n, i);
        }
    }
    void heap_sort(int tree[], int n){
        build_heap(tree, n);
        for (int i = n - 1; i >= 0; i--){
            swap(tree, i , 0);
            heapify(tree, i, 0);
        }
    }

/*    public void heapfy(int tree[], int n, int i){
        if (i >= n){
            return;
        }
        int c1 = i * 2 + 1;//左子节点
        int c2 = i * 2 + 2;//右子节点
        int max = i;//假设父节点为三个当中的最大值
        //找到最大值，找到最大值与i做交换，当i已经是最大值的时候，就不用做交换了
        if (c1 < n && tree[c1] > tree[max]){
            max = c1;
        }
        if (c2 < n && tree[c2] > tree[max]){
            max = c2;
        }
        if (max != i){
            swap(tree,max,i);
            heapfy(tree, n, max);
        }
    }
    public static void swap(int tree[],int a,int b){
        int temp;
        temp = tree[a];
        tree[a] = tree[b];
        tree[b] = temp;
    }

     void build_heap(int tree[], int n){
        int last_node = n - 1;
        int parent = (last_node - 1)/2;
        for (int i = parent; i >= 0; i--){
            heapfy(tree, n, i);
        }
    }

    void heap_sort(int tree[], int n){
        build_heap(tree, n);
        for (int i = n - 1; i >= 0; i--){
            swap(tree,i, 0);
            heapfy(tree ,i ,0);//砍断操作，默认就是堆减少一个（i代表的是当前这个树的节点个数）
        }
    }*/

}
