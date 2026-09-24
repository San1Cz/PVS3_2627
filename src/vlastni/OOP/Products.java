package vlastni.OOP;

import fileworks.DataImport;

import java.util.ArrayList;

public class Products {
        public static void main(String[] args) {
            // načíst celý soubor a vypsat počet kusů na skladu
//        Product product = new Product("Chair", 400, 465);
//
//        System.out.println(product.getName() + ": "+ product.getAmount());
//        System.out.println(product.toString());
//        product.getCategory().toUpperCase();
//        product.getName();
//        product.name;
            String line;
            ArrayList<Product> products = new ArrayList<>();
            String[]parts;
            DataImport di = new DataImport("data/products.txt");
            while (di.hasNext()){
                line = di.readLine();
                parts = line.split(";");
                switch (parts.length){
                    case 4: new Product(parts[0],parts[1], Integer.parseInt(parts[2], (int) Double.parseDouble(parts[3])));
                        break;


                }

            }
            di.finishImport();


        }
    }
