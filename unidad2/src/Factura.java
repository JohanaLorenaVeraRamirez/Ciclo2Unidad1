// Inicio de la solución
public class Factura{
    // Atributos
    public double totalJuguetes;
    public double totalJuguetesBebe;
    public double totalJuguetesLego;
    Juguete lista[];

    // Constructores
    // Metodos
    public void mostrarTotales(){
    // Calculo de totales
    System.out.println("El precio total de los juguetes es de " + totalJuguetes);
    System.out.println("La suma del precio de los JuguetesBebe es de " + totalJuguetesBebe);
    System.out.print("La suma del precio de los JuguetesLego es de " + totalJuguetesLego);
    }
    
   }
   public class Juguete{
    // Constantes
    private final static String MARCA="Hasbro";
    private final static String PAIS_ORIGEN="China";
    private final static String double PRECIO_BASE=10000;
    // Atributos
    private String marca;
    private String paisOrigen;
    private Double precioBase
     // Constructores
 
 // Metodos
 private tipoDato metodo1(){
    // En caso de ser necesarios metodos adicionales
    }
    public double calcularPrecio(){
    // Calculos
    return precioFinal;
    }
    // getters/setters de ser necesarios
   }
   public class JugueteBebe extends Juguete{
    // Constantes
    private final static String MATERIAL="Plastico";
    // Atributos
    private String material;
    // Constructores
    
    // Metodos
    public double calcularPrecio(){
    // Calculos
    return precioFinal;
    }
    // getters/setters de ser necesarios
   }
   public class JugueteLego extends Juguete{
    // Constantes
    private final static int NUMERO_FICHAS = 100;
    // Atributos
    private int numero_fichas;
    // Constructores
    
    // Metodos
    public double calcularPrecio(){
    // Calculos
    return precioFinal;
    }
    // getters/setters de ser necesarios
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
   