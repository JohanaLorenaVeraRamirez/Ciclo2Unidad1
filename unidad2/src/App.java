public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Persona p1 = new Persona();
        p1.setEdad(20);
        System.out.println(p1.getEdad());
        p1.setNombre("Andrés");
        System.out.println(p1.getNombre()); 
        
        inversion resultadoInversion = new inversion();
        System.out.println(resultadoInversion.compararInversion(12,2000000,5));
        inversion resultadoInversion2 = new inversion();
        System.out.println(resultadoInversion2.compararInversion(11,2005000.0,4));      
    }
}
