package src;
public class App {
    public static void main(String[] args) throws Exception {

  
         Juguetes juguetes[]=new Juguetes[5];
         juguetes[0]=new Juguetes("Hasbro", "China", 30000.0);
         juguetes[1]=new JuguetesBebe("Barbie", "Colombia", 75000.0, "Plastico");
         juguetes[2]=new JuguetesLogo(500);
         juguetes[3]=new Juguetes();
         juguetes[4]=new JuguetesBebe("Plastilina");
         Factura solucion = new Factura(juguetes);
         solucion.mostrarTotales(); 
        }
        


}