
public class CommonNumbersInTwoArrays {

	public static void main(String[] args) {
		int[] input1 = {10,30,10,5,60,80,90};
		int[] input2 = {200, 400, 20,100,30,20,30,10};

		for(int i =0;i<input1.length;i++) {
			for(int j=0;j<input2.length;j++) {
				if(input1[i]==input2[j]) {
					System.out.print(input1[i]+" ");
				}
			}
		}
		
	}
	
}
