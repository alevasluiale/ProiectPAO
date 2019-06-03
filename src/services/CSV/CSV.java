/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.CSV;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author marius
 */
public class CSV {
    public static String filePath ;
    public static void createCsv(String fileName,String[] header)
    {
        File emailsDir = new File(System.getProperty("user.dir") + File.separator + "GENERATED_CSV");
        emailsDir.mkdir();
        SimpleDateFormat pff = new SimpleDateFormat("yyyy_MM_dd");
        Calendar cal = Calendar.getInstance();
        filePath = System.getProperty("user.dir") + File.separator + "GENERATED_CSV" + File.separator  + fileName + ".csv";

        File file = new File(filePath);

        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // adding header to csv
            
            writer.writeNext(header);
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void writeDataLineByLine(String[]  line, String fileName)
    {
        // first create file object for file placed at location
        // specified by filepath
        filePath = System.getProperty("user.dir") + File.separator + "GENERATED_CSV" + File.separator  + fileName + ".csv";
        File file = new File(filePath);

        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file,true);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            writer.writeNext(line);

            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static List<String[]> readFromCsv(String fileName)
    {
        Reader reader = null;
        try {
            reader = Files.newBufferedReader(Paths.get(fileName));
        } catch (IOException ex) {
            Logger.getLogger(CSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        CSVReader csvReader = new CSVReader(reader);
        List<String[]>csvFile = new ArrayList<String[]>();
        String[] nextRecord;
        try {
            while( (nextRecord = csvReader.readNext()) != null) csvFile.add(nextRecord);
        } catch (IOException ex) {
            Logger.getLogger(CSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return csvFile;
        
    }
}
