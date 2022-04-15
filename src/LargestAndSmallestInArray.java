
public class LargestAndSmallestInArray {

	public static void main(String[] args) {
		int[] input = {10,20,30,80,25,3};
		int min=input[0];
		int max=input[0];
		for(int i =0;i<input.length;i++) {	
			if(input[i]<min)
				min=input[i];
			else if(input[i]>max)
				max=input[i];
		}
		System.out.println("Minimum: "+min+" "+"Maximum: "+max);
		
	}

}
