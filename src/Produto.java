import java.util.Scanner;

/**
 * 3. Faça um algoritmo (utilizando o comando escolha) que, baseado
 * no código digitado pelo usuário, retorne o nome e valor do produto.
 * Sabendo que:
 * – 001 – Parafuso (R$ 0,15)
 * – 002 – Porca (R$ 0,05)
 * – 003 – Prego (R$ 0,10)
 * – 004 – Martelo (R$ 40,00)
 * – 005 – Tomada (R$ 3,00)
 * */
public class Produto {
    public static void main(String[] args) {
        int codigo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do produto: ");
        codigo = sc.nextInt();
        switch (codigo){
            case 1:
                System.out.println("Parafuso - R$ 0,15");
                break;
            case 2:
                System.out.println("Porca - R$ 0,05");
                break;
            case 3:
                System.out.println("Prego - R$ 0,10");
                break;
            case 4:
                System.out.println("Martelo - R$ 40,00");
                break;
            case 5:
                System.out.println("Tomada - R$ 3,00");
                break;
            default:
                System.out.println("Código inválido");
        }




    }
}
