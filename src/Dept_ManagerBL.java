/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.TitleDAL;
import entidades.DManager;
import entidades.Title;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author R000R
 */
public class Dept_ManagerBL {
      public static String insertarDManager(
     String codigo_dept, String codigo_nombre,
             Date from_date, Date to_date){
          String mensaje;
        if(codigo_dept.trim().length()>1 &&codigo_dept.trim().length()<=4
           &&codigo_nombre.trim().length()>1 &&codigo_nombre.trim().length()<=11 
           && from_date.getTime()!=0 && to_date.getTime()!=0
                )
        {
            if(TitleDAL.buscarTitle(codigo_dept)==null){
                DManager manager = new DManager(codigo_dept,codigo_nombre,from_date,to_date);
                mensaje=DManagerDAL.insertarDManager(manager);
                if(mensaje == null) {
                    mensaje = "Registro insertado";
                }
            }else mensaje="ERROR CODIGO ENCONTRADO";
        }else mensaje="DATOS INVALIDOS";
        return mensaje;
    }
     
     
    public static ArrayList<Title> listarDManager(){        
        return DManagerDAL.listarDManager();
    }
    
     public static String buscarDManager(String codigo_dept){
        if (codigo_dept.trim().length()>1 &&codigo_dept.trim().length()<=4){

            return DManagerDAL.buscarDManager(codigo_dept);            
        }
        else{return "Dato no válido";}
    }
     
     public static String UpdateDManager(  String codigo_dept, String codigo_nombre,
             Date from_date, Date to_date) {
        String mensaje;
        if(codigo_dept.trim().length()>1 &&codigo_dept.trim().length()<=4
           &&codigo_nombre.trim().length()>1 &&codigo_nombre.trim().length()<=11
                && from_date.getTime()!=0 && to_date.getTime()!=0
                ) {
            DManager manager = new DManager(codigo_dept,codigo_nombre,from_date,to_date);
            mensaje = DManagerDAL.UpdateDManager(manager);
            if(mensaje == null) {
                mensaje = "Registro actualizado";
            }
        } else {
            mensaje = "Datos no válidos";
        }
        return mensaje;
    }
     
     
     public static String eliminarDManager(String codigo_dept) {
        String mensaje;
        if(codigo_dept.trim().length()>1 &&codigo_dept.trim().length()<=4) {
     
            mensaje = DManagerDAL.eliminarDManager(codigo_dept);
            if(mensaje == null) {
                mensaje = "Registro eliminado";
            }
        } else
            mensaje = "Dato no válido";
        return mensaje;
    }
}
