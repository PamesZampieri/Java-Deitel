package ejemplosTeoricos.unidad8;

// Cálculos del interés compuesto con BigDecimal.

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interes {
    public static void main(String[] args) {
        // monto principal inicial antes de los intereses
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal tasa = BigDecimal.valueOf(0.05);  // tasa de interés

        // muestra los encabezados
        System.out.printf("%s%20s%n", "Anio", "Monto en depósito");

        // calcula el monto en depósito para cada uno de diez años
        for (int anio = 1; anio <= 10; ++anio) {
            // calcula el nuevo monto para el año especificado
            BigDecimal monto = principal.multiply(tasa.add(BigDecimal.ONE).pow(anio));

            // muestra el año y el monto
            System.out.printf("%4d%20s%n", anio, NumberFormat.getCurrencyInstance().format(monto));
        }
    }
}