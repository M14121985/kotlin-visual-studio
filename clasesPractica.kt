

open class CuentaBancaria(val titularCuenta: String, protected var saldoActual: Int) {
    open fun depositar(cantidad: Int) {
        if (cantidad > 0) {
            saldoActual += cantidad
        }
    }

    open fun retirar(cantidad: Int) {
        if (cantidad <= saldoActual) {
            saldoActual -= cantidad
        } else {
            throw SaldoInsuficienteException("Saldo insuficiente")
        }
    }
}

class CuentaAhorroParticular(titularCuenta: String, saldoActual: Int) : CuentaBancaria(titularCuenta, saldoActual) {
    override fun depositar(cantidad: Int) {
        super.depositar(cantidad)
        println("El cliente $titularCuenta ingreso $cantidad. El saldo total de la cuenta es $saldoActual.")
    }
}

class SaldoInsuficienteException(mensaje: String) : Exception(mensaje)
//end{code}


fun main(){
    val cuentaAhorroParticular = CuentaAhorroParticular("Juan", 100_000_000)
    cuentaAhorroParticular.depositar(500_000_000)
    cuentaAhorroParticular.retirar(300)
    cuentaAhorroParticular.retirar(500)
}