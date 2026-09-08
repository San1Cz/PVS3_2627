package Vlastní.basics;

import fileworks.DataExport;
import fileworks.DataImport;

import java.io.IOException;

public class ParseFile {
    public static void main(String[] args) throws IOException {
        String path = "data/countries.txt";
        DataImport di = new DataImport(path);
       // di.printFile();
        //System.out.println(di.readLine()); //výpis jednoho řádku
//TODO: Vypsat informace jednoho řádku

        /*String line = di.readLine();
        String[]info = line.split(";");
        String name = info[0];
        String continent = info[1];
        long population = Long.parseLong(info[2]);
        double avgAge = Double.parseDouble(info[3]);
        System.out.println(name + " " + continent + " " + population + " " + avgAge);



        //TODO: Vypsat celý obsah souboru bez printfile
        di.reinitializeRead();
        while (di.hasNext()){
            System.out.println(di.readLine());
        }*/
    Country czechia = new Country("Czech Republic","Europe",10800000,85.0);
        System.out.println(czechia);
        DataExport de = new DataExport("output.txt");

        // TODO: Vypsat všechny řádky jako objekty (třídy Country)
        //1. přečíst soubor
        //1.1 přečíst řádek
        while (di.hasNext()){
            String line = di.readLine();
            String[]tokens = line.split(";");
            String name = tokens[0];
            String continent = tokens[1];
            long population = Long.parseLong(tokens[2]);
            double avgAge = Double.parseDouble(tokens[3]);
            Country oneCountry = new Country(name, continent,population,avgAge);
            System.out.println(oneCountry);
            if ((oneCountry.continent).equals("Europe")){
                de.writeLine(oneCountry.toString());
            }
        }


        di.finishImport();
        de.finishExport();

    }

}
