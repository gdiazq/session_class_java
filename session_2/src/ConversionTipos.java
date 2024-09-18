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
    }
}
