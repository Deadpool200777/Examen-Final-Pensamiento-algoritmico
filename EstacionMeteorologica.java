import java.util.Scanner;

public class EstacionMeteorologica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[360];
        int opcion;
        boolean temperaturasRegistradas = false;
        do { 
            System.out.println("Menu");
            System.out.println("1. Registrar temperaturas");
            System.out.println("2. Mostrar Temperaturas por mes");
            System.out.println("3. buscar mayor temperatura");
            System.out.println("4. buscar menor temperatura");
            System.out.println("5. contar temperaturas");
            System.out.println("6.calcular promedio de temperaturas");
            System.out.println("7.ordenar arreglo de temperaturas");
            System.out.println("8. Salir");
            System.out.println("Elija una opción: ");

            opcion = scanner.nextInt();

            if (opcion >= 2 && opcion <=7 && !temperaturasRegistradas) {
                System.out.println("ERROR: Debe registrar las temperaturas primero.");
                continue;
            }

            switch (opcion) {
                case 1:
                    registrarTemperatura(temperaturas);
                    temperaturasRegistradas = true;
                    System.out.println("Temperatura Registrada con éxito.");
                    break;
                case 2:
                    mostrarTemperaturas(temperaturas);
                    break;
                case 3:
                    obtenerMayor(temperaturas);
                    break;
                case 4:
                    obtenerMenor(temperaturas);
                    break;
                case 5:
                    contarTemperaturas(temperaturas);
                    break;
                case 6:
                    calcularPromedio(temperaturas);
                    break;
                case 7:
                    ordenarArreglo(temperaturas);
                    System.out.println("Arreglo ordenado con éxito.");
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 8);
        scanner.close();

    }

    public static void registrarTemperatura(double[] temperaturas) {
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = (Math.random() * 60) - 10;
            }
            
        }
        public static void mostrarTemperaturas(double[] temperaturas) {
            for (int i = 0; i < temperaturas.length; i++) {
                if (i % 30 == 0) {
                    int mes = (i / 30) + 1;
                    System.out.println("Mes " + mes + ":");
                }
                System.out.println("Día " + (i + 1) + ": " + temperaturas[i]);
            }
        }

        public static void obtenerMayor(double[] temperaturas) {
            double mayor = temperaturas[0];
            int dia= 1;
            for (int i = 1; i < temperaturas.length; i++) {
                if (temperaturas[i] > mayor) {
                    mayor = temperaturas[i];
                    dia = i + 1;
                }
            }
            System.out.println("La mayor temperatura es " + mayor + " y se registró el día " + dia);

        }
        public static void obtenerMenor(double[] temperaturas) {
            double menor = temperaturas[0];
            int dia= 1;
            for (int i = 1; i < temperaturas.length; i++) {
                if (temperaturas[i] < menor) {
                    menor = temperaturas[i];
                    dia = i + 1;
                }
            }
            System.out.println("La menor temperatura es " + menor + " y se registró el día " + dia);

        }
        public static void contarTemperaturas(double[] temeraturas) {
            int mayores = 0;
            int menores = 0;
            int iguales = 0;
            for (int i = 0; i < temeraturas.length; i++) {

                if (temeraturas[i] > 25) {
                    mayores++;
                } else if (temeraturas[i] < 25) {
                    menores++;
                } else {
                    iguales++;
                }
            }
            System.out.println("Temperaturas mayores a 25: " + mayores);
            System.out.println("Temperaturas menores a 25: " + menores);
            System.out.println("Temperaturas iguales a 25: " + iguales);
        }
        public static void calcularPromedio(double[] temperaturas) {
            double suma = 0;
            for (int i = 0; i < temperaturas.length; i++) {
                suma += temperaturas[i];
            }
            double promedio = suma / temperaturas.length;
            System.out.println("El promedio de las temperaturas es: " + promedio);
        }
        public static void ordenarArreglo(double[] temperaturas) {
            for (int i = 0; i < temperaturas.length - 1; i++) {
                for (int j = 0; j < temperaturas.length - 1 - i; j++) {
                    if (temperaturas[j] > temperaturas[j + 1]) {
                        double temporal = temperaturas[j];
                        temperaturas[j] = temperaturas[j + 1];
                        temperaturas[j + 1] = temporal;
                    }
                }
            }
        }

    }


        