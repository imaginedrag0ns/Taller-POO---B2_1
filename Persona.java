/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class Persona {
    private static final char SEXO_POR_DEFECTO = 'H';
  private static final int PESO_POR_DEFECTO = 0;
  private static final String NOMBRE_POR_DEFECTO = "";
  private static final double ALTURA_POR_DEFECTO = 0.0;
  private static final int EDAD_MINIMA_MAYOR_DE_EDAD = 18;

  private String nombre;
  private int edad;
  private String cedula;
  private char sexo;
  private double peso;
  private double altura;
  
  public Persona() {
    this.nombre = NOMBRE_POR_DEFECTO;
    this.edad = PESO_POR_DEFECTO;
    this.sexo = SEXO_POR_DEFECTO;
    this.peso = PESO_POR_DEFECTO;
    this.altura = ALTURA_POR_DEFECTO;
    this.cedula = generaCedula();
  }

  public Persona(String nombre, int edad, char sexo) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = PESO_POR_DEFECTO;
    this.altura = ALTURA_POR_DEFECTO;
    this.cedula = generaCedula();
  }

  public Persona(String nombre, int edad, char sexo, double peso, double altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
    this.cedula = generaCedula();
  }

 

  public double calcularIMC() {
    double imc = peso / Math.pow(altura, 2);

    if (imc < 20) {
      return -1;
    } else if (imc <= 25) {
      return 0;
    } else {
      return 1;
    }
  }

  public boolean esMayorDeEdad() {
    return edad >= EDAD_MINIMA_MAYOR_DE_EDAD;
  }

  public char comprobarSexo(char sexo) {
    if (sexo != 'H' && sexo != 'M') {
      return SEXO_POR_DEFECTO;
    } else {
      return sexo;
    }
  }

  public String toString() {
    return "Persona{" +
        "nombre='" + nombre + '\'' +
        ", edad=" + edad +
        ", cedula='" + cedula + '\'' +
        ", sexo=" + sexo +
        ", peso=" + peso +
        ", altura=" + altura +
        '}';
  }

  private String generaCedula() {
    // Implementar la lógica para generar la cédula
    return "1234567890"; // Ejemplo provisional
  }

  // Métodos getters y setters

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

    String getEdad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getCedula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getSexo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getPeso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getAltura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSexo(char sexoComprobado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
  
}

