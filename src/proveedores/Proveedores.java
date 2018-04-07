/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveedores;

/**
 *
 * @author alex
 */
public class Proveedores {
    private String Nombre;
    
    private String Empresa;
    
    public Proveedores(String Nom, String Enterprise){
        this.Nombre = Nom;
        this.Empresa = Enterprise;       
    }
    
    
 public void setNombre(String Nom) {
        this.Nombre = Nom;
    }

    public void setEmpresa(String Enterprise) {
        this.Empresa = Enterprise;
    }
    
    //GETTERS
    
    public String getNombre() {
        return this.Nombre;  
    }
    
    public String getEmpresa() {
        return this.Empresa;  
    }
    
  
    


    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
