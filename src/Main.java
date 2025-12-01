import topicos.Geometria;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarNome(); // printa o nome do projeto
        loopMenu(); // começa o loop do programa
    }

    private static void mostrarNome() {
        System.out.println( "▗▖ ▗▖ ▗▄▖ ▗▖   ▗▖ ▗▖▗▖ ▗▖▗▖   ▗▄▄▄▖\n" +
                            "▐▌▗▞▘▐▌ ▐▌▐▌   ▐▌▗▞▘▐▌ ▐▌▐▌   ▐▌   \n" +
                            "▐▛▚▖ ▐▛▀▜▌▐▌   ▐▛▚▖ ▐▌ ▐▌▐▌   ▐▛▀▀▘\n" +
                            "▐▌ ▐▌▐▌ ▐▌▐▙▄▄▖▐▌ ▐▌▝▚▄▞▘▐▙▄▄▖▐▙▄▄▖\n");
    }

    private static void loopMenu() {
        int escolha; // variavel para armazenar a escolha no menu
        while(true){
            mostrarMenu(); // printa o menu
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    Geometria geometria = new Geometria();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.print("─────────────► SELECIONE UM TOPICO ◄─────────────\n" +
                "┌───────────────────────────────────────────────┐\n" +
                "│1 - Geometria Plana e Espacial                 │\n" +
                "│2 - Álgebra e Funções                          │\n" +
                "│3 - Trigonometria (Triângulo Retângulo)        │\n" +
                "│4 - Análise Combinatória e Probabilidade       │\n" +
                "│5 - Física                                     │\n" +
                "│                                               │\n" +
                "│0 - Sair                                       │\n" +
                "└───────────────────────────────────────────────┘\n" +
                " Escolha:");
    }
}