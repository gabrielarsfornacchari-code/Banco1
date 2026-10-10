/*

import java.util.Scanner;
 
public class Principal {
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        Calculos ca = new Calculos();
 
        System.out.println("Escolha a opção ente 1-4");
        int escolha = scanner.nextInt();
 
        if(escolha >0 && escolha <5) {
 
        System.out.println("Digite o 1° numero");
        int n1 = scanner.nextInt();
        ca.setN1(n1);
 
        System.out.println("Digite o 2° numero");
        int n2 = scanner.nextInt();
        ca.setN2(n2);
        }
 
        // laço case - escolha então
        switch (escolha) {
 
            case 1:
                System.out.println("Você escolheu somar: " + ca.soma(ca.getN1(), ca.getN2()));
                double total = ca.soma(ca.getN1(), ca.getN2());
                System.out.println("O total da soma é: " + total);
                break;
 
            case 2:
                System.out.println("Você escolheu subtrair:" + ca.subtracao(ca.getN1(), ca.getN2()));
                break;
 
            case 3:
                System.out.println("Você escolheu multiplicação:" + ca.multiplicacao(ca.getN1(), ca.getN2()));
                break;
 
            case 4:
                System.out.println("Você escolheu divisão:" + ca.divisao(ca.getN1(), ca.getN2()));
                break;
 
            default:
                System.out.println("Nenhuma das opções!");
                break;
 
               
 
        }
    }
}
 */