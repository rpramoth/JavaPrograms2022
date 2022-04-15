
public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		int arr[] = {10,30,20,40,10,30,50,60,90,70};
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=0;
					arr[j]=0;				 
				}
			}

			if(arr[i]>0)
				System.out.println(arr[i]);
			
		}


	}

}
