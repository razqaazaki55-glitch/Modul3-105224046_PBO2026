import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {

        for(int z = 1; z <= 50; z= z+1){
            if(z % 3 == 0 || z % 5 == 0){
                continue;
            }
            System.out.print(z + " ");
        }
    }
}