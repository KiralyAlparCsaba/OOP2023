package Exercise2;

import java.util.ArrayList;

public class ArrayListDictionary implements IDictionary {
    private ArrayList<String> words;
    private ArrayListDictionary instance;

    public ArrayListDictionary() {
        this.words = new ArrayList<>();
    }


    public int size() {
        return words.size();
    }

    public boolean add(String word) {
        words.add(word);
        return true;
    }
    public boolean find(String target){
        for (String word : words){
            if(word.equals(target))
                return true;
        }
        return false;
    }
}
