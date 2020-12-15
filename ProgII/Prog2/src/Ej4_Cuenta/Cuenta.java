package Ej4_Cuenta;

public class Cuenta {
    String id;
    String name;
    int balance;

    //defecto
    int balanceDEF=0;

    //contructor

    public Cuenta(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cuenta(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //get
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    //metodos

}
