
public class TestaCondicional2 {

        public static void main(String[] args){
            System.out.println("testando condicionais");

            int idade = 15;
            int quantidadePessoas = 4; 
            boolean acompanhado = quantidadePessoas >= 2;

            if (idade >= 18 || acompanhado){
            	
            	System.out.println("Seja bem vindo"); 
            } else {
            	
            	System.out.println("infelizmente voce nao pode entrar");
        }

    }
}
