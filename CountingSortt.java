
public class CountingSortt {
	private static int k=101;
	public static void countingSort(int a[],int b[],int k){
		int c[]=new int[k];
		for(int j=0;j<a.length;j++){
			c[a[j]]=c[a[j]]+1;
		}
		for(int i=1;i<k;i++){
			c[i]=c[i]+c[i-1];
		}
		for(int j=a.length-1;j>=0;j--){
			b[c[a[j]]]=a[j];
			c[a[j]]=c[a[j]]-1;
		}
	}
	public static void main(String[] args) {
		
		int a[]={0,2,4,3,1,5,4,2,6,8,9,20,30,90,99};
		int b[]=new int[k];
		countingSort(a,b,k);
		for(int i=1;i<a.length;i++)System.out.println(b[i]);
		
	}

}
