///	Best Case:O(nlogn)
//  Average Case:O(nlogn)
/// Worst Case:O(nlogn)
public class HeapSortt {
	private static int heapSize;
	
    public static void HeapSort(int a[]){
    	Build_Max_Heap(a);
    	
    	for(int i=heapSize;i>=0;i--){
    		swap(a,0,i);
    		heapSize=heapSize-1;
    		Max_Heapify(a,0);
    	}
    }
   public static void Build_Max_Heap(int a[]){
	   heapSize=a.length-1;
    	for(int i=heapSize/2;i>=0;i--){
    		Max_Heapify(a,i);
    	}
    }
    public static void Max_Heapify(int a[],int i){
    	
    		int l=2*i;
    		int r=2*i+1;
    		int largest=i;
    		if(l<=heapSize&&a[l]>a[i])largest=l;
    		else largest=i;
    		if(r<=heapSize&&a[r]>a[largest])largest=r;
    		if(largest!=i){
    			swap(a,i,largest);
    		Max_Heapify(a,largest);
    		}
    }
	public static void main(String[] args) {
		int a[]={2,1,3,4,1,0,9,2};
		HeapSort(a);
		for(int i=0;i<a.length;i++)System.out.print(a[i]+" ");

	}
	public static void swap(int a[],int i,int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
