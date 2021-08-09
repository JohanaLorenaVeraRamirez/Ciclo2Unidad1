package src;
public class Juguetes{
    // Constantes
    private final static String MARCA="Hasbro";
    private final static String PAIS_ORIGEN="China";
    private final static Double PRECIO_BASE=10000.0;
    // Atributos
    private String marca;
    private String paisOrigen;
    private Double precioBase;
    private Double precioFinal;
    private Double precioBase1;
    //private Double precioBase1;
    //private Double precioBase2;
   
     // Constructores
 
 
    public Juguetes(){
        this.marca = MARCA;
        this.paisOrigen = PAIS_ORIGEN;
        this.precioBase= PRECIO_BASE;
        
    }
    public Juguetes(String marca, String paisOrigen){
        this.marca = marca;
        this.paisOrigen = paisOrigen;
        this.precioBase= PRECIO_BASE;
        
    }
    public Juguetes(String marca, String paisOrigen, Double precioBase){
        this.marca = marca;
        this.paisOrigen = paisOrigen;
        this.precioBase = precioBase;
       
        
    }
    
    // Metodos
    public void tipoDato(String marca){
        if(marca == MARCA){
            this.marca = MARCA;
        }else{
            this.marca = marca;
        }
    }

    public Double calcularPrecio(){
        Double precioFinal = 0.0;
        Double precioBase = 0.0;
        Double precioBase1 = 0.0;

        if(this.marca == MARCA)
                precioBase1 = precioBase*0.50;
            else
                precioBase1= precioBase*0.75; 

            if (this.paisOrigen==PAIS_ORIGEN){
                if (precioFinal>5000){
                    precioFinal = precioBase1 -5000.0; 
    
                }
            }else{
                    if(precioFinal>2500){
                        precioFinal = precioBase1 - 2500.0; 
                    }   
      return precioFinal;      
    }
    public void setPrecioFinal(Double precioFinal) {
        this.precioFinal = precioFinal;
    }
    public Double getPrecioFinal() {
        return precioFinal;
    }
    public Double getPrecioBase1() {
        return precioBase1;
    }
    public void setPrecioBase1(Double precioBase1) {
        this.precioBase1 = precioBase1;


    
}
 
    
  