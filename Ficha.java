
/**
 * Write a description of class Ficha here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ficha
{
    // instance variables - replace the example below with your own
    private int tamano;
    private int valor1;
    private int valor2;
    private int posicionX;
    private int posicionY;  
    private boolean estaVolteada;
    private boolean estaVisible;
    private boolean rotado;
    private Square figura;
    private Square figura1;
    private Square figura2;
    private Square figura3;
    
    private Square puntoA;
    private Square puntoA1;
    private Square puntoA2;
    private Square puntoA3;
    private Square puntoA4;
    private Square puntoA5;
    private Square puntoA6;
    private Square puntoA7;
    private Square puntoA8;
    
    private Square puntoB;
    private Square puntoB1;
    private Square puntoB2;
    private Square puntoB3;
    private Square puntoB4;
    private Square puntoB5;
    private Square puntoB6;
    private Square puntoB7;
    private Square puntoB8;
    
    /**
     * Constructor for objects of class Ficha
     */
    public Ficha(int valor1, int valor2)
    {
        if((valor2-valor1)>=0 && (valor1>=0 && valor1<=6) && (valor2>=0 && valor2<=6)){
            this.valor1 = valor1;
            this.valor2 = valor2;        
        }else{
            throw new IllegalArgumentException("Valores de ficha inválidos: valor1 = " + valor1 + ", valor2 = " + valor2);        
        }
        tamano = 50;
        estaVolteada = false;
        estaVisible = false;
        rotado = false;
        figura = new Square();
        figura1 = new Square();
        figura2 = new Square();
        figura3 = new Square();
        
        puntoA = new Square();
        puntoA1 = new Square();
        puntoA2 = new Square();
        puntoA3 = new Square();
        puntoA4 = new Square();
        puntoA5 = new Square();
        puntoA6 = new Square();
        puntoA7 = new Square();
        puntoA8 = new Square();
        
        
        puntoB = new Square();
        puntoB1 = new Square();
        puntoB2 = new Square();
        puntoB3 = new Square();
        puntoB4 = new Square();
        puntoB5 = new Square();
        puntoB6 = new Square();
        puntoB7 = new Square();
        puntoB8 = new Square();
    }
    
    public void dibujar (){
        dibujarFicha();
        if(!estaVolteada){
        dibujarPuntosA();
        dibujarPuntosb();
        estaVisible = true;
        }
    }
    public void voltearFicha(){
    if(estaVisible){
        estaVolteada =!estaVolteada;
        if(!estaVolteada ){
        dibujar();
        }else {
        borrarPuntos();
        }
   
    }   
    }

        public void girar90(){
    if(estaVisible){
    rotado = !rotado;
    borrarFicha();
    borrarPuntos();
    dibujar();
    }
    }
    private void borrarFicha (){
        figura.makeInvisible();
        figura1.makeInvisible();
        figura2.makeInvisible();
        figura3.makeInvisible();
    }
    
    private void borrarPuntos (){
        puntoA.makeInvisible();
        puntoA1.makeInvisible();
        puntoA2.makeInvisible();
        puntoA3.makeInvisible();
        puntoA4.makeInvisible();
        puntoA5.makeInvisible();
        puntoA6.makeInvisible();
        puntoA7.makeInvisible();
        puntoA8.makeInvisible();
        
        puntoB.makeInvisible();
        puntoB1.makeInvisible();
        puntoB2.makeInvisible();
        puntoB3.makeInvisible();
        puntoB4.makeInvisible();
        puntoB5.makeInvisible();
        puntoB6.makeInvisible();
        puntoB7.makeInvisible();
        puntoB8.makeInvisible();        
    }

    private void dibujarPuntosA(){
        puntoA.changeSize(10);
        puntoA1.changeSize(10);
        puntoA2.changeSize(10);
        puntoA3.changeSize(10);
        puntoA4.changeSize(10);
        puntoA5.changeSize(10);
        puntoA6.changeSize(10);
        puntoA7.changeSize(10);
        puntoA8.changeSize(10);
        
        
        puntoA.changePositions(posicionX+(tamano/10)*1, posicionY+(tamano/10)*1);
        puntoA1.changePositions(posicionX+(tamano/10)*4, posicionY+(tamano/10)*1);
        puntoA2.changePositions(posicionX+(tamano/10)*7, posicionY+(tamano/10)*1);
        
        puntoA3.changePositions(posicionX+(tamano/10)*1, posicionY+(tamano/10)*4);
        puntoA4.changePositions(posicionX+(tamano/10)*4, posicionY+(tamano/10)*4);
        puntoA5.changePositions(posicionX+(tamano/10)*7, posicionY+(tamano/10)*4);
        
        puntoA6.changePositions(posicionX+(tamano/10)*1, posicionY+(tamano/10)*7);
        puntoA7.changePositions(posicionX+(tamano/10)*4, posicionY+(tamano/10)*7);
        puntoA8.changePositions(posicionX+(tamano/10)*7, posicionY+(tamano/10)*7);
        
        
        if(valor1 == 0){
            
        }else if(valor1 ==1){
        puntoA4.makeVisible();   
        puntoA4.changeColor("red");
        }else if(valor1 ==2){
            if(!rotado){
                puntoA3.makeVisible();
                puntoA5.makeVisible();    
                puntoA3.changeColor("blue");
                puntoA5.changeColor("blue");
            }else{
                puntoA1.makeVisible();
                puntoA7.makeVisible();    
                puntoA1.changeColor("blue");
                puntoA7.changeColor("blue");    
            }
            
        }else if(valor1 ==3){
        puntoA.makeVisible();
        puntoA4.makeVisible();
        puntoA8.makeVisible();
        
        puntoA.changeColor("yellow");
        puntoA4.changeColor("yellow");    
        puntoA8.changeColor("yellow");
        }else if(valor1 ==4){
        puntoA.makeVisible();
        puntoA2.makeVisible();
        puntoA6.makeVisible();
        puntoA8.makeVisible();
        
        puntoA.changeColor("magenta");
        puntoA2.changeColor("magenta");
        puntoA6.changeColor("magenta");
        puntoA8.changeColor("magenta");          
        }else if(valor1 ==5){
        puntoA.makeVisible();
        puntoA2.makeVisible();
        puntoA4.makeVisible();
        puntoA6.makeVisible();
        puntoA8.makeVisible();    
        
        puntoA.changeColor("verde bebe");
        puntoA2.changeColor("verde bebe");
        puntoA4.changeColor("verde bebe");
        puntoA6.changeColor("verde bebe");
        puntoA8.changeColor("verde bebe");
        }else if(valor1 ==6){
            if(!rotado){
                puntoA.makeVisible();
                puntoA3.makeVisible();
                puntoA6.makeVisible();
                puntoA2.makeVisible();
                puntoA5.makeVisible();
                puntoA8.makeVisible();
                
                
                puntoA.changeColor("cafe chocolate");
                puntoA3.changeColor("cafe chocolate");
                puntoA6.changeColor("cafe chocolate");
                puntoA2.changeColor("cafe chocolate");
                puntoA5.changeColor("cafe chocolate");
                puntoA8.changeColor("cafe chocolate");
            }else{
                puntoA.makeVisible();
                puntoA1.makeVisible();
                puntoA2.makeVisible();
                puntoA6.makeVisible();
                puntoA7.makeVisible();
                puntoA8.makeVisible();
                
                puntoA.changeColor("cafe chocolate");;
                puntoA1.changeColor("cafe chocolate");;
                puntoA2.changeColor("cafe chocolate");;
                puntoA6.changeColor("cafe chocolate");;
                puntoA7.changeColor("cafe chocolate");;
                puntoA8.changeColor("cafe chocolate");
            
            }
        }
    }
    
    private void dibujarPuntosb(){
        puntoB.changeSize(10);
        puntoB1.changeSize(10);
        puntoB2.changeSize(10);
        puntoB3.changeSize(10);
        puntoB4.changeSize(10);
        puntoB5.changeSize(10);
        puntoB6.changeSize(10);
        puntoB7.changeSize(10);
        puntoB8.changeSize(10);
        
        int rotado = this.rotado ? 0 : 1;
        int noRotado = this.rotado ? 1 : 0;
        
        puntoB.changePositions(posicionX+(tamano/10)*1 +(noRotado* tamano), (posicionY+(tamano/10)*1) + (rotado* tamano));
        puntoB1.changePositions(posicionX+(tamano/10)*4 +(noRotado* tamano), (posicionY+(tamano/10)*1) + (rotado* tamano));
        puntoB2.changePositions(posicionX+(tamano/10)*7 +(noRotado* tamano), (posicionY+(tamano/10)*1) + (rotado* tamano));
        
        puntoB3.changePositions(posicionX+(tamano/10)*1 +(noRotado* tamano), (posicionY+(tamano/10)*4) + (rotado* tamano));
        puntoB4.changePositions(posicionX+(tamano/10)*4 +(noRotado* tamano), (posicionY+(tamano/10)*4) + (rotado* tamano));
        puntoB5.changePositions(posicionX+(tamano/10)*7 +(noRotado* tamano), (posicionY+(tamano/10)*4) + (rotado* tamano));
        
        puntoB6.changePositions(posicionX+(tamano/10)*1 +(noRotado* tamano), (posicionY+(tamano/10)*7) + (rotado* tamano));
        puntoB7.changePositions(posicionX+(tamano/10)*4 +(noRotado* tamano), (posicionY+(tamano/10)*7) + (rotado* tamano));
        puntoB8.changePositions(posicionX+(tamano/10)*7 +(noRotado* tamano), (posicionY+(tamano/10)*7) + (rotado* tamano));
        
        
        if(valor2 == 0){
            
        }else if(valor2 ==1){
        puntoB4.makeVisible();   
        puntoB4.changeColor("red");
        }else if(valor2 ==2){
            if(!this.rotado){
                puntoB3.makeVisible();
                puntoB5.makeVisible();    
                puntoB3.changeColor("blue");
                puntoB5.changeColor("blue");
            }else{
                puntoB1.makeVisible();
                puntoB7.makeVisible();    
                puntoB1.changeColor("blue");
                puntoB7.changeColor("blue");    
            }
            
        }else if(valor2 ==3){
        puntoB.makeVisible();
        puntoB4.makeVisible();
        puntoB8.makeVisible();
        
        puntoB.changeColor("yellow");
        puntoB4.changeColor("yellow");    
        puntoB8.changeColor("yellow");
        }else if(valor2 ==4){
        puntoB.makeVisible();
        puntoB2.makeVisible();
        puntoB6.makeVisible();
        puntoB8.makeVisible();
        
        puntoB.changeColor("magenta");
        puntoB2.changeColor("magenta");
        puntoB6.changeColor("magenta");
        puntoB8.changeColor("magenta");          
        }else if(valor2 ==5){
        puntoB.makeVisible();
        puntoB2.makeVisible();
        puntoB4.makeVisible();
        puntoB6.makeVisible();
        puntoB8.makeVisible();    
        
        puntoB.changeColor("verde bebe");
        puntoB2.changeColor("verde bebe");
        puntoB4.changeColor("verde bebe");
        puntoB6.changeColor("verde bebe");
        puntoB8.changeColor("verde bebe");
        }else if(valor2 ==6){
            if(!this.rotado){
                puntoB.makeVisible();
                puntoB3.makeVisible();
                puntoB6.makeVisible();
                puntoB2.makeVisible();
                puntoB5.makeVisible();
                puntoB8.makeVisible();
                
                
                puntoB.changeColor("cafe chocolate");
                puntoB3.changeColor("cafe chocolate");
                puntoB6.changeColor("cafe chocolate");
                puntoB2.changeColor("cafe chocolate");
                puntoB5.changeColor("cafe chocolate");
                puntoB8.changeColor("cafe chocolate");
            }else{
                puntoB.makeVisible();
                puntoB1.makeVisible();
                puntoB2.makeVisible();
                puntoB6.makeVisible();
                puntoB7.makeVisible();
                puntoB8.makeVisible();
                
                puntoB.changeColor("cafe chocolate");;
                puntoB1.changeColor("cafe chocolate");;
                puntoB2.changeColor("cafe chocolate");;
                puntoB6.changeColor("cafe chocolate");;
                puntoB7.changeColor("cafe chocolate");;
                puntoB8.changeColor("cafe chocolate");
            
            }
        }
    }
    private void dibujarFicha(){
        int rotado = this.rotado ? 0 : 1;
        int noRotado = this.rotado ? 1 : 0;
        
        figura.changeSize(tamano);
        figura1.changeSize(tamano-2);
        figura2.changeSize(tamano);
        figura3.changeSize(tamano-2);
        
        figura.changeColor("black");
        figura1.changeColor("white");
        figura.changePositions(posicionX, posicionY);
        figura1.changePositions(posicionX+1, posicionY+1);
        
        figura2.changeColor("black");
        figura3.changeColor("white");
        figura2.changePositions(posicionX+(tamano*noRotado) , (posicionY+ (tamano*rotado)));
        figura3.changePositions((posicionX+(tamano*noRotado))+1, (posicionY+(tamano*rotado))+1);
        
        figura.makeVisible();
        figura1.makeVisible();
        figura2.makeVisible();
        figura3.makeVisible();
    }

    public void moverFicha(int posicionX, int posicionY){
    borrarFicha();
    borrarPuntos();
    this.posicionX = posicionX;
    this.posicionY = posicionY;
    dibujar();
    }
    public int getValor1(){
    return valor1;
    }
    public int getValor2(){
    return valor2;
    }
    public boolean getRotado(){
    return rotado;
    }
    public void mostrarFichaConsola(){
        System.out.println(getValor1() + "/" + getValor2());
    }
}
