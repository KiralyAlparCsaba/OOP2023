package oop.labor12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetDictionary implements IDictionary {

    private Set<String> words = new HashSet<>();
    private static HashSetDictionary instance;
    private HashSetDictionary(){
        words = new HashSet<>();
        try (Scanner scanner = new Scanner(new File(IDictionary.DICTIONARY_FILE))) {
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine();
                if (word.isEmpty()) {
                    continue;
                }
                words.add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static IDictionary newInstance(){
        if (instance == null) {
            instance = new HashSetDictionary();
        }
        return instance;
    }
    public int size(){
        return words.size();
    }
    public boolean add(String item){
        words.add(item);
        return true;
    }
    public boolean find(String target){
        for (String word : words){
            if(target.equals(word))
                return true;
        }
        return false;
    }
}
