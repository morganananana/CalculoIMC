package org.example;

public class IMCCalc {
    public float calcImc(double height, float weight) {
        return (float) (weight / Math.pow(height, 2));
    }
}
