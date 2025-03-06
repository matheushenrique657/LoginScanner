import java.util.Scanner;

public class DadosScan {
    public static void main(String[] args) throws Exception {
       java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print ("Digite seu Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua Idade: ");
        int idade = scanner.nextInt();
        int subtracao = 50 - idade;

        System.out.print("Digite sua Altura em Metros: ");
        double alturam = scanner.nextDouble();
        double alturacm = alturam * 100;

        if (idade > 49) {
            System.out.println("Olá, " + nome + "!, Você já tem 50 anos ou mais.");
        }
        else {

            System.out.println("Olá, " + nome + "! Em " + subtracao + " anos, você terá 50 anos.");
        }
        System.out.println("Sua altura é de " + alturacm + " centimetros.");
        scanner.close();
    }
}
