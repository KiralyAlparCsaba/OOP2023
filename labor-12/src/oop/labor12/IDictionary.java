package oop.labor12;

public interface IDictionary {

    String DICTIONARY_FILE="bible.txt";
    int size();
    boolean add(String word);
    boolean find(String target);


}
