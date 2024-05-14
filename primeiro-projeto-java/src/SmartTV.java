public class SmartTV {
    private int volume;
    private boolean ligada;
    private int canal;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        this.volume++;
    }

    public void diminuirVolume(){
        this.volume--;
    }

    public void aumentarCanal(){
        this.canal++;
    }

    public void diminuirCanal(){
        this.canal--;
    }

    public void escolherCanal(int canal){
        this.canal = canal;
    }

    public boolean estaLigada(){
        return ligada;
    }

    public int volume(){
        return this.volume;
    }

    public int canal(){
        return this.canal;
    }
    
}