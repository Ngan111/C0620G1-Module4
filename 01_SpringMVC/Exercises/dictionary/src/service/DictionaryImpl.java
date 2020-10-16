package service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryImpl implements Dictionary {
    private static Map<String,String> dictionaryList;

    static {
        dictionaryList = new HashMap<>();
        dictionaryList.put("computer","máy tính");
        dictionaryList.put("scissors","cái kéo");
        dictionaryList.put("pencil","bút chì");
        dictionaryList.put("eraser","tẩy");
    }
    @Override
    public String findByKey(String key) {
        return dictionaryList.get(key);
    }


}
