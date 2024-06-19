public class Escopo {
    public static void main(String[] args) {
        /**
         *  Escopo
         *  
         *  - Ambiente onde a variável pode ser acessada (visibilidade).
         *  - Está de acordo com o bloco aonde ela foi declarada.
         *  - A variável é criada no primeiro acesso a mesma, e torna-se inacessível após o interpretador sair do bloco de execução ao qual pertence. Portanto, esta variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável. 
         *  - Classes: Em uma classe , podemos visualizar a diferença de escopos. Os atributos(variáveis) são declarados no corpo principal da classe, sendo portanto acessíveis por todos os métodos.
         *  - Métodos: Caso seja declarado uma variável dentro de um método ou venha de um parâmetro de entrada de um método, o escopo dessa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método. 
         *  - Uma parte fundamental na elaboração de algoritmos simples e complexos é determinar a localização do código em questão. Sem um domínio sobre o escopo de códigos, o projeto tende a conter falhas estruturais e comprometer a proposta principal da aplicação.
         */
    }

    public class Conta {
        // variável da classe conta
        double saldo = 10.0;

        public void sacar(Double valor) {
            // variável local de método
            double novoSaldo = saldo - valor;
        }

        public void imprimirSaldo() {
            // variável saldo disponível em toda a classe
            System.out.println(saldo);

            // novoSaldo aqui não está acessível (visível).
            // somente o método sacar conhece essa variável.
            // System.out.println(novoSaldo);
        }

        public double calcularDividaExponencial() {
            // variável local de método
            double valorParcela = 50.0;
            double valorMontante = 0.0;

            for (int x = 1; x <= 5; x++) { // x variável do escopo de bloco
                double valorCalculado = valorParcela * x;
                valorMontante = valorMontante + valorCalculado;
            }
            
            // escopo de fluxo
            // x e valor calculado nunca estarão disponíveis fora do bloco for acima

            return valorMontante;           
        }
    }
}
