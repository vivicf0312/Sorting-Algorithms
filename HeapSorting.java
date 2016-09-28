
public class HeapSorting {

	public static void main(String[] args) {
		int arr[]={3,2,1,5,4};
		System.out.print("Unsorted array"+java.util.Arrays.toString(arr));
		System.out.println(" ");
		heap(arr);
		System.out.println("Sorted array"+java.util.Arrays.toString(arr));
	}
	static void heap(int arr[]){
		buildheap(arr);
		for(int i=arr.length-1;i>=1;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	static void buildheap(int arr[]){
		for(int i=1;i>=0;i--){
			heapify(arr,arr.length,i);
		}
//		for(int i=arr.length/2-1;i>=0;i--){
//			heapify(arr,arr.length,i);
//		}
	}
	static void heapify(int arr[],int length,int i){
		int max,child;
		child=2*i+1;
		max=i;
		if(child<length){
			if(arr[child]>arr[max]){
				max=child;
			}
		}
		if(child+1<length){
			if(arr[child+1]>arr[max]){
				max=child+1;
			}
		}
		if(max!=i){
			int temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;
			heapify(arr,length,max);
		}
	}

}
