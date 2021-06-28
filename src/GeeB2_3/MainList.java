/*
1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
 */
package GeeB2_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MainList {
    public static void main(String[] args) {

        String[] st = new String[]{"ад","карта","лось","кедр","слон","кедр","нос","высь", "нос","кол","идол","укус"};

        HashSet <String> hs = new HashSet<String>();

        HashMap<String,Integer> hm = new HashMap<String,Integer>();

        for (int i = 0; i < st.length; i++) {
            hs.add(st[i]);

            if (hm.containsKey(st[i])){
                hm.put(st[i], hm.get(st[i]) + 1);
            }else {
                hm.put(st[i], 1);
            }
        }
        System.out.println(hs.toString());

        for (Map.Entry<String,Integer> item: hm.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }






    }
}