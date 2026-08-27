import java.util.Scanner;
public class LP_Atividade_N1_3_01_2040482612044{
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);


        System.out.print("Quantidade de leituras: ");
        int quantidadeLeitura = s.nextInt();

        double [] temperatura = new double [quantidadeLeitura];

        for (int i = 0; i < quantidadeLeitura; i++){
            System.out.print("Temperatura (°C): ");
            temperatura[i] = s.nextDouble();

        }

    
        System.out.print("---- Leituras Registradas ----");
        for (int i = 0; i < temperatura.length; i++){
           System.out.printf("\nLeitura [%d]:  %.1f°C%n", i, temperatura[i]);
        }


        System.out.print("---- Acesso direto ----");
        System.out.printf("\nPrimeiro índice(0): %.1f°C%n", temperatura[0]);

        System.out.printf("Último leitura (índice %d): %.1f°C%n", temperatura.length-1, temperatura[temperatura.length-1]);

        double maior = temperatura [0];
        double menor = temperatura [0];
        int indiceMaior = 0;
        int indiceMenor = 0;


        
        for (int i = 1; i < temperatura.length; i++){

           
            if (temperatura[i] > maior ){
                maior = temperatura [i];
                indiceMaior = i;
            }


            if (temperatura[i] < menor) {
                menor = temperatura[i];
                indiceMenor = i;
            }

        }

        System.out.println("-- Busca Linear: Extremos --");
        System.out.printf("Maior temperatura: %.1f°C (índice %d)%n", maior, indiceMaior);
        System.out.printf("Menor temperatura: %.1f°C (índice %d)%n", menor, indiceMenor);


        System.out.print("Temperatura crítica de alerta (°C): ");
        double temperaturaCritica = s.nextDouble();
 
        int indiceAlerta = -1;
        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] >= temperaturaCritica) {
                indiceAlerta = i;
                break;
            }
        }
 
        System.out.println("-- Busca Linear: Alerta --");
        if (indiceAlerta != -1) {
            System.out.printf("Alerta:  temperatura crítica atingida na leitura de índice %d (%.1f°C).%n",
                    indiceAlerta, temperatura[indiceAlerta]);
        } else {
            System.out.println("Alerta:  nenhuma leitura atingiu ou ultrapassou a temperatura crítica informada.");
        }


        

        s.close();
    }
}