package src;
public class JuguetesLogo extends Juguetes{
    // Constantes
    private final static int NUMERO_FICHAS = 100;
    // Atributos
    private int numeroFichas;
    private Double precioFinal;
    // Constructores
    public JuguetesLogo(){
        super();
        this.numeroFichas=NUMERO_FICHAS;
    }

    public JuguetesLogo(int numeroFichas) {
        super();
        this.numeroFichas = numeroFichas;
    }

    public JuguetesLogo(String marca, String paisOrigen, Double precioBase, int numero_fichas) {
        super(marca, paisOrigen, precioBase);
        this.numeroFichas = NUMERO_FICHAS;
    }
    
    // Metodos
    public Double calcularPrecio(){
        // Calculos
        if(numeroFichas<NUMERO_FICHAS){
            precioFinal=super.calcularPrecio()+15000.0;

        }else{
            precioFinal=super.calcularPrecio()+20000.0;
        }
        return precioFinal;
    }

    
}
