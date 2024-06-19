public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        /**
         * Terminal e argumentos (parte 1)
         * 
         * - Com a JVM (Java Virtual Machine) configurada, podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional.
         * - Neste caso, será executado um programa Java via terminal como MS-DOS ou terminal do VSCode.
         * - 
         */
        System.out.println("Olá, fui executado pelo terminal!");

        /**
         * Roteiro para executar em um terminal.
         * 
         * 1- Executar esse código no VSCode.
         * 
         * 2- No projeto Java existe uma pasta chamada bin, que contém os arquivos compilados e que estarão disponíveis para execução. Nesta pasta estão os arquivos com extensão .class que representam o bytecode. Neste caso, haverá o arquivo MinhaClasse.class.
         * 
         * 3- Identificar a localização da pasta do projeto. Neste caso será: C:\estudos\dio-trilha-java-basico\java-terminal\
         * 
         * 4- Abrir o terminal, inserir a localização por meio de : 
         * cd C:\estudos\dio-trilha-java-basico\java-terminal\
         * 
         * 5- Em seguida, entre na pasta bin: cd bin
         * 
         * 6- Por último, insira o comando java MinhaClasse no terminal. (sem a extensão class)
         * 
         * OBS: Caso tenha que alterar o código para exibição da mensagem, apagar o arquivo MinhaClasse.class dentro da pasta bin. Salvar o conteúdo. Se estiver na pasta bin pelo terminal , executar java MinhaClasse .
         * 
         */
    }
}
