import java.util.Arrays;

public class ThirdLargestInArray {


	public static void main(String[] args) {
		int arr[]= {87,98,99,56,74,38,2,65};
		Arrays.sort(arr);
		for(int i =0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		System.out.println(arr[arr.length-3]);

	}
}
