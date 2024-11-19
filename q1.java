import java.util.Scanner; 
public class q1 { 
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter the celcius value:"); 
        int celcius= sc.nextInt(); 
        int farenhite=((9*celcius)/5)+32; 
        System.out.println("The value in farenhite:"+farenhite); 
    } 
} 
