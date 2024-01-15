import java.util.*;
public class Simple{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Enter char size is "+size);
        int[] ele = new int[size];
        for (int i=0;i<size;i++){
            ele[i] = scanner.nextInt();
        }

        int x = 0;
        System.out.println("Enter no. to find");
        x = scanner.nextInt();
        for (int i=0;i<size;i++){
    if(ele[i] == x){
        System.out.println( "match found at index"+(i+1) );
    }

        }
    }
}