/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helper;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Casa
 */
public class FormatarPreco {
    
    public static double formatarParaDouble(String precoString){
        
        //Magic, please don't touch
        precoString = precoString.replace(" ", "");
        
        precoString = precoString.replace(",", ".");
        
        double precoDouble = Double.parseDouble(precoString);
        
        return precoDouble;
        
    }
    
    public static double formatarReaisParaDouble(String precoStringReais){
        
        precoStringReais = precoStringReais.replace("R", "");
        precoStringReais = precoStringReais.replace("$", "");
        
        //Magic, please don't touch
        precoStringReais = precoStringReais.replace(" ", "");
        
        precoStringReais = precoStringReais.replace(",", ".");
        
        double precoDouble = Double.parseDouble(precoStringReais);
        
        return precoDouble;
    }
    
    public static String formatarParaReais(double preco){
        
        Locale ptBr = new Locale("pt", "BR");
        
        return NumberFormat.getCurrencyInstance(ptBr).format(preco);
        
    }
}
