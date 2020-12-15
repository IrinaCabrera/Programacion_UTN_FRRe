package Ej3_Autor;

public class Autor {
    String name;
    String mail;
    char sexo;

    //constructor
    public Autor(String name, String mail, char sexo) {
        this.name = name;
        this.mail = mail;
        this.sexo = sexo;
    }

    //metodos
    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public char getSexo() {
        return sexo;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}
