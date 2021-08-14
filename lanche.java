package semestre2.alan.lista_ex1.lanche;

import java.util.Scanner;

public class lanche {

    public static void main(String[] args) {
        int escolha, quantidade;
        double carrinho = 0, valor_pago = 0, troco;
        Scanner sc = new Scanner(System.in);

        do{
        System.out.println("Escolha seu pedido e digite o número referente ao produto: \n 1 - Refrigerante $5,00 \n 2 - Coxinha $2,50 \n 3 - Pastel $2,00 \n 4 - Finalizar");
        escolha = sc.nextInt();
        if (escolha == 4) {
            break;
        }
        System.out.println("Quantos desse você vai querer?");
        quantidade = sc.nextInt();
        if ( escolha == 1) {
            carrinho += 5.00 * quantidade;
        }
        if ( escolha == 2) {
            carrinho += 2.50 * quantidade;
        }
        if ( escolha == 3) {
            carrinho += 2.00 * quantidade;
        }
        quantidade = 0;
        }
        while( escolha != 4 );
        
        System.out.println("O valor a ser pago é "+ carrinho);
        System.out.println("Insira o valor pago pelo cliente");
        valor_pago = sc.nextDouble();
        troco = valor_pago - carrinho;
        System.out.println("O troco do cliente é: " + troco);
    }
}
