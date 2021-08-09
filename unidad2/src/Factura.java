// Inicio de la solución
package src;
public class Factura {
    private Double totalJuguetes;
    private Double totalJuguetesBebe;
    private Double totalJuguetesLego;
    private Juguetes[] listaJuguetes;
    
    public Factura(Juguetes[] lJuguetes) {
        listaJuguetes = lJuguetes;
    }
    
    public void mostrarTotales(){
        
        totalJuguetes=0.0;
        totalJuguetesBebe = 0.0;
        totalJuguetesLego =0.0;

        for(int i = 0; i < 5; i++){
            totalJuguetes = totalJuguetes + listaJuguetes[i].calcularPrecio();
            if (listaJuguetes[i] instanceof JuguetesBebe){
                totalJuguetesBebe = totalJuguetesBebe + listaJuguetes[i].calcularPrecio();
            }
            if (listaJuguetes[i] instanceof JuguetesLogo){
                totalJuguetesLego = totalJuguetesLego + listaJuguetes[i].calcularPrecio();
            }
        }       
        System.out.println("El precio total de los juguetes es de " + totalJuguetes);
        System.out.println("La suma del precio de los JuguetesBebe es de " + totalJuguetesBebe);
        System.out.print("La suma del precio de los JuguetesLego es de " + totalJuguetesLego);
    }
    
}


   
   
   // Fin de la solución
   // Esta clase es para las pruebas, no se debe subir como parte de la solución
//    public class App {
//     public static void main(String[] args) {
//    // Caso de Prueba 1
//     Juguete juguetes[]=new Juguete[5];
//     juguetes[0]=new Juguete("Hasbro", "China", 30000);
//     juguetes[1]=new JugueteBebe("Barbie", "Colombia", 75000, "Plastico");
//     juguetes[2]=new JugueteLogo(500);
//     juguetes[3]=new Juguete();
//     juguetes[4]=new JugueteBebe("Plastilina");
//     Factura solucion = new Factura(juguetes);
//     solucion.mostrarTotales(); }
   