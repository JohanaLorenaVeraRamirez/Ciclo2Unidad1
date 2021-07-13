public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Persona p1 = new Persona();
        p1.setEdad(20);
        p1.setNombre(Andres);
        System.out.println(p1.getEdad());
        System.out.println(p1.getNombre());
    }
}
