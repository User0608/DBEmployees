/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import entidades.Title;
import java.util.ArrayList;
import java.util.Iterator;
import datos.*;
/**
 *
 * @author adriana
 */
public class Main {
  
   
    
    public static void main(String[] args ){
        ArrayList<Title> title=TitleDAL.listarTitle();
        Iterator<Title> iterator = title.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
}
