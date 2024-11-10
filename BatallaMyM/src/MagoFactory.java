
public class MagoFactory extends PersonajeFactory {

	
    @Override
    protected Personaje crearMortifago(TipoPersonaje tipo) {
        throw new UnsupportedOperationException("MagoFactory no puede crear Mortífagos.");
    }

	@Override
	protected Personaje crearMago(TipoPersonaje tipo) {
		// TODO Auto-generated method stub
		//return null;
		
	       switch (tipo) {
           case AUROR:
//               return new Auror(nombre, puntosDeVida, varita, sistemaDefensivo, capacidadHechicero);
           case PROFESOR:
//               return new Profesor();
           case ESTUDIANTE:
//               return new Estudiante();
           default:
               throw new IllegalArgumentException("Tipo de Mago no válido.");
       }
	}
}
