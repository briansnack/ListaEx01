import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex20 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            int km = 12;

            System.out.println("Tempo de viagem: ");
            double tempo = leitor.nextDouble();

            System.out.println("Velocidade: ");
            double veloM = leitor.nextDouble();

            double litros = (tempo * veloM) / km;

            DecimalFormat df = new DecimalFormat("#.##");
            String litrosFormatado = df.format(litros);
            
            System.out.println("Litros gastados: " + litrosFormatado);
            leitor.close();
        }
    }
}
