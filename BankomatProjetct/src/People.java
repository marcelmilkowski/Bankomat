import java.util.HashMap;
import java.util.Map;

public class People {
    public static Map<Integer, Person> Osoby = new HashMap<>();

    void addToMap(){
        Osoby.put(8121, new Person("Marcel", 1525,false));
        Osoby.put(6001, new Person("Jula", 35000,true));
        Osoby.put(1312, new Person("Paweł", 12,false));
    }





}


