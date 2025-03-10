import java.util.Scanner;

public class DadosScan {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
        String nome;
        int idade, tempoIdade;
        double alturam, alturacm;

        //Solicitando nome do usuário
        System.out.print ("Digite seu Nome: ");
        nome = scanner.nextLine();

        //Solicitando a idade do usuário
        System.out.print("Digite sua Idade: ");
        idade = scanner.nextInt();
        tempoIdade = 50 - idade;

        //Solicitando a altura do usuário
        System.out.print("Digite sua Altura em Metros: ");
        alturam = scanner.nextDouble();
        alturacm = alturam * 100;

        //Mensagem de boas vindas com condicional caso usuário tenha 50 anos ou mais
        if (idade > 49){
            System.out.println("Olá, " + nome + "!, Você já tem 50 anos ou mais.");
        } else {
            System.out.println("Olá, " + nome + "! Em " + tempoIdade + " anos, você terá 50 anos.");
        }

        //Mensagem mostrando a altura do usuário
        System.out.println("Sua altura é de " + alturacm + " centimetros.");
        scanner.close();
    }
}