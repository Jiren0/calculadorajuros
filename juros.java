import java.text.DecimalFormat;
import java.util.Scanner;

public class juros {

    // Formatação para números decimais (2 casas)
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    //Aprensentação
    System.out.println("\n\t\t\t --CALCULADORA DE JUROS-- \t");
    System.out.println("\nEscolha o que deseja calcular:");
    System.out.println("1 - Juros (j)");
    System.out.println("2 - Capital (c)");
    System.out.println("3 - Taxa de juros (i)");
    System.out.println("4 - Prazo (n)");
    System.out.print("\nOpção: ");

    // Lê a opção do usuário
    int opcao = scanner.nextInt();

    //Direcionar para o cálculo escolhido
    switch(opcao) {
        case 1:
            calcularJuros();  // Chama função para calcular juros
            break;
        case 2:
            calcularCapital(); // Chama função para calcular capital
            break;
        case 3:
            calcularTaxa();    // Chama função para calcular taxa
            break;
        case 4:
            calcularPrazo();  // Chama função para calcular prazo
            break;
        default:
            System.out.println("Opção inválida!");
    }
    
    // Fecha o scanner
    scanner.close();
    }

    //Calcular o juros
    private static void calcularJuros() {
        Scanner scanner = new Scanner(System.in);

    //Titulo
    System.out.println("\nCálculo de Juros (j)");
    System.out.println("Fórmula: j = (c * i * n) / 100");

    //Calculo do juros
    System.out.print("Informe o capital (c): ");
    double capital = scanner.nextDouble();

    System.out.print("Informe a taxa de juros (i) em %: ");
    double taxa = scanner.nextDouble();
    
    System.out.print("Informe o prazo (n): ");
    double prazo = scanner.nextDouble();

    // Calcula os juros usando a fórmula
    double juros = (capital * taxa * prazo) / 100;

          // Exibe os resultados formatados
          exibirResultado("Juros (j)", 
          "Capital (c): R$ " + df.format(capital),
          "Taxa (i): " + taxa + "%",
          "Prazo (n): " + prazo,
          "Juros (j): R$ " + df.format(juros));

scanner.close();
}

//Calcular o Capital
private static void calcularCapital() {
    Scanner scanner = new Scanner (System.in);

    //Titulo Capital
    System.out.println("\nCalculo de Capital (C)");
    System.out.println("Formula: c = j / (i * n / 100)");

    System.out.println("Informe Juros (j): ");
    double juros = scanner.nextDouble();

    System.out.println("Informe a Taxa de Juros (i) em %: ");
    double taxa = scanner.nextDouble();

    System.out.println("Informemo prazo (n): ");
    double prazo = scanner.nextDouble();

    //Calculo da Capital]
    double capital = juros / (taxa * prazo / 100);

    //Exibe Resultados 
    exibirResultado("Capital (c)",
                    "Juros (j): R$ " + df.format(juros),
                    "Taxa  (i): " + taxa + "%",
                    "Prazo (n): " + prazo,
                    "Capital (c:) R$" + df.format(capital));

    scanner.close();
}
    //Calcular taxa de juros
    private static void calcularTaxa(){
        Scanner scanner = new Scanner(System.in);

        //Titulo e fórmula
        System.out.println("\nCalculo de taxa de juros (i)");
        System.out.println("Formula: i = (j * 100) / (c * n)");

        //Calculo da taxa
        System.out.println("Informe o juros (j): ");
        double juros = scanner.nextDouble();
       
        System.out.println("Informe o capital (c): ");
        double capital = scanner.nextDouble();
        
        System.out.println("Informe o prazo (t): ");
        double prazo = scanner.nextDouble();

        //Fórmula
        double taxa = (juros * 100) / (capital * prazo);

        //Exibir resultados
        exibirResultado("Taxa de juros (i)",
                        "Juros (j): R$ " + df.format(juros),
                        "Capital (c): R$ " + df.format(capital),
                        "Prazo (n): " + prazo,
                        "Taxa de juros (i): " + df.format(taxa) + "%");
        
        scanner.close();
    }
       //Calcular Prazo (n)
       private static void calcularPrazo(){
        Scanner scanner = new Scanner(System.in);

        // Título e Fórmula
        System.out.println("\nCálculo de prazo (n)");
        System.out.println("Fórmula: n = (j * 100) / (c * i)");

        //Solicita e lê os valores necessários
        System.out.println("Informe os juros (j): ");
        double juros = scanner.nextDouble();

        System.out.println(("Informe a capital (c) : "));
        double capital = scanner.nextDouble();

        System.out.println("Informe a taxa de juros (j) em %:");
        double taxa = scanner.nextDouble();

        //Cálculo
        double prazo = (juros * 100 ) / (capital * taxa);

        //Exibir Resultados
        exibirResultado("Prazo (n) ",
                        "Juros (j): R$ " + df.format(juros),
                        "Capital (c): R$ " + df.format(capital),
                        "Taxa (i): " + taxa + "%",
                        "Prazo (n): " + df.format(prazo));

    scanner.close();
                        
                  

       }

       
    

}
}
