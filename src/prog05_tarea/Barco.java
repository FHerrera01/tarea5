package prog05_tarea;

import java.time.LocalDate;

public class Barco {
    
    // marca, matrícula, número de horas de funcionamiento del motor, 
    // fecha de matriculación, descripción, precio, nombre del propietario anterior, 
    // dni del propietario anterior
    
    public String marca;
    public String matricula;
    public int horasMotor;
    public String fechaMatriculacion;
    public String descripcion;
    public int precio;
    public String propietarioAnterior;
    public String dniPropietarioAnterior;

    
    // getter y setter de cada una de las propiedades
     
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getHorasMotor() {
        return horasMotor;
    }

    public void setHorasMotor(int horasMotor) {
        this.horasMotor = horasMotor;
    }

    public String getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(String fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPropietarioAnterior() {
        return propietarioAnterior;
    }

    public void setPropietarioAnterior(String propietarioAnterior) {
        this.propietarioAnterior = propietarioAnterior;
    }

    public String getDniPropietarioAnterior() {
        return dniPropietarioAnterior;
    }

    public void setDniPropietarioAnterior(String dniPropietarioAnterior) {
        this.dniPropietarioAnterior = dniPropietarioAnterior;
    }
          
    // Constructor

    public Barco(String marca, String matricula, int horasMotor, String fechaMatriculacion, String descripcion, int precio, String propietarioAnterior, String dniPropietarioAnterior) {
        this.marca = marca;
        this.matricula = matricula;
        this.horasMotor = horasMotor;
        this.fechaMatriculacion = fechaMatriculacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.propietarioAnterior = propietarioAnterior;
        this.dniPropietarioAnterior = dniPropietarioAnterior;
    }
    
    // Métodos
    
    public getAnios(){
        int Anios;
        LocalDate fechaActual=LocalDate.now();
        int anioActual=fechaActual.now().getYear();
        Anios=anioActual    
                
        return Anios;    
    }
    
}
