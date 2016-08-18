
public class MatrixChainMultiplicationn {
	public static int m[][];
	public static int s[][];
	public static void MatrixChainMultiplication(int p[]){
		int n=p.length-1;
		m=new int[n+1][n+1];
		s=new int[n+1][n+1];
		for(int i=1;i<=n;i++)m[i][i]=0;
		for(int l=2;l<=n;l++){
			for(int i=1;i<=n-l+1;i++){
				int j=i+l-1;
				m[i][j]=Integer.MAX_VALUE;
				for(int k=i;k<=j-1;k++){
					int q=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
					if(q<m[i][j]){
						m[i][j]=q;
						s[i][j]=k;
					}
				}
			}
		}
	}
	public static void PrintOptimalParentheses(int s[][],int i,int j){
		if(i==j)System.out.print("A");
		else{
			System.out.print("(");
			PrintOptimalParentheses(s,i,s[i][j]);
			PrintOptimalParentheses(s,s[i][j]+1,j);
			System.out.print(")");
		}
	}
	public static void main(String[] args) {
		
		int p[]={4,10,3,12,20,7};
		MatrixChainMultiplication(p);
		System.out.println("Minimum Cost Of Multiplication:"+m[1][p.length-1]);
		System.out.println("The order of multiplication will be:");
		PrintOptimalParentheses(s,1,p.length-1);

	}

}
