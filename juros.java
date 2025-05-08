import java.text.DecimalFormat;
import java.util.Scanner;

public class juros {

    public static void main(String[] args) {
        
        //Declaração de variavel
        double juros, capital, taxa, montante;
        int tempo;

        //Criação e instância do objeto de entrada e decimal
        Scanner entrada = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //Apresentação
        System.out.println("\n\t\t\t -- Calculadora de Juros Simples --\n");

        //Entrada
        System.out.println("Informe a Capital: ");
        capital = entrada.nextDouble();

        System.out.println("Informe a Taxa De Juros: ");
        taxa= entrada.nextDouble();

        System.out.println("Informe o Prazo (Meses):");
        tempo = entrada.nextDouble();

    
        //Calculo do Juros
        juros = (capital * taxa * tempo);
        montante = (capital + juros);

        //Saida
        System.out.println("\n\t -- Resultados --");
        System.out.println("\t Capital Inicial:\t R$ " + df.format(capital));
        System.out.println("\t Taxa de Juros:\t\t" + taxa + "% ao mês");
        System.out.println("\t Periodo:\t\t" + tempo + "Meses");
        System.out.println("\t Juros Total: \tR$" + df.format(juros) );
        System.out.println("\t Montante Final: \tR$"+ df.format(montante));

        //Fechar Entrada
        entrada.close();
    }   
}