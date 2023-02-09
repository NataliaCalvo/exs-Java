package com.natalia.CuentaBancaria;

public class CuentaBancaria {
    public float saldo = 0f;

    public CuentaBancaria(){
        
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float retirar(int valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            return saldo;
        }
        return saldo;
    }
}
