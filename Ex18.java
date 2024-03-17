import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex18 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);{
            System.out.println("Nota 1: ");
            int nota1 = leitor.nextInt();

            System.out.println("Nota 2: ");
            int nota2 = leitor.nextInt();

            System.out.println("Nota 3: ");
            int nota3 = leitor.nextInt();

            double mediaH = 3 / ((1.0 / nota1) + (1.0 / nota2) + (1.0 / nota3));
            
            DecimalFormat df = new DecimalFormat("#.##");
            String mediaFormatada = df.format(mediaH);
            System.out.println("Média Harmônica: " + mediaFormatada);
            leitor.close();
        }
    }
}
