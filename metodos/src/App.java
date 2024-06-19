public class App {
    public static void main(String[] args) throws Exception {

        /**
         * MÉTODOS
         * 
         * - São definidos no interior de classes (não existem métodos globais).
         * - Representam uma ação específica tendo uma responsabilidade única.
         * - São representados por verbos no infinitivo.
         * - É facultativo ter parâmetros de entrada bem como um retorno. 
         * - Quando não retornam um valor, possuem a palavra void no método.
         * - Devem ser nomeados usando padrão camelCase.
         * - Podem ser acessados de acordo com sua visibilidade (dentro da própria classe, no pacote, em classes herdadas ou somente na própria classe).
         * - O nome do método está vinculado a sua lógica. Por ex: o método validar, deve sempre retornar um booleano, para indicar se é válido ou não.
         * - Se um método possui muitos parâmetros que podem ser representados por uma única abstração de um objeto, é interessante criar uma classe com todos os seus atributos. Por ex: Em um método gravarCliente que recebe vários parâmetros relacionados ao cadastro de um cliente, pode ser criada uma classe cliente com todos os atributos necessários. Desta forma,  posso definir um único parâmetro do tipo Cliente no método.
         * 
         * Aspectos relacionados:
         * - Proposta do método => Qual a sua finalidade?
         * - Tem parâmetros de entrada?
         * - Retorno ou ausência de retorno?
         * - Apresenta risco de exceções?
         * - Visibilidade do método
         */

    }
    
    public static void abrirConexao() throws Exception {
        // Toda lógica vem aqui
    }

    public static int somar(int n1, int n2) {
        return n1 + n2;
    }
}
