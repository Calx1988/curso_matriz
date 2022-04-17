import java.util.Scanner;
import util.Miscelaneous;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n2 = sc.nextInt();
        int[][] mat = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("Element [" +i+ "][" + j + "]: ");
                int n = sc.nextInt();
                mat[i][j] = n;
            }
        }
        System.out.println();
        System.out.println("----Matriz-----");
        for (int i = 0; i < n1; i++) {
            System.out.println();
            for (int j = 0; j < n2; j++) {
                System.out.print(" " + mat[i][j]);
            }
        }
        System.out.println();
        System.out.print("Enter a number to find its position and neighbors: ");
        int n3=sc.nextInt();
        int count=0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if(mat[i][j]==n3){
                    count++;
                    System.out.println(count+ Miscelaneous.ordinalSymbol(count)+" position of the element "+n3+": ["+i+"]["+j+"]");
                    if(i-1>=0) {
                        System.out.println("Element above: "+mat[i-1][j]);
                    }
                    if(j-1>=0){
                        System.out.println("Element to the left: "+mat[i][j-1]);
                    }
                    if(j+1<n2){
                        System.out.println("Element to the right: "+mat[i][j+1]);
                    }
                    if(i+1<n1){
                        System.out.println("Element below: "+mat[i+1][j]);
                    }
                }
            }
        }

    }
}