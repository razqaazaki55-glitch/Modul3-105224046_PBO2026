public class No3 {
    public static void main(String[] args) {

        for(int i = 1; i <= 50; i= i+1){
            if(i % 3 == 0 || i % 5 == 0){
                continue;
            }

            System.out.print(i + " ");
        }
    }
}