import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            
            int[] num = {31, 72, 15}; 

            Arrays.sort(num);

            System.out.println("Valores em ordem crescente: ");
            for(int valor : num){
                System.out.println(valor + " ");
            }
            leitor.close();
        }
    }
}
