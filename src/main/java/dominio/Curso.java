
package dominio;

public class Curso {
    
    private double [] notas;
    private double promedio;
    private int estudiantesEncimaPromedio; 
   
    //Constructor vacio 
    public Curso(){
        notas = new double[12];
    }
    
    //Metodo set
    public void setNotas(double notas[]){
        this.notas=notas;
    }
    
    public void mostrarNotas(double notas[]){
        for(int i=0; i<12 ; i++){
            System.out.println(this.notas[i]);
        }

    }
    
    public void setPromedio(double [] notas){
        
        double promedio=0;
        //Suma de las notas de los 12 estudiantes
        for (int i = 0; i < 12; i++) {
            double aux = notas[i];
            //suma de las 12 notas 
            promedio = aux + promedio;
        }
        this.promedio = promedio/12;
    }
    
    public void setEstudiantesEncimaPromedio(){
        int estudiantes =0;
        double promedio =0;
        
        for (int i = 0; i < 10; i++) {
            double aux = notas[i];
            promedio = aux + promedio;
        }
        //estudiantes se incrementa 1 cada vez que es comparada su nota
        //con el promedio del curso 
        for (int i = 0; i < 12; i++) {
            if (notas[i]>promedio/12){
                estudiantes = estudiantes+1;
            }
        }
        this.estudiantesEncimaPromedio= estudiantes;
    }
    
    public double getPromedio(){
        return this.promedio;
    }
   
    public int getnroEstudiantesEncimaPromedio(){
        return this.estudiantesEncimaPromedio;
    }
    
}
