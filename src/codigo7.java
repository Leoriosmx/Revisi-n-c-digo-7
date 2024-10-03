
import java.util.HashMap;
import java.util.Scanner;

public class codigo7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        HashMap<String, String> capitales = new HashMap<>();
        
        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "México DF");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador");
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Panamá");

        String c = "";
        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            c = s.nextLine();

            if (!c.equalsIgnoreCase("salir")) {
                if (capitales.containsKey(c)) {
                    System.out.println("La capital de " + c + " es " + capitales.get(c));
                } else {
                    System.out.print("No conozco la respuesta. ¿Cuál es la capital de " + c + "?: ");
                    String capital = s.nextLine();
                    capitales.put(c, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales");
                }//else
            }//if
        } while (!c.equalsIgnoreCase("salir"));
        
        s.close();
    }//main
}// class codigo7
