import java.util.Scanner;

/**
 * 2) Elabore um algoritmo que após inserido pelo usuário o nome de um time de futebol
 * informe se o mesmo se trata de um time carioca, paulista ou de outro estado.
 */
public class Times {
    public static void main(String[] args) {
        String time;
        Scanner src = new Scanner(System.in);
        System.out.println("Digite o nome do time: ");
        time = src.nextLine();
        switch (time) {
            case "Flamengo", "Fluminense", "Vasco", "Botafogo":
                System.out.println("Time carioca");
                break;
            case "São Paulo", "Corinthians", "Palmeiras", "Santos":
                System.out.println("Time Paulista");
                break;
            default:
                System.out.println("Time de outro estado");
        }
    }
}
