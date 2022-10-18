package monopolio;

public class CasillaFactory {

    public Casilla getCasilla(String tipo) {
        switch (tipo) {
            case "Propiedad":
                return new Propiedad();
            case "Compania":
                return new Compania();
            case "Ingreso":
                return new Ingreso();   
            case "Pago":
                return new Pago();        
        }
        return null;

    }
}
