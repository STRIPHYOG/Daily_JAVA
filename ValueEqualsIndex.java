
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ValueEqualsIndex {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nuber of element:");
        int n=sc.nextInt();
        
        int arr[]= new int[n];
        System.out.println("Enter the element of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> result= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                result.add(i+1);
            }
        }
        System.out.println("Value is equal to the index:");
        for(int i=0; i<result.size();i++){
            System.out.println(result.get(i));
        }
        sc.close();
    }
}
