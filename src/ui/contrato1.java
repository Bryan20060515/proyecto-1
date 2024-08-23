import java.util.Scanner;

public class contrato1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean flag = false;

        do {
            System.out.println("Elija la opcion");
            System.out.println("1) temperatura");
            System.out.println("2) regalo");
            int opc = reader.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("ingrese la temperatura del dia de hoy");
                    int temp = reader.nextInt();
                    String msg = temperatura(temp);
                    System.out.println(msg);
                    flag = true;
                    break;
                case 2:
                    System.out.println("ingrese el nombre");
                    String name = reader.next();
                    System.out.println(ObtenerRegalo(name));
                    flag = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (flag == true);

        System.out.println("Ingrese el nombre del organizador");
        String name = reader.next();
        System.out.println();
    }

    public static String temperatura(int temp) {
        String msg = "";

        if (temp < 15) {
            msg = "lleve chaqueta para protegerse del frio y de la lluvia";
        } else if (temp > 28) {
            msg = "lleve termo del agua, beba para hidratarse";
        } else {
            msg = "tenga una buena caminata";
        }

        return msg;
    }

    public static String ObtenerRegalo(String name) {
        char firstLetter = Character.toLowerCase(name.charAt(0));
        if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u') {
            return "Comuniquese al número 1800456789 para obtener una entrada gratuita a LACOP16";
        } else {
            return "lo siento, no ha obtenido un regalo";
        }
    }
}
