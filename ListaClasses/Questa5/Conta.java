package ListaClasses.Questa5;

class Conta {
    double saldo;
    void sacar(double qtd){
        saldo-=qtd;
    }
    void depositar(double qtd){
        saldo+=qtd;
    }

}
