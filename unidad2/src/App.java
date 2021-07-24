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
        System.out.println(resultadoInversion2.compararInversion(1,2005000.0,0.4));   
        
        
        Juguete juguetes[]=new Juguete[5];
    juguetes[0]=new Juguete("Hasbro", "China", 30000);
    juguetes[1]=new JugueteBebe("Barbie", "Colombia", 75000, "Plastico");
    juguetes[2]=new JugueteLogo(500);
    juguetes[3]=new Juguete();
    juguetes[4]=new JugueteBebe("Plastilina");
    Factura solucion = new Factura(juguetes);
    solucion.mostrarTotales();
    }
}
