package homework2;
import java.util.Random;
import java.util.Scanner;
public class Shooting {
     public void startGame(int [][] square){
         Scanner scanner=new Scanner(System.in);
         Random r=new Random();
         Integer target []=new Integer[2];
         target [0]=r.nextInt(5)+1;
         target[1]=r.nextInt(5)+1;
         square[0][0]=0;
         for (int i = 1; i <6 ; i++) {
             square[0][i]=i;
             square[i][0]=i;
         }
         System.out.println("All set. Get ready to rumble!");
         while (true){
             System.out.println("enter a line for fire");
             Integer line=scanner.nextInt();
             if(!(line>=1 && line<=5)) {
                 System.out.println("enter the number again");
                 line=scanner.nextInt();
             }
             System.out.println("enter a shooting bar");
             Integer bar=scanner.nextInt();
             if(!(bar>=1 && bar<=5)) {
                 System.out.println("enter the number again");
                 bar=scanner.nextInt();
             }
             for (int i = 0; i <6 ; i++) {
                 for (int j = 0; j <6 ; j++) {
                     if(i==0){
                         System.out.print(square[0][j]);
                         System.out.print("|");
                     }
                     else if(j==0){
                         System.out.print(square[i][0]);
                         System.out.print("|");
                     }
                     else {
                         if(i==target[0] && j==target[1] && line==i && bar==j){
                             System.out.print("x");
                             System.out.print("|");
                         }
                         else if(bar==target[1] && bar==j){
                             System.out.print("*");
                             System.out.print("|");
                         }
                         else{
                             System.out.print("-");
                             System.out.print("|");
                         }
                     }
                 }
                 System.out.println();
             }
             if(line==target[0] && bar==target[1]){
                 System.out.println(" YOU WON");
                 break;
             }
         }
     }

    public static void main(String[] args) {
        Shooting s=new Shooting();
        int [][] square=new int[6][6];
        s.startGame(square);
    }
}
