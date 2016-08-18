//Worst case performance : O(n log n)
//Best case performance : O(n log n)      //erroraneous
//Average case performance : O(n log n)
public class MergeSortt {
	public static void MergeSort(int a[],int p,int r){
		if(p<r){
			int q=(p+r)/2;
			MergeSort(a,p,q);
			MergeSort(a,q+1,r);
			Merge(a,p,q,r);
		}
	}
    public static void Merge(int a[],int p,int q,int r){
    	int n1=q-p+1;
    	int n2=r-q;
    	int L[]=new int[n1+1];
    	int R[]=new int[n2+1];
    	for(int i=0;i<n1;i++)L[i]=a[p+i];
    	for(int i=0;i<n2;i++)R[i]=a[q+i];
    	L[n1]=Integer.MAX_VALUE;
    	R[n2]=Integer.MAX_VALUE;
    	int i=0;
    	int j=0;
    	for(int k=p;k<=r;k++){
    		if(L[i]<=R[j]){
    			a[k]=L[i];
    			i++;
    		}
    		else{
    			a[k]=R[j];
    			j++;
    		}
    	}
    }
	
	public static void main(String[] args) {
		int a[]={2,1,3,4,1,0,9,2};
		MergeSort(a,1,a.length-1);
		for(int i=0;i<a.length;i++)System.out.print(a[i]+" ");

	}

}
