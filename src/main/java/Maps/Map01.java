package Maps;

import java.util.*;

public class Map01 {
    public static void main(String[] args) {

        HashMap<String, Integer> studentAge = new HashMap<>();

        studentAge.put("Ali", 13);
        studentAge.put("Tom", 21);
        studentAge.put("Brad", 12);
        studentAge.put("Ajda", 76);
        studentAge.put("Cuneyt", 75);
        studentAge.put("Ali", 88); //Ayni key degerini tekrar vermez ovwewrite yapar..
        studentAge.put(null, 55);
        studentAge.put(null, 66); //Ayni key degerini tekrar vermez ovwewrite yapar..
        studentAge.put("Ayhan Isik", null);
        studentAge.put("Sadri alisik", null);



        System.out.println(studentAge); //{null=66, Ayhan Isik=null, Tom=21, Ajda=76, Brad=12, Cuneyt=75, Sadri alisik=null, Ali=88}

        //Map'den sadece key ler nasil alinir ...

        Set<String> keys =  studentAge.keySet();
        System.out.println(keys);   // [null, Ayhan Isik, Tom, Ajda, Brad, Cuneyt, Sadri alisik, Ali]



        //Map'den sadece values ler nasil alinir ... // En son guncellenmis degerleri verir..
        Collection<Integer> values = studentAge.values();
        System.out.println(values);  // [66, null, 21, 76, 12, 75, null, 88]


        Collection<String> keyy = studentAge.keySet();
        System.out.println(keyy);

        List<String> list = new ArrayList<>(keyy);
        list.sort(Comparator.comparing(String::valueOf));
        System.out.println(list);

        for(Map.Entry<String, Integer> w : studentAge.entrySet()){

            System.out.println(w.getValue());

        }


        List<String> list1 = new ArrayList<>();
        for(String w : studentAge.keySet()){
            if(w!=null){
                list1.add(w);
            }
        }

//       Collections.sort(list1);
//       list1.sort(Comparator.comparing(String::length));

        Collections.sort(list1, Collections.reverseOrder(Comparator.comparing(String::length)));
        System.out.println(list1);

    }
}
