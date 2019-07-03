/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Obuka
 */
@Named(value = "brojac")
@Dependent
public class brojac {

    /**
     * Creates a new instance of brojac
     */
    public brojac() {
        
    }
    public  String poruka(){
          return "Nova poruka iz brojaca;sdfgdsre";
    }
}
