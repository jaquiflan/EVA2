/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_8_super;

/**
 *
 * @author campa
 */
public class EVA2_8_SUPER {
//Todas las clases deben de incluir uml
    public static void main(String[] args) {
        Animal animal = new Animal(100);//Llamada cocnstructor
        Mamifero mamifero = new Mamifero("Negro", 50);
        Perros perro = new Perros();
    }
}
class Animal{
    private int peso;
    public Animal(){
        System.out.println("Animal: it´s alive");
    }
    public Animal(int peso){
        this.peso = peso;
        System.out.println("Animal it´s alive, constructor 2");
    }
    public void respirar(){
        System.out.println("Estoy respirando");
    }
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
class Mamifero extends Animal{
    private String colorPelo;
    public Mamifero(){
        super();//Llamada al constructor de la SuperClase: Animal
        //Siempre se debe primero llamar al constructor de la superClase
        System.out.println("Soy un mamifero");
    }

    public Mamifero(String colorPelo, int peso) {
        super(peso);
        this.colorPelo = colorPelo;
        System.out.println("Soy un mamifero, constructor 2");
    }
                 
    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
}
class Perros extends Mamifero{//la ultima clase hereda todo lo de las clases previas
    public Perros(){
        super();//Va a incovar a mamifero y el constructor de Mamimero trae al constructor de Animal
        System.out.println("Soy sinnombre y soy un perro");
    }
    
}
