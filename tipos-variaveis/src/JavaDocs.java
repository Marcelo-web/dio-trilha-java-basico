public class JavaDocs {
    public static void main(String[] args) {
        /**
         * Documentação
         * 
         * - Permite estudar, analisar e organizar as funcionalidades de uma classe, método ou alguma estrutura de código dentro de um contexto dependendo dos requisitos do projeto.
         * -  Os comentários não devem ser usados com o intuito de ignorar as boas práticas de programação relacionadas à linguagem, de modo a explicar, por exemplo, o que significa a nomenclatura de uma variável, método, classe, ou qualquer outra estrutura de código. A nomenclatura deve ser legível, clara, sem abreviações e que possua uma responsabilidade única, que ao ser visualizada permita discernir e elucidar o que está sendo feito naquele contexto, sem nenhum tipo de ambiguidade. 
         * 
         * Para criar uma documentação:
         * => javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
         * 
         * - Explicação: -d significa diretório . Volta-se uma pasta, sendo criada uma pasta docs apontando para os arquivos .java da pasta src para criação da documentação.
         */

        JavaDocs.Saudacao saudacao = new JavaDocs().new Saudacao();
        System.out.println(saudacao.exibir("Olá", "Fulano"));
    }

    /**
     * <h1>Saudacao</h1>
     * Realiza operação relacionada à saudação.
     * <p>
     * <b>Note:</b> Leia com atenção a documentação.
     * @author Marcelo
     * @version 1.0
     * @since 19/06/2024
     */
    public class Saudacao {

        /**
         * Este método é utilizado para exibir um tipo de saudação a um usuário.
         * @param tipoSaudacao representa um tipo de saudação (olá, oi, opa, alô, salve,etc).
         * @param usuario nome do usuário que irá receber a saudação.
         * @return String - tem como resultado a saudação a um usuário.
         */
        public String exibir(String tipoSaudacao, String usuario) {
            return tipoSaudacao.concat(", ").concat(usuario).concat("!");
        }
    }
}
