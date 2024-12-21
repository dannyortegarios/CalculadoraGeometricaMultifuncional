import java.util.Scanner;

public class CalculadoraGeometricaMultifuncional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] resultados = new String[100]; // Arreglo para almacenar resultados
        int contador = 0; // Contador para el arreglo

        while (true) {
            try {
                System.out.println("Calculadora Geométrica");
                System.out.println("Seleccione una figura:");
                System.out.println("1. Círculo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Triángulo");
                System.out.println("4. Rectángulo");
                System.out.println("5. Pentágono");
                System.out.println("0. Salir");
                int figura = Integer.parseInt(scanner.nextLine());

                if (figura == 0) {
                    System.out.println("Saliendo...");
                    break;
                }

                System.out.println("Seleccione una operación:");
                System.out.println("1. Área");
                System.out.println("2. Perímetro");
                int operacion = Integer.parseInt(scanner.nextLine());

                double resultado = 0;

                switch (figura) {
                    case 1: // Círculo
                        System.out.print("Ingrese el radio: ");
                        double radio = Double.parseDouble(scanner.nextLine());
                        if (operacion == 1) {
                            resultado = Math.PI * radio * radio; // Área
                        } else {
                            resultado = 2 * Math.PI * radio; // Perímetro
                        }
                        break;
                    case 2: // Cuadrado
                        System.out.print("Ingrese el lado: ");
                        double lado = Double.parseDouble(scanner.nextLine());
                        if (operacion == 1) {
                            resultado = lado * lado; // Área
                        } else {
                            resultado = 4 * lado; // Perímetro
                        }
                        break;
                    case 3: // Triángulo
                        System.out.print("Ingrese la base: ");
                        double base = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese la altura: ");
                        double altura = Double.parseDouble(scanner.nextLine());
                        if (operacion == 1) {
                            resultado = (base * altura) / 2; // Área
                        } else {
                            System.out.print("Ingrese el lado 2: ");
                            double lado2 = Double.parseDouble(scanner.nextLine());
                            System.out.print("Ingrese el lado 3: ");
                            double lado3 = Double.parseDouble(scanner.nextLine());
                            resultado = base + lado2 + lado3; // Perímetro
                        }
                        break;
                    case 4: // Rectángulo
                        System.out.print("Ingrese la base: ");
                        double baseR = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese la altura: ");
                        double alturaR = Double.parseDouble(scanner.nextLine());
                        if (operacion == 1) {
                            resultado = baseR * alturaR; // Área
                        } else {
                            resultado = 2 * (baseR + alturaR); // Perímetro
                        }
                        break;
                    case 5: // Pentágono
                        System.out.print("Ingrese el lado: ");
                        double ladoP = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese el apotema: ");
                        double apotema = Double.parseDouble(scanner.nextLine());
                        if (operacion == 1) {
                            resultado = (5 * ladoP * apotema) / 2; // Área
                        } else {
                            resultado = 5 * ladoP; // Perímetro
                        }
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        continue;
                }

                String operacionStr = (operacion == 1) ? "Área" : "Perímetro";
                String resultadoStr = "Figura: " + figura + ", Operación: " + operacionStr + ", Resultado: " + resultado;
                resultados[contador++] = resultadoStr;
                System.out.println("Resultado: " + resultado);

            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no válida. Intente de nuevo.");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }

        System.out.println("\nResultados guardados:");
        for (int i = 0; i < contador; i++) {
            System.out.println(resultados[i]);
        }
        scanner.close();
    }
}
