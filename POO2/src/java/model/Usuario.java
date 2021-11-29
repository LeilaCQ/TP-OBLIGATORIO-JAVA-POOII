package model;




public class Usuario {

    private String nombre;
    
    private String apellido;
    
    private String edad;
    
    private String hobbie;
    
    private String editor;
    
    private String SO;

    

    public Usuario(){

        

    }//constructor vacio , objeto Usuario vacio



    public Usuario(String nombre, String apellido, String edad, String hobbie, String editor, String SO) {

        this.nombre = nombre;
        
        this.apellido = apellido;
        
        this.edad = edad;
        
        this.hobbie = hobbie;
        
        this.editor = editor;
        
        this.SO = SO;

    }



    public String getNombre() {

        return nombre;

    }//para obtener el usuario en el back end



    public void setNombre(String nombre) {

        this.nombre = nombre;

    }//set usuario para setear usuario
    
    
    public String getApellido() {

        return apellido;

    }



    public void setApellido(String apellido) {

        this.apellido = apellido;

    }
    
    
     public String getEdad() {

        return edad;

    }



    public void setEdad(String edad) {

        this.edad = edad;

    }
    
     public String getHobbie() {

        return hobbie;

    }



    public void setHobbie(String hobbie) {

        this.hobbie = hobbie;

    }
    
    public String getEditor(){
        
        return editor;
    }
    
    public void setEditor(String editor){
        
        this.editor = editor;
    }
    
    
    
    public String getSO(){
        return SO;
    }
    public void setSO(String SO){
        this.SO= SO;
    }






  



    @Override

    public String toString() {

        return "Usuario{" + "usuario=" + nombre + ", apellido=" + apellido +", edad=" + edad +", hobbie=" + hobbie +", editor=" + editor+ ", SO=" + SO +'}';

    }

    

}

