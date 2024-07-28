public class MinhaClasse {
        public static void main (String [] args){

            String primerioNome = "Luis"; // Declaração e atribuição do primeiro nome na variável
            String segundoNome = "Felipe"; // Declaração e artibuição do segundo nome na variável
            String nomeCompleto = nomeCompleto(primerioNome, segundoNome); // Declarando a variável do nome completo e atribuindo o primeiro e segundo nome através da classe nomeCompleto()

            System.out.println(nomeCompleto); // Imprimindo a variável nomeCompleto após as atribuições na variável, execução da classe criada a parte.
        }

        public static String nomeCompleto (String primeiroNome, String segundoNome){
                              
            return primeiroNome.concat(" ").concat(segundoNome); // Concatenação do primeiro e segundo nome através do método .concact
        }
}