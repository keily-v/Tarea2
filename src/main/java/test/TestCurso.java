
package test;

import dominio.Curso;
public class TestCurso {
    public static void main(String[] args) {
        
        Curso cursoA = new Curso();
        double [] notas = new double[12];
        
       //llamdo al Array 
        llenarNotas(notas);
       
       cursoA.setNotas(notas);
       //mostrar el Array
       cursoA.mostrarNotas(notas);
       //mètodo que calcula el promedio
       cursoA.setPromedio(notas);
       //mètodo que cuenta los estudiantes que tienen la nota superior a la del promedio del curso
       cursoA.setEstudiantesEncimaPromedio();
      
       System.out.println("Promedio del curso : "+cursoA.getPromedio());
       System.out.println("Nro Estudiantes Encima del promedio : "+cursoA.getnroEstudiantesEncimaPromedio());
    
    }   
   //Mètodo para llenar el array
    public static void llenarNotas(double [] notas){
        for(int i=0; i<12 ; i++){
            notas[i] = Math.random()*5;
        }
    }
}
