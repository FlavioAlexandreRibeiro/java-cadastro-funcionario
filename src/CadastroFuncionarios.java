import java.time.Year;
import java.util.Scanner;

public class CadastroFuncionarios {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== CADASTRO DE FUNCIONÁRIO =====");

        System.out.print("\nNome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Salário: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Ano de admissão: ");
        int anoAdmissao = scanner.nextInt();

        double bonus = calcularBonus(salario);
        String nivel = classificarFuncionario(salario);
        String tempoEmpresa = classificarTempoDeEmpresa(anoAdmissao);

        exibirDadosFuncionario(
                nome,
                idade,
                cargo,
                salario,
                bonus,
                nivel,
                tempoEmpresa
        );

        scanner.close();
    }

    public static double calcularBonus(double salario) {

        if (salario <= 2000) {
            return salario * 0.20;

        } else if (salario <= 5000) {
            return salario * 0.10;

        } else {
            return salario * 0.05;
        }
    }

    public static String classificarFuncionario(double salario) {

        if (salario <= 2000) {
            return "Júnior";

        } else if (salario <= 5000) {
            return "Pleno";

        } else {
            return "Sênior";
        }
    }

    public static String classificarTempoDeEmpresa(int anoAdmissao) {

        int anoAtual = Year.now().getValue();
        int tempoDeEmpresa = anoAtual - anoAdmissao;

        if (tempoDeEmpresa < 2) {
            return "Novato";

        } else if (tempoDeEmpresa <= 5) {
            return "Experiente";

        } else {
            return "Veterano";
        }
    }

    public static void exibirDadosFuncionario(
            String nome,
            int idade,
            String cargo,
            double salario,
            double bonus,
            String nivel,
            String tempoEmpresa) {

        System.out.println("\n===== DADOS DO FUNCIONÁRIO =====");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.printf("Bônus: R$ %.2f%n", bonus);
        System.out.println("Nível: " + nivel);
        System.out.println("Tempo de empresa: " + tempoEmpresa);
    }
}

