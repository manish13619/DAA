// Worst Case:O(n^2)
// Best Case:O(nlogn)
// average Case:O(nlogn)
public class QuickSortt {
	public static void QuickSort(int a[],int p,int r){
		if(p<r){
			int q=Partition(a,p,r);
			QuickSort(a,p,q-1);
			QuickSort(a,q+1,r);
		}
	}
	public static int Partition(int a[],int p,int r){
		int x=a[r];
		int i=p-1;
		for(int j=p;j<=r-1;j++){
			if(a[j]<=x){
				i=i+1;
				a[j]=(a[i]+a[j])-(a[i]=a[j]);
				
			}
			
		}
		a[r]=(a[r]+a[i+1])-(a[i+1]=a[r]);
		return i+1;
	}
	public static void main(String[] args) {
		int a[]={2,1,3,4,1,0,9,2};
		QuickSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)System.out.print(a[i]+" ");

	}

}
