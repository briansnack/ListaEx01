import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex18 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Nota 1: ");
            double nota1 = leitor.nextDouble();

            System.out.println("Nota 2: ");
            double nota2 = leitor.nextDouble();

            System.out.println("Nota 3: ");
            double nota3 = leitor.nextDouble();

            double mediaH = 3 / ((1.0 / nota1) + (1.0 / nota2) + (1.0 / nota3));
            
            DecimalFormat df = new DecimalFormat("#.##");
            String mediaFormatada = df.format(mediaH);
            System.out.println("Média Harmônica: " + mediaFormatada);
            leitor.close();
        }
    }
}
