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
public enum Color {
    RED(3f), ORANGE(3.2f), YELLOW(3.4f), GREEN(3.6f), 
    BLUE(3.8f), INDIGO(4f), VIOLET(4.2f);
    
    private final float unitPrice;

    private Color(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getUnitPrice() {
        return unitPrice;
    }
}
