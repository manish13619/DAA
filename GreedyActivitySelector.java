import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.TreeMap;


public class GreedyActivitySelector {
    public static class Details{
    	int startTime;
    	int seqNo;
    }
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		String s[]=br.readLine().split(" ");
		String f[]=br.readLine().split(" ");
		TreeMap<Integer,Details>tm=new TreeMap<Integer,Details>();
		for(int i=0;i<s.length;i++){
			Details details=new Details();
			details.startTime=Integer.parseInt(s[i]);
			details.seqNo=i+1;
			tm.put(Integer.parseInt(f[i]),details);
		}
		int i=1;
		int key=0;
		int p=1;
		int a[]=new int[s.length];
		for(Entry<Integer, Details> entry : tm.entrySet()) {
			if(i==1){  
			  key = entry.getKey();
			  a[0]=key;
			  i=0;
			}
			else{
				int k2=entry.getKey();
				Details ds=new Details();
				ds=entry.getValue();
				if(ds.startTime>=key){
					a[p++]=k2;
					key=k2;
				}
			}
		}
		for(int j=0;a[j]>0;j++){
			int k=a[j];
			Details ds=new Details();
			ds=tm.get(k);
			System.out.println(ds.seqNo+" "+ds.startTime+" "+k);
		}

}
}
