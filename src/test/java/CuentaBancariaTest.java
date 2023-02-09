import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.natalia.CuentaBancaria.CuentaBancaria;

public class CuentaBancariaTest {

    @Test
    public void testRetirarDinero() {
        CuentaBancaria cuenta = new
        CuentaBancaria();

        cuenta.setSaldo(100);
        cuenta.retirar(200);
        assertEquals(0, cuenta.getSaldo());
    }

    @Test
    public void
    testRetirarSoloSiSaldoIgualoMayor() {
        CuentaBancaria cuenta= new
        CuentaBancaria();

        cuenta.retirar(100);

        assertEquals(0, cuenta.saldo);
    }

    @Test
    public void TestRetirarSaldoMayoroIgualOkei(){
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.setSaldo(100);

        cuentaBancaria.retirar(50);
        assertEquals(50, cuentaBancaria.getSaldo());
    }
    
}
