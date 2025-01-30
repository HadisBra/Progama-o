import java.util.Scanner;

/**
 * 5. Elabore um algoritmo que, dada a idade válida de um nadador,
 * classifique-o em uma das seguintes categorias:
 * – Não aceito: 0 a 4 anos
 * – Infantil: 5 a 10 anos
 * – Juvenil: 11 a 17 anos
 * – Sênior: 17 a 20 anos
 * */

public class FaixaEtaria {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade do nadador: ");
        idade = sc.nextInt();

        switch (idade){
            case 0,1,2,3,4:
                System.out.println("Não aceito");
                break;
            case 5,6,7,8,9,10:
                System.out.println("Infantil");
                break;
                case 11,12,13,14,15,16,17:
                System.out.println("Juvenil");
                break;
                case 18,19,20:
                System.out.println("Sênior");
                break;
            default:
                System.out.println("Idade inválida");
        }

    }
}
