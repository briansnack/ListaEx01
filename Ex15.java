import java.text.DecimalFormat;

public class Ex15 {
    public static void executar(){
            double x1 = 0, y1 = 5;
            double x2 = 10, y2 = 20;

            double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
           
            DecimalFormat df = new DecimalFormat("#.##");
            String distanciaFormatada = df.format(d);
            System.out.println("Distância: " + distanciaFormatada);
    }
}
