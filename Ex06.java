import java.util.Scanner;

public class Ex06 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Temperatura em Celsius");
            double tempC = leitor.nextDouble();
        
            double tempF = (9 * tempC + 160) / 5;
            
            System.out.println("Temperatura em Fahrenheit: " + tempF + "º");
        
        }
        leitor.close();
    }
}
