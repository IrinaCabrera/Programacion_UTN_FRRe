package a;
import java.util.*;
public class set {
    static void add(Set set){
        set.add("HH");
        set.add(1);
        System.out.println(set.size());
    }
    public static void main(String[] args){
        Set <String> set = new HashSet<String>();
        add(set);
    }
}
