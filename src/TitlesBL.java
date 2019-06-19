/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.sql.Date;
import datos .*;
import entidades.Title;

/**
 *
 * @author R000R
 */
public class TitlesBL {
    
     public static String insertarTitles(
     Double codigo, String titulo,
             Date from_date, Date to_date){
          String mensaje;
        if(codigo>10000&&codigo<=1000000000
                &&titulo.trim().length()>1 &&titulo.trim().length()<=50 
               && from_date.getTime()!=0 && to_date.getTime()!=0)
        {
            String totalString = String.valueOf(codigo);
            if(TitleDAL.buscarTitle(totalString)==null){
                Title titles = new Title(codigo,titulo,from_date,to_date);
                mensaje=TitleDAL.insertarTitle(titles);
                if(mensaje == null) {
                    mensaje = "Registro insertado";
                }
            }else mensaje="ERROR CODIGO ENCONTRADO";
        }else mensaje="DATOS INVALIDOS";
        return mensaje;
    }
     
     
    public static ArrayList<Title> listarTitles(){        
        return TitleDAL.listarTitle();
    }
    
     public static String buscarMovimiento(Double codigo){
        if (codigo>10000&&codigo<=1000000000){
            String totalString = String.valueOf(codigo);
            return TitleDAL.buscarTitle(totalString);            
        }
        else{return "Dato no válido";}
    }
     
     public static String UpdateTitle(Double codigo, String titulo,
             Date from_date, Date to_date) {
        String mensaje;
        if(codigo>10000&&codigo<=1000000000
                &&titulo.trim().length()>1 &&titulo.trim().length()<=50 
                && from_date.getTime()!=0 && to_date.getTime()!=0
                ) {
            Title title = new Title(codigo,titulo,from_date,to_date);
            mensaje = TitleDAL.UpdateTitle(title);
            if(mensaje == null) {
                mensaje = "Registro actualizado";
            }
        } else {
            mensaje = "Datos no válidos";
        }
        return mensaje;
    }
     
     
     public static String eliminarTitle(Double codigo) {
        String mensaje;
        if(codigo>10000&&codigo<=1000000000) {
            String totalString = String.valueOf(codigo);
            mensaje = TitleDAL.eliminarTitle(totalString);
            if(mensaje == null) {
                mensaje = "Registro eliminado";
            }
        } else
            mensaje = "Dato no válido";
        return mensaje;
    }
}
