package dev.rebecamf.models;

public class Person {
    private double weight; 
    private double height; 

    public Person(float weight, float height) {
        this.weight = weight; 
        this.height = height; 
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    

    public void setHeight(float height) {
        this.height = height;
    }
}

//     public void getIMC() {
//         double imc = this.weight / Math.pow(this.height, 2);
//         System.out.println(imc);
//     }
// }

