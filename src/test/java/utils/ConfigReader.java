package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties ;
    static {
        try{
            String filePath = "configuration.properties" ;
            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println("The specified file could not be found.");
        } catch (IOException e) {
            System.out.println("An error occurred while loading data from the properties file.");
        }
    }

    public static String getProperty(String key){
        return  properties.getProperty(key) ;
    }




}