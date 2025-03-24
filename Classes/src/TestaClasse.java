import java.util.Scanner;
public class TestaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fruta maca = new fruta("Maçã", "Vermelha", 2.50);
        fruta banana = new fruta("Banana", "Amarela", 1.80);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Descrever Maçã");
            System.out.println("2. Calcular preço total da Banana");
            System.out.println("3. Verificar se Maçã está madura");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    maca.descrever();
                    break;
                case 2:
                    System.out.print("Digite a quantidade de bananas: ");
                    int quantidade = scanner.nextInt();
                    System.out.println("Preço total: R$" + banana.calcularPrecoTotal(quantidade));
                    break;
                case 3:
                    System.out.println("Maçã está madura: " + maca.estaMadura());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
        scanner.close();
    }
}
