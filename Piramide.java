import java.util.ArrayList;
/**
 * Write a description of class Piramide here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Piramide
{
    // instance variables - replace the example below with your own
    ArrayList<Ficha> fichas = new ArrayList<>();
    

    /**
     * Constructor for objects of class Piramide
     */
    public Piramide(){
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void crearPiramide(){
        int xInicial =100;
        int yInicial =500;
        
        
        for(int i=0; i<=6;i++){
            for(int j= 0; i>=j; j++){
            fichas.add(new Ficha(j,i)) ;
            }
        }
        
        for(int i=0; i<28;i++){
        fichas.get(i).moverFicha(xInicial +(fichas.get(i).getValor2()*110 ), yInicial-(fichas.get(i).getValor1()*60 ));
        fichas.get(i).dibujar();
        if(!fichas.get(i).getRotado()) fichas.get(i).girar90();
    }
        
    }
}
