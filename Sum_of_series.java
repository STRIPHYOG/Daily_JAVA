import java.util.Scanner;

class Sum_of_series {
    public static void main(String[] args) {
        // code here
        Scanner sc= new Scanner(System.in);
        System.out.print("N = ");
        int N= sc.nextInt();
        int Sum=0;
        for(int i=1; i<=N;i++){
            Sum +=i;
        }
        System.out.println(Sum);
    }
}