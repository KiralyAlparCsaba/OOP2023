package Exercise2;

public interface IDictionary {

    String DICTIONARY_FILE="text_to_find.txt";
    int size();
    boolean add(String word);
    boolean find(String target);


}
