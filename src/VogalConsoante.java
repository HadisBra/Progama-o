import java.util.Scanner;

/**
 * 2. Faça um algoritmo que lê uma letra e informa se a mesma é uma
 * vogal ou consoante. A mesma deverá exibir uma mensagem de erro
 * no caso de digitação incorreta;
 */
public class VogalConsoante {
    public static void main(String[] args) {
        String letra;
        Scanner src = new Scanner(System.in);

        System.out.println("Digite uma Letra");
        letra = src.nextLine();

        switch (letra){
            case "a","e","i","o","u":
                System.out.println("Vogal");
            break;
            case "b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","x","y","z" :
                System.out.println("consoante");
            break;
            default:
                System.out.println("Letra inválida");
        }

    }
}
