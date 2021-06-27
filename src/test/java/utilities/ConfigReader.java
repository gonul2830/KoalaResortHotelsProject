package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {
        String path="configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties= new Properties();

            //Bu class calıstıgında ilk olarak static block calısacak
            // Ve birtek islem yapacak o da properties uzantılı dosyaya git ve onu load yap
            // ve fileStream ile oku.

            //fileInpurStream objesi calısacak ve okudugu bilgileri
            //properties objesine yükleyecek.


            properties.load(fileInputStream);

            fileInputStream.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperty (String key){
        //  String value = properties.getProperty(key);
        //return value;

        return properties.getProperty(key);
    }

}
