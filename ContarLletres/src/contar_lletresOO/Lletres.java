package contar_lletresOO;

import java.util.ArrayList;

/**
 * Classe per crear objecte de tipus "lletra".
 * @author Jose Garvin Victoria
 *
 */
public class Lletres {

	/**
	 * Lletra a cercar.
	 */
    char lletra;

    /**
     * Numero d'aparicions de la lletra
     */
    int aparicions;


    //Constructor lletra.
    public Lletres(char lletrab){
        lletra = lletrab;
        Incrementa();

    }

    public void Incrementa(){
        aparicions++;
    }


    public char getLletra() {
        return lletra;
    }
    public void setLletra(char lletra) {
        this.lletra = lletra;
    }
    public int getAparicions() {
        return aparicions;
    }
    public void setAparicions(int aparicions) {
        this.aparicions = aparicions;
    }


    public boolean equals(Object o){
    	if(o == null){
    		return false;
    	}
    	if(!(o instanceof Lletres)){
    		return false;

    	}
    	Lletres other = (Lletres) o;
    	return this.lletra == other.lletra;
    }

}
