
public class DuplicatesInAnArray {

	public static void main(String[] args) {

		int[] input = {10,20,30,40,20,30};
		System.out.print("The duplicates are");
		for(int i =0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i]==input[j]) {
					System.out.print(" "+input[i]);
				}
			}
		}

	}

}
