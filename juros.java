import java.text.DecimalFormat;
import java.util.Scanner;

public class juros {

    public static void main(String[] args) {
        
        //Declaração de variavel
        double Juros, Capital, Taxa, Prazo;
        int Tempo;

        //Criação e instância do objeto de entrada e decimal
        Scanner entrada = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //Apresentação
        System.out.println("\n\t\t\t -- Calculadora de Juros Simples --\n");

        //Entrada
        System.out.println("Informe a Capital: ");
        Capital = entrada.nextDouble();
        System.out.println("Informe a Taxa De Juros: ");
        Taxa = entrada.nextDouble();
        System.out.println("Informe o Prazo (Meses):");
        Tempo = entrada.nextDouble();
    }
}