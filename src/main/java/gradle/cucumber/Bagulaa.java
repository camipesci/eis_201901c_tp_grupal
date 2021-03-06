package gradle.cucumber;

public class Bagulaa extends Contenido{

    public EstadoDelPersonaje estado;

    public Bagulaa(){
        this.estado = new Vivo();
    }
    @Override
    public void interactuarConPersonajeMoviendoseA(Juego juego, Posicion destino) {

    }

    @Override
    public Contenido interactuarConBomba() {
        this.morir();
        return new LanzarBomba();
    }

    @Override
    public Boolean esSolido() {
        return false;
    }

    public Boolean estaMuerto(){ return this.estado.estaMuerto(); }

    public void morir(){ this.estado = new Muerto(); }
}
