package com.example;
public class JugueteLogo extends Juguete{
    // Constantes
    private final static int NUMERO_FICHAS = 100;
    // Atributos
    private int numeroFichas;
    private Double precioFinal;
    // Constructores
    public JugueteLogo(){
        super();
        this.numeroFichas=NUMERO_FICHAS;
    }

    public JugueteLogo(int numeroFichas) {
        super();
        this.numeroFichas = numeroFichas;
    }

    public JugueteLogo(String marca, String paisOrigen, Integer precioBase, int numero_fichas) {
        super(marca, paisOrigen, precioBase);
        this.numeroFichas = NUMERO_FICHAS;
    }
    
    // Metodos
    public double calcularPrecio(){
        // Calculos
        if(numeroFichas<NUMERO_FICHAS){
            precioFinal=super.calcularPrecio()+15000.0;

        }else{
            precioFinal=super.calcularPrecio()+20000.0;
        }
        return precioFinal;
    }
}


