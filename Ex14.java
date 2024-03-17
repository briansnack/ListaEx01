import java.util.Scanner;

public class Ex14 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            int a1 = 10;
            int n = 7;
            int r = 3;
            
            int resultado = a1 + (n - 1) * r;
            
            System.out.println("Resultado de an: " + resultado);
            
            leitor.close();
        }
    }
}
