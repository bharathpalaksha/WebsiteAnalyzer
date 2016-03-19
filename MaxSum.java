package sample;

public class MaxSum {
	
	public static void main(String[] args) {
		
		int[] numbersList = {4,15,2};
		
		int big = numbersList[0], sum=0;
		
		
		for(int k=2;k<numbersList.length;k++) {
		    for(int j=0;j<numbersList.length;j++) {
		        sum=0;
		        for(int i=j;i<numbersList.length;i+=k) {
			        sum+=numbersList[i];
			        if(sum>big) {
				        big = sum;
			        }
		        }
		    }
		}
		
		System.out.println(big);
		
	}

}
