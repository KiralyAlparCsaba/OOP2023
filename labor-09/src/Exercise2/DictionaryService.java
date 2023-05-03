package Exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static Exercise2.DictionaryProvider.createDictionary;

public class DictionaryService {
    private IDictionary dictionary;


    public DictionaryService(DictionaryType type) {
        dictionary = DictionaryProvider.createDictionary(type);
    }
    public  boolean findWord(String target){
        return dictionary.find(target);
    }
    public ArrayList<String> findWordsFile(String filename) {
        ArrayList<String> temp = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (!(dictionary.find(word)) && !(temp.contains(word))) {
                    temp.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return temp;
    }

}
