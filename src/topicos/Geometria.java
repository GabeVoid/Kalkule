package topicos;

/*
Teorema de Pitágoras
Área do Quadrado
Área do Retângulo
Área do Triângulo
Área do Círculo
Comprimento da Circunferência
Volume do Cubo
Volume do Paralelepípedo
*/

import java.util.Scanner;

public class Geometria {
    static Scanner scanner = new Scanner(System.in);

    public Geometria() {
        loopGeometria(); // começar o loop do topico de geometria
    }

    private void loopGeometria() {
        int escolha; // variavel para armazenar a escolha no menu
        while(true){
            mostrarMenuGeometria(); // printa o menu
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1: // Teorema de Pitágoras
                    teoremaPitagoras();
                    break;
                case 2: // Área do Quadrado
                    areaQuadrado();
                    break;
                case 0:
                    System.out.println("Voltando...");
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void teoremaPitagoras() {
        System.out.print("Cateto A: ");
        double a = scanner.nextDouble();
        System.out.print("Cateto B: ");
        double b = scanner.nextDouble();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hipotenusa: " + c);
    }

    private void areaQuadrado() {
        System.out.print("Lado: ");
        double l = scanner.nextDouble();
        double a = Math.pow(l, 2);
        System.out.println("Área: " + a);
    }

    public static void mostrarMenuGeometria() {
        System.out.print("────────────► SELECIONE UM  FORMULA ◄────────────\n" +
                "┌───────────────────────────────────────────────┐\n" +
                "│1 - Teorema de Pitágoras                       │\n" +
                "│2 - Área do Quadrado                           │\n" +
                "│3 - Área do Retângulo                          │\n" +
                "│4 - Área do Triângulo                          │\n" +
                "│5 - Área do Círculo                            │\n" +
                "│6 - Comprimento da Circunferência              │\n" +
                "│7 - Volume do Cubo                             │\n" +
                "│8 - Volume do Paralelepípedo                   │\n" +
                "│                                               │\n" +
                "│0 - Voltar                                     │\n" +
                "└───────────────────────────────────────────────┘\n" +
                " Escolha:");
    }

}
