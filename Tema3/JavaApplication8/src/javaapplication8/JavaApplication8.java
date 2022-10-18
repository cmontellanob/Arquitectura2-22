package javaapplication8;

public class JavaApplication8 {

    public static String calculaDigitoMod11(String cadena, int numDig, int limMult, boolean x10) {
        int mult, suma, i, n, dig;
        if (!x10) {
            numDig = 1;
        }
        for (n = 1; n <= numDig; n++) {
            suma = 0;
            mult = 2;
            for (i = cadena.length() - 1; i >= 0; i--) {
                System.out.println(cadena.substring(i, i + 1));
                suma += (mult * Integer.parseInt(cadena.substring(i, i + 1)));
                if (++mult > limMult) {
                    mult = 2;
                }
            }
            if (x10) {
                dig = ((suma * 10) % 11) % 10;
            } else {
                dig = suma % 11;
            }
            if (dig == 10) {
                cadena += "1";
            }
            if (dig == 11) {
                cadena += "0";
            }
            if (dig < 10) {
                cadena += String.valueOf(dig);
            }
        }
        return cadena.substring(cadena.length() - numDig, cadena.length());
    }

    public static String obtenerModulo11(String pCadena) {
        String vDigito = calculaDigitoMod11(pCadena, 1, 9, false);
        return vDigito;
    }

    public static void main(String[] args) {
        String a = obtenerModulo11("00038277270192022101200070520300001110100000000010001");
        System.out.print(a);
    }

}
