package abstractfactory;
public class ProductorFabrica {

	public static IFabricaAbstracta getFactory(String tipoFabrica) {

		if (tipoFabrica.equalsIgnoreCase("BD")) {
			return new FabricaConexionBD();

		} else if (tipoFabrica.equalsIgnoreCase("REST")) {
			return new FabricaConexionREST();
		}

		return null;
	}

}
