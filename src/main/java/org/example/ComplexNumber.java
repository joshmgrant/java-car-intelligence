package org.example;

public class ComplexNumber {

    private Double x;
    private Double y;

    public ComplexNumber(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public ComplexNumber(Double x, Double y){
        this.x = x;
        this.y = y;
    }

    public Double getLength(){
        return Math.sqrt(x*x + y*y);
    }

    public Double getRealPart() {
        return x;
    }

    public Double getImaginaryPart(){
        return y;
    }

    @Override
    public String toString(){
        return String.format("%f + %f i", x, y);
    }
}
