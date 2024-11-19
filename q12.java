import javax.swing.*; 
import java.util.Scanner; 
public class q12 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the marks oof three subjects:"); 
        int phy = sc.nextInt(); 
        int mat = sc.nextInt(); 
        int chem = sc.nextInt(); 
        int t = phy + mat + chem; 
        int pm = phy + mat; 
        if (phy >= 70 && chem >= 60 && mat >= 70 
                && (t >= 225 || pm >= 150)) ; 
                
        System.out.println("eligible"); 
                
         { 
            System.out.println("not eligible"); 
 
        } 
    } 
} 