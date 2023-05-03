package Exercise2;

import java.util.ArrayList;

public class ArrayListDictionary implements IDictionary {
    private ArrayList<String> words;
    private ArrayListDictionary instance;

    ArrayListDictionary() {
        this.words = new ArrayList<>();
    }

    public static IDictionary newInstance(){
            return new ArrayListDictionary();
    }


    public int size() {
        return words.size();
    }

    public boolean add(String word) {
        if(find(word)){
            words.add(word);
            return true;
        }
        return false;
    }
    public boolean find(String target){
        for (String word : words){
            if(word.equals(target))
                return true;
        }
        return false;
    }
}
