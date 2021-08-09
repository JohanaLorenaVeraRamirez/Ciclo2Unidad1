package src;
public class JuguetesBebe extends Juguetes{

    //Si el material es plástico aumenta el precio del juguete en 10000 pesos, 
    //en caso contrario no hay aumento del precio
    
    private final static String MATERIAL="Plastico";
    private String material;
    private Double precioFinal;
    
    
    //constructores
    
    public JuguetesBebe(){
        super();
        this.material = MATERIAL;
    }
    
    public JuguetesBebe(String marca, String paisOrigen, Double precioBase, String material) {
        super(marca, paisOrigen, precioBase);
        this.material = material;
        
    }
    public Double calcularPrecio(){
        // Calculos
        if(material==MATERIAL){
            precioFinal=super.calcularPrecio()+10000.0;

        }else{
            precioFinal=super.calcularPrecio();
        }
         return precioFinal;
    }
