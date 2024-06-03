/*
8.18 (Clase Cuenta con saldo tipo BigDecimal) Vuelva a escribir la clase Cuenta de la sección 3.5 para almacenar el
saldo como un objeto BigDecimal y realizar todos los cálculos usando objetos BigDecimal.
*/

package ejerciciosRealizados.unidad8;

import java.math.BigDecimal;

public class Cuenta {
    private String nombre;
    private BigDecimal saldo;

    public Cuenta(String nombre, BigDecimal saldo) {
        this.nombre = nombre;

        if (saldo.compareTo(BigDecimal.ZERO) > 0.0) {
            this.saldo = saldo;
        } else {
            this.saldo = BigDecimal.ZERO;
        }
    }

    public void depositar(BigDecimal montoDeposito) {
        if (montoDeposito.compareTo(BigDecimal.ZERO) > 0.0) {
            saldo = saldo.add(montoDeposito);
        }
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        if (saldo.compareTo(BigDecimal.ZERO) > 0.0) {
            this.saldo = saldo;
        } else {
            throw new IllegalArgumentException("El saldo tiene que ser mayor que cero.");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void retirar(BigDecimal montoRetiro) {
        if (montoRetiro.compareTo(saldo) > 0) {
            System.out.println("El monto a retirar excede el saldo de la cuenta");
        } else {
            saldo = saldo.subtract(montoRetiro);
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        }
    }
}