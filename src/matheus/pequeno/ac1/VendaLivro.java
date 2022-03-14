
package matheus.pequeno.ac1;

import java.util.Scanner;


public class VendaLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem vindo escritor! Realize o controle do lançamento de seu livro:\n"
                + "Quantidade de livros  em estoque:");
        Integer QtdEstoque = leitor.nextInt();
        
        System.out.println(" Meta de venda dos livros (%)");
        Integer MetaVendas = leitor.nextInt();
        
        System.out.println(String.format("Para atingir a meta, você precisa vender %d livros!", MetaVendas));
        
        System.out.println("Escolha os proximos passos\n"
                + "1 -  Vender livros\n"
                + "2 - Sair");
        Integer Escolha = leitor.nextInt();
        
        switch (Escolha) {
            case 1:
                System.out.println("Digite a quantidade de livros escolhidas:");
                Integer QuantidadeEscolhida = leitor.nextInt();
                
                for (int i = QuantidadeEscolhida; i > QtdEstoque+1; i++) {
                    System.out.println(String.format("Infelizmente você não possui exemplares suficientes para a venda.\n"
                           + "Quantidade disponivel: %d\n"
                          + "Digite uma quantidade valida:\n", QtdEstoque));
                    QuantidadeEscolhida = leitor.nextInt();
                }
                
                
                for (int i = 1 ; i < QuantidadeEscolhida +1; i++) {
                    QtdEstoque --;
                    System.out.println(String.format("Vendendo %d livro", i));
                }
                System.out.println(String.format("\nVocê acabou de vender %d livros!\n"
                        + "Quantidade em estoque %d\n"
                        + "Meta de Vendas: %d", QuantidadeEscolhida,QtdEstoque,MetaVendas));
                break;
                
            case 2:
                System.out.println("ATÉ LOGO");
                break;
            
                
            default:
                System.out.println(String.format("Numero invalido!!!!"));
                throw new AssertionError();
        }               
    }
    
}
