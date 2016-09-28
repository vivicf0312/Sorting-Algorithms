
public class SelectionSorting {

	public static void main(String[] args) {
		int arr[]={3,6,1,8,4,5};
		int i,j,min,temp;
		
		for(i=0;i<6;i++){
			min=i;
			for(j=i+1;j<6;j++){
				if(arr[j]<arr[min]){ //if element at j is less than element at min position
					min=j; //then set min as j
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(i=0;i<6;i++){
			System.out.print(arr[i]+", ");
		}
	}

}
