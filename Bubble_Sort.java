import java.util.Scanner;
import java.util.ArrayList;

public class Bubble_Sort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        char x = 'e';
        int swap = 1, y = 0;
        
        System.out.println("Enter your number list for sorting(enter e for exit when done): ");
        x = input.next().charAt(0);

        while (x != 'e'){
            arr.add(Character.getNumericValue(x));
            x = input.next().charAt(0);
        }
        
        while(swap != 0){
            swap = 0;
            
            if (y>=arr.size()){
                y=0;
            }
            
            else{
                
                if (arr.get(y)>arr.get(y+1)){
                    Swaping(y, y+1, arr);
                    swap++;
                    y++;
                }
                
                else{
                    y++;
                }
            
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
