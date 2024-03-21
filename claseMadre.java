/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class claseMadre {
    
    public static void main(String[] args) {
        
    Persona persona1 = new Persona("Juan Pérez", 30, 'H', 70.0, 1.80);

    // Imprimir información de la persona
    System.out.println("Información de la persona:");
    System.out.println("Nombre: " + persona1.getNombre());
    System.out.println("Edad: " + persona1.getEdad());
    System.out.println("Cédula: " + persona1.getCedula());
    System.out.println("Sexo: " + persona1.getSexo());
    System.out.println("Peso: " + persona1.getPeso());
    System.out.println("Altura: " + persona1.getAltura());

    System.out.println("\nIMC: " + persona1.calcularIMC());
    if (persona1.esMayorDeEdad()) {
      System.out.println(persona1.getNombre() + " es mayor de edad.");
    } else {
      System.out.println(persona1.getNombre() + " no es mayor de edad.");
    }

    char sexoComprobado = persona1.comprobarSexo('N');
    System.out.println("\nSexo tras comprobar: " + sexoComprobado);
    persona1.setSexo(sexoComprobado);
    System.out.println("Sexo modificado: " + persona1.getSexo());
  }
    }
    

