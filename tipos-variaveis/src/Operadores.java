public class Operadores {
    public static void main(String[] args) {
        
        //  ******** Operadores atribuição **********
        // - Permitem iniciar ou sobrescrever o valor de uma variável.
        // - Representado pelo sinal de '='.
        // - Um valor é atribuído à variável. Desta forma, a variável recebe um valor.
        
        String peixe = "Atum";
        double peso = 850.00;
        
        peixe = "Salmão";

        // ********  Operadores aritméticos **********
        // - Permitem realizar cálculos aritméticos.
        // - O operador módulo permite obter o resto de uma divisão.
        double soma = 10.5 + 20.1;
        int substracao = 30 - 10;
        int multiplicacao = 2 * 3;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 5) - (3 * 7);
        
        // O operador de adição (+), quando usado em textos, permite fazer a junção do conteúdo destes.
        String nomeCompleto = "Linguagem " + "Java";

        // Análise de comportamento do operador (+) em diferentes cenários.
        String concatenacao = "?";

        // À partir do momento que encontra um caractere, faz a concatenação.
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);  // 31

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);  // 1111

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);  // 1111
        
        // Aqui, como os parênteses tem ordem precedência maior, primeiro faz a soma e depois faz a concatenação.
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);  // 13

        // Operador unário
        // - Permitem operações como incrementar, decrementar, inverter valores numéricos e booleanos.
        int numero = 5;

        // O número unário negativo não afeta a variável original.
        System.out.println(-numero);  // -5
        System.out.println(numero);   // 5

        // Para alterar a variável original (para negativo)
        numero = -numero;
        System.out.println(numero); // -5

        // Para alterar a variável original de nagativo para positivo.
        numero = numero * -1;
        System.out.println(numero); // 5
        
        // Incremento
        // Aumenta o valor de uma variável.
        // Reatribui a variável número com o valor 2 somado.
        numero = numero + 2;  // = numero++
        System.out.println(numero); // 7

        // Pós-incremento 
        // Impressão do valor e depois o seu incremento.
        // Aqui primeiro imprime o valor
        System.out.println(numero++); // 7

        // Agora depois da impressão , o valor passou a ser atualizado.
        System.out.println(numero); // 8
        
        // Pré-incremento
        // Atualiza o número e imprime o seu valor.
        System.out.println(++numero);  // 9

        // Decremento
        // Diminui o valor de uma variável.

        // Pós-decremento: imprime e depois decrementa.
        System.out.println(numero--); // 9
        System.out.println(numero);   // 8
        
        // Pré-decremento: Decrementa o valor e depois imprime. 
        System.out.println(--numero); // 7
        
        // Negação de expressão booleana
        boolean variavel = true;
        // alteração em memória
        System.out.println(!variavel);  // false

        // Aqui a variável original não é alterada.
        System.out.println(variavel);  // true

        // Para inverter uma variável booleana:
        variavel = !variavel;
        System.out.println(variavel); // false
        
        // ********  Operador ternário **********
        // Semelhante a uma instrução if, mas em apenas uma única linha.
        // Representado pelos símbolos ?:
        // Se a expressão analisada for true, o resultado será primeira opção após o "?"; do contrário será a última após o ":"
        // O tipo pode ser definido no retorno.
        int a = 5;
        int b = 6;
        String resposta = (a == b) ? "verdadeiro" : "falso";
        System.out.println(resposta); // falso
        

        // ********  Operadores relacionais  **********
        // Comparam valores dos operandos e retornam um booleano
        // Representados por >, >=, <, <=, ==, !=
        // Muito utilizados em condições para que seja feita uma tomada de decisão realizando um determinado fluxo de execução.
        int numero1, numero2;
        numero1 = 1;
        numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual ao numero2 ? " + simNao);  // false

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente de numero2 ? " + simNao); // true
        
        simNao = numero1 < numero2;
        System.out.println("numero1 é maior que numero2 ? " + simNao); // true

        // Podem ser usados com strings para avaliar o seu conteúdo.
        String nome1 = "ALINE";
        String nome2 = "ALINE";
        String nome3 = new String("ALINE");  // Outro objeto na memória
        System.out.println(nome1 == nome2); // true
        System.out.println(nome1 == nome3); // false
        
        // Para comparar conteúdos de objetos ou textos (método equals)
        System.out.println(nome1.equals(nome3)); // true


        // ********  Operadores lógicos  **********
        // Representados pelo &&(E), ||(ou)
        // Aplicada a expressões lógicas, retornam valores booleanos.
        // Podem haver expressões relacionais que estejam relacionadas por operadores lógicos.

        boolean condicao1 = true;
        boolean condicao2 = false;

        // Ambas devem ser verdadeiras, para que retorne verdadeiro.
        // Basta uma variável ser falsa, para que seja retornado falso.
        System.out.println(condicao2 && condicao1); // false
        
        // Ambas devem ser falsas, para que retorne falso.
        // Basta uma variável ser verdadeira, para que seja retornado verdadeiro
        System.out.println(condicao1 || condicao2); // true

        

    }
}
