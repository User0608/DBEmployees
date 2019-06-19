/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import entidades.*;
import datos.*;
/**
 *
 * @author R000R
 */
public class DepartmentsBL {
    
    public static String insertarDepartment(String numero, String nombre){
          String mensaje;
        if(numero.trim().length()>1&&numero.trim().length()<=4&&
                nombre.trim().length()>1&&nombre.trim().length()<=40
                )
        {
            if(DepartmentDAL.buscarDepartment(numero)==null){
                Department department= new Department(numero,nombre);
                mensaje=DepartmentDAL.insertarDepartment(department);
                if(mensaje == null) {
                    mensaje = "Registro insertado";
                }
            }else mensaje="ERROR CODIGO ENCONTRADO";
        }else mensaje="DATOS INVALIDOS";
        return mensaje;
    }
    
    public static ArrayList<Department> listarDepartment(){        
        return DepartmentDAL.listarDepartment();
    }
    
     public static String buscarDepartment(String numero){
        if (numero.trim().length()==4){
            return DepartmentDAL.buscarDepartment(numero);            
        }
        else{return "Dato no válido";}
    }
      public static String actualizarDepartment(String numero, String nombre) {
        String mensaje;
        if(numero.trim().length()>1&&numero.trim().length()<=4&&
                nombre.trim().length()>1&&nombre.trim().length()<=40 ) {
            Department department = new Department(numero,nombre);
            mensaje = DepartmentDAL.actualizarDepartment(department);
            if(mensaje == null) {
                mensaje = "Registro actualizado";
            }
        } else {
            mensaje = "Datos no válidos";
        }
        return mensaje;
    }
    
    public static String eliminarDepartment(String numero) {
        String mensaje;
        if(numero.trim().length()==4) {
            mensaje = DepartmentDAL.eliminarDepartment(numero);
            if(mensaje == null) {
                mensaje = "Registro eliminado";
            }
        } else
            mensaje = "Dato no válido";
        return mensaje;
    
}
