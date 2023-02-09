package com.natalia.Planets;

public class Persona {
    private String name; 
    private String surname; 
    private String dni; 
    private int year_born;
    private String country_born;
    private char gender;

    public Persona(String name, String surname, String dni, int year_born, String country_born, char gender) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.year_born = year_born;
        this.country_born = country_born;
        this.gender = gender;

    }
//Get y Set de los valores de los atributos. Botón derecho seleccionando la clase.
public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setYear_born(int year_born) {
        this.year_born = year_born;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public String getDni() {
        return dni;
    }
    public int getYear_born() {
        return year_born;

             
    }    
    public void setGender(char gender) {
            this.gender = gender;
        }
    public char getGender() {
            return gender;
        }
    public void setCountry_born(String country_born) {
            this.country_born = country_born;
        }
    public String getCountry_born() {
            return country_born;

    }

//Método main para crear dos personas (debería hacerse en app.java):

public static void main(String[] args) {

}
//Método para imprimir en pantalla los valores de los atributos. Se hace así para imprimir todo de una vez:
    public String render(){
        String out = String.format("name: %s, Surname: %s, dni: %s, Born year: %s, Country Born: %s, Gender: %s", name, surname, dni, year_born, country_born, gender);
        return out;



}
}




