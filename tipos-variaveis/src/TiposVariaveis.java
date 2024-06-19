public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        // # Aspectos gerais

        // ******** Declaração de variáveis ********
        // - Podem começar com $ ou _
        // - Não podem conter espaços.
        // - Não devem iniciar com números.
        // - Padrão de escrita: camel case com letras minúsculas e em palavras compostas, a primeira deve ser minúscula e as demais palavras devem começar com letra maiúscula.
        // - Evitar abreviações. Deve indicar um contexto específico com uma única responsabilidade. (Não deve ter ambiguidades).

        // ********  Tipos primitivos (valor bruto)  ********
        // - Para representar um float, o valor deve ter um F ou f ao final.
        // - Para representar um long, o valor deve ter um L ou l ao final.
        // - Tipos primitivos são armazenados na memória stack.
        // - Variável do tipo char, possui valor atribuído com aspas simples.
        // - O uso de ponto em valores do tipo float ou double, representam sua parte decimal.
        byte n1 = 1;
        short n2 = 10;
        int n3 = 20;
        long n4 = 100L;
        float n5 = 120.45F;
        double n6 = 1245.32;
        boolean n7 = true;
        char n8 = 'a';

        // - Um número de maior precisão pode receber um de menor precisão.
        int meuNumero = n2;

        // - Um número de menor precisão pode receber um de maior precisão, desde que seja feita a conversão(casting).
        n2 = (short) meuNumero;
        
        // ******** Tipos referência ********
        // - São armazenados na memória heap.
        // - Incluir também: classes, arrays, interfaces, enums e objetos.
        // - O valor de uma variável do tipo String deve vir entre aspas duplas de forma a representar um texto
        String texto = "Java";

    }
}
