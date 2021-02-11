import java.util.*;
public class NewSort {

	public static void main(String[] args) {
		int n;  
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter size of array :");
		n=sc.nextInt();    
		int[] arr = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
			arr[i]=sc.nextInt();  
		for (int i = 0; i < n-1; i++) 
        {  
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j;  
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
		System.out.print("Sorted array :");
		for (int i=0; i<n; ++i) 
            System.out.print(" " + arr[i]);

	}

}
