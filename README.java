/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author keren
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println("Datos del Estudiante");
        Estudiante e = new Estudiante();
        e.imprimir();

        System.out.println("Datos del Deportista");
        Deportista d = new Deportista();
        d.imprimir();


        
    }


   

    public static class Persona {

  
        private String nombre;
        private String apellido;
        private int año;
        private String apodo;
        
        

        public Persona() {
        }

       
        public Persona(String nombre,
                          int año,
                          String apellido,
                          String apodo) {
            this.nombre = nombre;
            this.año = año;
            this.apellido = apellido;
            this.apodo = apodo;
        }
        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }


        public int getAño() {
            return this.año;
        }

        public void setAño(int año) {
            this.año = año;
        }


        public String getApellido() {
            return this.apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getApodo() {
            return this.apodo;
        }

        public void setApodo(String apodo) {
            this.apodo = apodo;
        }

        


       

        public void imprimir() {
            System.out.println("");
            System.out.println("Nombre: " + nombre);
             System.out.println("Apellido: " + apellido);
            System.out.println("Año de Nacimiento: " + año);
            System.out.println("Apodo: " + apodo);
            System.out.println("");
        }

    }

    
   

    public static class Estudiante extends Persona {
  
    
        public Estudiante() {
            setNombre("David Alejandro");
            setApellido("Rodriguez Fernandez");
            setAño(1993);
            setApodo("Sexi");
        }


    }


  
    public static class Deportista extends Persona {

        public Deportista() {
            setNombre("Erick Francisco");
            setApellido("Nisbeth Altamirano");
            setAño(1982);
            setApodo("El Chele Cambray");
        }
        public void imprimir() {
            System.out.println("");
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Año de Nacimiento: " + año);
            System.out.println("Apodo: " + apodo);
            System.out.println("");
        }

    }

    

   
   

}
