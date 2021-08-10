package com.example;
public class JugueteBebe extends Juguete{

    
    private final static String MATERIAL="Plastico";
    private String material;
    private Double precioFinal;
    
    
    //constructores
    
    public JugueteBebe(){
        super();
        this.material = MATERIAL;
    }

    public JugueteBebe(String material) {
        super();
        this.material = material;
        
    }


    
    public JugueteBebe(String marca, String paisOrigen, Integer precioBase, String material) {
        super(marca, paisOrigen, precioBase);
        this.material = material;
        
    }
    public double calcularPrecio(){
        // Calculos
        if(material== MATERIAL){
            precioFinal=super.calcularPrecio()+10000.0;

        }else{
            precioFinal=super.calcularPrecio();
        }
         return precioFinal;
    }

}
