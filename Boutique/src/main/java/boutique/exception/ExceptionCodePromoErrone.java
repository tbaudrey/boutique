/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.exception;

/**
 *
 * @author admin
 */
public class ExceptionCodePromoErrone extends Exception {

    public ExceptionCodePromoErrone() {
    }
    
    public ExceptionCodePromoErrone(String msg){
        super(msg);
    }
    
}
