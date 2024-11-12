package classes;

import interfaces.BatallonEstadoObserver;
import interfaces.BatallonMiembrosObserver;
import interfaces.Combatiente;
import observadores.PersonajeEstadoNotifier;

import java.util.ArrayList;
import java.util.List;

public class Batallon implements Combatiente {
    private List<Combatiente> miembros;
    private List<BatallonMiembrosObserver> observadoresMiembros;
    private List<BatallonEstadoObserver> observadoresEstado;

    public Batallon() {
        this.miembros = new ArrayList<>();
        this.observadoresMiembros = new ArrayList<>();
        this.observadoresEstado = new ArrayList<>();
    }

    @Override
    public void atacar(Combatiente objetivo) {
        for (Combatiente miembro : miembros) {
            if (!miembro.estaDerrotado())
                miembro.atacar(objetivo);
        }
    }

    @Override
    public void recibirDanio(int cantidad) {
        Combatiente primerMiembroVivo = miembros.stream().filter(miembro -> !miembro.estaDerrotado()).findFirst().orElse(null);
        if (primerMiembroVivo != null) {
            primerMiembroVivo.recibirDanio(cantidad);
        }
    }

    public void moverAlPrincipio(Combatiente miembro) {
        if (miembros.remove(miembro)) {
            miembros.add(0, miembro);
        }
    }

    public boolean estaActivo() {
        return !miembros.isEmpty();
    }

    @Override
    public boolean estaDerrotado() {
        for (Combatiente miembro : miembros) {
            if (!miembro.estaDerrotado())
                return false;
        }
        return true;
    }

    public boolean tienePersonajesSaludables() {
        for (Combatiente miembro : miembros) {
            if (!miembro.estaDerrotado())
                return true;
        }
        return false;
    }

    public void agregarPersonaje(Combatiente miembro) {
        miembros.add(miembro);
        if (miembro instanceof Personaje) {
            PersonajeEstadoNotifier notifier = new PersonajeEstadoNotifier(this);
            ((Personaje) miembro).agregarObservadorEstado(notifier);
        }
        notificarObservadoresMiembros();
    }

    public void agregarObservadorMiembros(BatallonMiembrosObserver observador) {
        observadoresMiembros.add(observador);
    }

    public void agregarObservadorEstado(BatallonEstadoObserver observador) {
        observadoresEstado.add(observador);
    }

    public List<Combatiente> getMiembros() {
        List<Combatiente> miembrosVivos = new ArrayList<>();
        for (Combatiente miembro : miembros) {
            if (!miembro.estaDerrotado()) {
                miembrosVivos.addAll(miembro.getMiembros());
            }
        }
        return miembrosVivos;
    }

    @Override
    public void recibirProteccion(int cantidad) {
        for (Combatiente miembro : miembros) {
            if (!miembro.estaDerrotado())
                miembro.recibirProteccion(cantidad);
        }
    }

    public void onPersonajeMuerto(Personaje personaje) {
        notificarMiembroPerdido(personaje);
        if (estaDerrotado()) {
            notificarBatallonDerrotado();
        } else {
            notificarBatallonDebilitado();
        }
    }

    private void notificarMiembroPerdido(Combatiente miembro) {
        for (BatallonMiembrosObserver observer : observadoresMiembros) {
            observer.onMiembroPerdido(this, miembro);
        }
    }

    private void notificarBatallonDerrotado() {
        for (BatallonEstadoObserver observer : observadoresEstado) {
            observer.onBatallonDerrotado(this);
        }
    }

    private void notificarBatallonDebilitado() {
        for (BatallonEstadoObserver observer : observadoresEstado) {
            observer.onBatallonDebilitado(this);
        }
    }

    private void notificarObservadoresMiembros() {
        for (BatallonMiembrosObserver observer : observadoresMiembros) {
            observer.onMiembroDebilitado(this, null);
        }
    }
}