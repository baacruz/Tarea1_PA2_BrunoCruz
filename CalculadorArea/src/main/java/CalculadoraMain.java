import java.util.Scanner;	
public class CalculadoraMain {
	public static double AreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double AreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double AreaRectangulo(double longitud, double ancho) {
        return longitud * ancho;
    }

    public static double AreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Calcular el área de un círculo");
            System.out.println("2. Calcular el área de un cuadrado");
            System.out.println("3. Calcular el área de un rectángulo");
            System.out.println("4. Calcular el área de un triángulo");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio: ");
                    double radio = scanner.nextDouble();
                    System.out.println("Área del círculo: " + AreaCirculo(radio));
                    break;
                case 2:
                    System.out.print("Ingrese el lado: ");
                    double lado = scanner.nextDouble();
                    System.out.println("Área del cuadrado: " + AreaCuadrado(lado));
                    break;
                case 3:
                    System.out.print("Ingrese la longitud: ");
                    double longitud = scanner.nextDouble();
                    System.out.print("Ingrese el ancho: ");
                    double ancho = scanner.nextDouble();
                    System.out.println("Área del rectángulo: " + AreaRectangulo(longitud, ancho));
                    break;
                case 4:
                    System.out.print("Ingrese la base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double altura = scanner.nextDouble();
                    System.out.println("Área del triángulo: " + AreaTriangulo(base, altura));
                    break;
                case 5:
                    System.out.println("Fin");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida, Tiene que ser un numero del 1 al 5");
            }
        }
    }
}
