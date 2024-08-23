
import java.util.Scanner;

public class integradora {

 public static void main(String[] args) {
        Scanner esca = new Scanner(System.in);
        System.out.println("bienvenido a la aplicacion de interacción de rutas ecológicas cop 16 cali-colombia");
        System.out.println("por favor digite su nombre");
        String name = esca.nextLine();
        System.out.println("por favor digite su cedula ");
        int cedula = esca.nextInt();
        System.out.println("!Bienvenido, " + name);
        System.out.println("¿Que ruta vas a registrar el día de hoy?");
        System.out.println("por favor digita ruta a registrar");
        System.out.println("[1] Farallones.");
        System.out.println("[2] Jardín botánico");
        System.out.println("[3] Ecoparque rio pance");
        int ruta = esca.nextInt();
        rutas(ruta);
          System.out.println(" ingrese la temperatura en grados centígrados ");
        Double grados = esca.nextDouble();
        System.out.println("ingrese el porcentaje de humedad relativa (0%-100%)");
        int humedad = esca.nextInt();
        if((grados>=20 && grados<=25)&&(humedad>=40 && humedad<=60)){
        System.out.println("Es un buen dia para caminar por cali");
        }

    
      
        System.out.println("¿Cuántos participantes asistirán al recorrido el día de hoy?");
        int asistencias = esca.nextInt();
        System.out.println("¿Cuántos guías acudirán al recorrido?");
        int guias = esca.nextInt();
        int calculo=asistencias+guias;
        int total =calbuses(calculo);
        System.out.println("El total de buses son: "+total);
            esca.close();

    }

        

    public static void rutas(int rutaa){
        
        switch(rutaa){
            case 1:
                System.out.println("!genial¡ la Ruta de los Farallones tiene como punto de encuentro el bulevar del rio iniciando a las 7:00 am, y termina a las 1:30 pm ");
                break;

            case 2:
                System.out.println("!excelente¡ la ruta jardin botanico tiene como punto de encuentro el bulevar del rio iniciando a las 7:00 am, y termina a la 1:00 pm");
                break;

            case 3:
                System.out.println("!genial¡ la ruta ecoparque del rio tiene como punto de encuentro calle 16 - universidad del valle iniciando a las 6:40 am, y termina a las 4:00 pm");
                break;

            default:
        }
    }
    public static int calbuses(int calculo){
        int calcubuses=calculo/25;
        if(calcubuses%25!=0){
            calcubuses=calcubuses+1;

        }
        return calcubuses;





    }
}

    
    
