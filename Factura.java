package com.example;

public class Factura{
    private Double totalJuguete;
    private Double totalJugueteBebe;
    private Double totalJugueteLogo;
    private Juguete[] listaJuguete;
    
    public Factura(Juguete[] juguetes) {
        listaJuguete = juguetes;
    }
    
    public void mostrarTotales(){
        
        totalJuguete=0.0;
        totalJugueteBebe = 0.0;
        totalJugueteLogo =0.0;

        for(int i = 0; i < 5; i++){
            totalJuguete = totalJuguete + listaJuguete[i].calcularPrecio();
            if (listaJuguete[i] instanceof JugueteBebe){
                totalJugueteBebe = totalJugueteBebe + listaJuguete[i].calcularPrecio();
            }
            if (listaJuguete[i] instanceof JugueteLogo){
                totalJugueteLogo = totalJugueteLogo + listaJuguete[i].calcularPrecio();
            }
        }       
    System.out.println("El precio total de los juguetes es de " + totalJuguete);
    System.out.println("La suma del precio de los JuguetesBebe es de " + totalJugueteBebe);
    System.out.print("La suma del precio de los JuguetesLego es de " + totalJugueteLogo);
    }
}