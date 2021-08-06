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
     // Constructores
 
 // Metodos
    public Juguetes(){
        this.marca = MARCA;
        this.paisOrigen = PAIS_ORIGEN;
        this.precioBase= PRECIO_BASE;
    }
    public Juguetes(String marca, String paisOrigen){
        this.marca = marca;
        this.paisOrigen = PAIS_ORIGEN;
        this.precioBase= PRECIO_BASE;
    }
    public Juguetes(String marca, String paisOrigen, Double precioBase){
        this.marca = marca;
        this.paisOrigen = paisOrigen;
        this.precioBase = precioBase;
    }
    public void tipoDato(String marca){
    public Double calcularPrecio(){
        Double precioFinal = 0.0;
        Double precioBase = 0.0;
        Double vOrigen = 0.0;
        if(marca == MARCA)
                precioFinal = precioBase*0.50;
            else
                precioFinal= precioBase*0.75; 

                if (paisOrigen==PAIS_ORIGEN)
                precioFinal= precioBase-5000;
        
                    else
                         precioFinal=precioBase-2500;
            
    }
        
    }      
    
    }
 
    return precioFinal;
  