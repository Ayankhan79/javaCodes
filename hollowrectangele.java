import java.util.*;

public class java1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Totrows = sc.nextInt();
        int Totcols = sc.nextInt();
        Hollow_rect(Totrows, Totcols);
    }

    public static void Hollow_rect(int Totrows, int Totcols) {
        for(int i=1;i<=Totrows;i++){
            for (int j=1;j<=Totcols; j++) {
                if(i==1 || i==Totrows || j==1 || j==Totcols){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    
}
