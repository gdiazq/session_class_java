public class ConversionTipos {
    public static void main(String[] args) {
        int numeroEntero = 10;
        System.out.println("Numero entero: " + numeroEntero);
        System.out.println("Numero entero en binario: " + Integer.toBinaryString(numeroEntero));
        System.out.println("Numero entero en octal: " + Integer.toOctalString(numeroEntero));
        System.out.println("Numero entero en hexadecimal: " + Integer.toHexString(numeroEntero));

        double numeroDecimal = 10.5;
        System.out.println("Numero decimal: " + numeroDecimal);
        System.out.println("Numero decimal en binario: " + Double.toHexString(numeroDecimal));

        String numeroStr = "10";
        int numeroDec = Integer.parseInt(numeroStr);
        System.out.println("Numero ingresado: " + numeroDec);

        String realStr = "98765.43";
        double numeroDouble = Double.parseDouble(realStr);
        System.out.println("Numero double: " + numeroDouble);

        String logicoStr = "true";
        boolean logicoBool = Boolean.parseBoolean(logicoStr);
        System.out.println("Valor logico: " + logicoBool);

        int otroNumeroInt = 100;
        System.out.println("Numero entero: " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("Numero entero convertido a cadena: " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt++);
        System.out.println("Numero entero convertido a cadena: " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("Numero double convertido a cadena: " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("Numero double convertido a cadena: " + otroRealStr);

        int i = 10000;
        short s = (short) i;
        System.out.println("Valor short: " + s);
        long l = i;
        System.out.println("Valor long: " + l);
        System.out.println(Short.MAX_VALUE);
    }
}
