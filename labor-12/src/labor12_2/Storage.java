package labor12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Storage {
    private HashMap<Integer,Product> products;

    public Storage(String fileName){

        try(Scanner scanner = new Scanner( new File(fileName))){
            products = new HashMap<>();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] items=line.split(" ");
                products.put(new Product(
                        Integer.parseInt(items[0].trim()),
                        items[1].trim(),
                        Integer.parseInt(items[2].trim()),
                        Integer.parseInt(items[3].trim())
                ));
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }

    }



    public int update(String fileName){
        int counter=0;
        try(Scanner scanner= new Scanner(new File(fileName))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] items = line.split(" ");
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found: "+ e.getMessage());
        }
        return counter;
    }


}

