import javax.swing.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Parcial {

    public static int leerInt(String mensaje){
        int ans = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return ans;
    }

    public static float leerFloat(String mensaje){
        float ans = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
        return ans;
    }

    public static String leerString(String mensaje){
        String texto = JOptionPane.showInputDialog(mensaje);
        return texto;
    }

    public static int dia(){
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int dia   = localDate.getDayOfMonth();
        return dia;
    }

    public static int mes(){
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int mes = localDate.getMonthValue();
        return mes;
    }

    public static int anio(){
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int anio  = localDate.getYear();
        return anio;
    }

    public static void imprimir(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }


}