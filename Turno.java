package Conecta4;

import java.util.Random;

public class Turno {
      private int valor;

    public Turno(){
      this.valor =new Random().nextInt(2);
    }

    public int tocar(){ 
      return this.valor;
    }

    public void cambiar() {
      this.valor=this.noToca();
    }
    public int noToca() {
       return (this.valor +1)%2;
    }
}
