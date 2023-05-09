public class Celula{
    Celula proxima;
    Celula anterior;
    Object elemento;

    //construtores
    Celula(Celula proxima, Object elemento){
        this.proxima = proxima;
        this.anterior = null;
        this.elemento = elemento;
    }

    //metodos e funcoes
    Celula(Object elemento){
        this.proxima = null;
        this.anterior = null;
        this.elemento = elemento;
    }

    void setProxima(Celula proxima){
        this.proxima = proxima;
    }

    void setAnterior(Celula anterior){
        this.anterior = anterior;
    }

    Celula getProxima(){
        return this.proxima;
    }

    Celula getAnterior(){
        return this.anterior; 
    }

    Object getElemento(){
        return this.elemento;
    }
}