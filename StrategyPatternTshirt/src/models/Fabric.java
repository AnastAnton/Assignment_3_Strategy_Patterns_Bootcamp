/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author AnastAnton
 */
public enum Fabric {
    WOOL(12f), COTTON(15f),  POLYESTER(17f),  RAYON(18.3f),  
    LINEN(19.4f),  CASHMERE(33.76f),  SILK(35.93f);
    
    private final float unitPrice;

    private Fabric(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getUnitPrice() {
        return unitPrice;
    }
 
}
