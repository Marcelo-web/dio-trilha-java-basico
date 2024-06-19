public class AboutMe {
    public static void main(String[] args) {
        /**
         *  Terminal e argumentos (parte 2)
         * 
         *  O método main permite receber a informação passada no argumento como um array de strings, de modo que a execução tenha um aspecto dinâmico.
         */

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " cm.");

        /**
         *  Roteiro para execução no terminal (Semelhante ao executado na parte 1).
         *  
         *  1- Acessar a pasta do projeto pelo terminal.
         *  2- Acessar a pasta bin : cd bin
         *  3- Inserir o comando java AboutMe Fulano DeTal 30 1.75 e tecle ENTER.
         */

        /**
         *  Terminal e argumentos (parte 3)
         *  
         *  Uma IDE pode também ser usada para representação da execução via terminal.
         * 
         *  Roteiro para execução no VSCode.
         * 
         *  1- No VSCode, ir em Run(Executar).
         *  2- Depois em Add Configuration .
         *  3- Adicionar uma estrutura json do tipo:
         *  4-  {
                "type": "java",
                "request": "launch",
                "mainClass": "AboutMe",
                "args": [
                    "Fulano",
                    "DeTal",
                    "30",
                    "1.75"
                ]
            }
            5- Perceba que nesta estrutura é usado o formado json e os argumentos para a função main são passados por meio de args contendo uma lista de valores correspondentes.
            6- Executar a classe contendo o método main no VSCode.
        
            OBS: Caso queira alterar os dados passados, ir em na aba Run(Executar), depois em Open Configurations. 
            No objeto json, mainClass recebe o nome da classe.
         */
    }
}
