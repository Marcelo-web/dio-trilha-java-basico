import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args) {
        /*
           Terminal e argumentos (Parte 4)
         *
         *  Uso de Scanner
         * 
         *  - Nos exemplos anteriores, os dados digitados pelo usuário do sistema eram enviados em uma única linha no terminal ou por objeto json na IDE, e foi necessário informar os valores nas posições correspondentes. 
         * - Essa abordagem pode ser propícia a erros de execução.
         * - Para isso, para que as entradas sejam mais seguras e intuitivas, será abordado sobre a classe Scanner.
         * - Uma das finalidades do Scanner é obter parâmetros de entrada via terminal de forma que exista uma melhor experiência ao executar o programa.
         * 
         * OBS: Em relação à classe Scanner, em algumas situações podem ocorrer erros relacionados ao buffer de entrada:
         * 
         * - Problemas com nextLine() após outros métodos:
         * - O método nextLine() lê a linha inteira, incluindo o caractere de nova linha(quebra de linha) deixado pelo método anterior. Portanto, se usar o next() ou nextInt() antes de nextLine(), o buffer não será limpo corretamente, resultando em comportamento inesperado. 
         * - Solução:  Use nextLine() imediatamente após os métodos que não lêem a linha completa.
         * 
         * - Erro ao ler caracter individual
         * - O Scanner não oferece um método para ler dados do tipo char.
         * - Solução: Para isso use next().charAt(0) para obter o primeiro caractere de entrada.
         * 
         */

        // Um objeto scanner espera a entrada do usuário pelo teclado.
        // Aqui foi usada a configuração do local como US.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();
        
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ", tenho " + idade + " anos e minha altura é "
                + altura + "cm.");
        
        scanner.close();

    }
}
