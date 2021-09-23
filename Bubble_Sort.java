import java.util.Scanner;
import java.util.ArrayList;

public class Bubble_Sort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int swap = 0, x=0, y = 0, z=0;
        boolean loop = true;
        
        System.out.println("How many number in the list: ");
        z = input.nextInt();
        System.out.println("Enter your number: ");
        
        while(x<=z){
            arr.add(input.nextInt());
            x++;
        }

        while (loop){
            
            while(y<arr.size()-1){
                if (arr.get(y)>arr.get(y+1)){
                Swaping(y, y+1, arr);
                y++;
                swap++;
            }
                else{
                y++;
            }
        }
            if (swap>=1){
                loop = true;
                swap = 0;
                y=0;
            }
            else{
                loop = false;
            }
        }
        

        System.out.println(arr);
    }
    
    public static void Swaping(int a, int b, ArrayList<Integer> arrs){
        int medium1 = 0, medium2 = 0;
        medium1 = arrs.get(a);
        medium2 = arrs.get(b);
        arrs.set(a,medium2);
        arrs.set(b,medium1);
    }
}
