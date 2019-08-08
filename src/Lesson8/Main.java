package Lesson8;

public class Main {
    public static void main(String[] args) {
        ChainingHashMap<Integer, String> hm = new ChainingHashMap<>();
//        hm.put(1,"one");
//        hm.put(2,"two");
//        hm.put(3,"three");
//        hm.put(4,"four");

//        System.out.println(hm.get(3));

        for (int i = 0; i <99 ; i++) {
            hm.put((int)i,""+i);
        }

        System.out.println(hm);

        System.out.println();

        //удаляем репдиджиты и 0
        for (int i = 0; i < 9; i++) {
            hm.remove(11*i);
        }

        System.out.println(hm);

        System.out.println("Удаление из хешмапы с линейной пробацией:");

        LinearProbingHashMap<Integer, String> lhm = new LinearProbingHashMap<>();


//        for (int i = 0; i <18 ; i++) {
//            lhm.put((int)(Math.random()*1000),""+i);
//        }


        lhm.put(20,""+"test");
        lhm.put(60,""+"test");
        lhm.put(40,""+"test");
        lhm.put(80,""+"test");

        System.out.println(lhm);


        lhm.remove(20);
        System.out.println(lhm);
        lhm.remove(80);
        System.out.println(lhm);
        lhm.remove(60);
        System.out.println(lhm);

    }
}
