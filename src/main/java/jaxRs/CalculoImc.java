package jaxRs;

import static java.lang.System.out;

public class CalculoImc {

	public CalculoImc() {}
         
	public float calculaImc(float altura, float peso) {          
            Float imc = peso/ (altura*altura);
            return imc;  
    }
	
    public String resultadoImc (float imc){ 
    	String resultado = "";
    	            
        if(imc < 18.5 && imc > 0)  { 
        	resultado = "Voce esta magro";   
        }
        else  if(imc >=24.9 && imc <29.9) {  
        	resultado = "Voce esta com sobre peso";         
        }  
        else  if(imc >=29.9 && imc <39.9)  {  
        	resultado = "Voce esta com obesidade";         
        }  
        else  if(imc > 39.9)  {  
        	resultado = "Voce esta com obesidade grave";  
        }
                
        return resultado;    
        
    }
               
}