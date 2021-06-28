package GeeB2_3_2;

import java.util.HashMap;
import java.util.Map;

public class TelSpr {

    public HashMap<String,String> hm;

    TelSpr(){
        this.hm = new HashMap<String, String>();
    }

    public void add(String fio, String tel){
        this.hm.put(tel,fio);
    }

    public void get(String fio){

        if (!hm.containsValue(fio)){
            System.out.println("Нет номера");
            return;
        }

        for (Map.Entry item: hm.entrySet()){
            if (fio == item.getValue()){
                System.out.println(item.getKey());
            }
        }
    }


}
