import java.util.Scanner;
public class MainPersona {
        public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        Persona p1 = new Persona();    
     System.out.println("Ingresa nombre y apellido");
        p1.setNombre(opc.next());
        p1.setApellido(opc.next());
        System.out.println("Ingresa tu edad");
        p1.setEdad(opc.nextInt());
        System.out.println("Ingresa tu altura");
        p1.setAltura(opc.nextDouble());
        System.out.println(p1);
        p1.getNombre();
        p1.getApellido();
        p1.getEdad();
        p1.getAltura();
        Scanner sc = new Scanner(System.in);
        Persona p2 = new Persona();
        System.out.println("Ingresa nombre y apellido");
        p2.setNombre(sc.next());
        p2.setApellido(sc.next());
        System.out.println("Ingresa tu edad");
        p2.setEdad(sc.nextInt());
        System.out.println("Ingresa tu altura");
        p2.setAltura(sc.nextDouble());
        System.out.println(p2);
        p2.getNombre();
        p2.getApellido();
        p2.getEdad();
        p2.getAltura();

    }
}
