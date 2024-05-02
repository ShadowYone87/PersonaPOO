public class Persona {
    String nombre,apellido;
    int edad;
    double altura;
    
    public void mostrarNombreA() {
        System.out.println("Mi nombre es:"+this.nombre+apellido);
        
    }
    public void mostrarEdad() {

        System.out.println("Mi edad es:"+this.edad);

    }
    public void mostrarAtura() {

        System.out.println("Mi altura es:"+this.altura);

    
}
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura + "]";
    }
}