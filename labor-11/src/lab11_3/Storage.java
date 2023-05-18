package lab11_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Storage {
    private List<Product> products;

    public Storage(String fileName){

        try(Scanner scanner = new Scanner( new File(fileName))){
            products = new ArrayList<>();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] items=line.split(" ");
                products.add(new Product(Integer.parseInt(items[0].trim()),items[1].trim(),
                        Integer.parseInt(items[2].trim()),Integer.parseInt(items[3].trim())));
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }

    }

    public Product findProduct(int id){
        Product p = new Product(id,null,0,0);
        int x = Collections.binarySearch(products,p);
        if(x>=0)
            return products.get(x);
        return null;
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
                Product product =findProduct(Integer.parseInt(items[0].trim()));
                if(product!=null){
                    product.increaseAmount(Integer.parseInt(items[1].trim()));
                    counter++;
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found: "+ e.getMessage());
        }
        return counter;
    }

    public void sort(){
        if(!products.isEmpty())
            Collections.sort(products);
    }
}

