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
public enum Size {
    XS(5f), S(5.2f), M(5.4f), L(5.6f), 
    XL(5.8f), XXL(6f), XXXL(6.2f);
    
    private final float unitPrice;

    private Size(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getUnitPrice() {
        return unitPrice;
    }
}
