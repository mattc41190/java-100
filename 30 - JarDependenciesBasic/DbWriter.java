package simpledb;

import java.io.PrintWriter;
import java.io.IOException;

public class DbWriter {
    public void writeDbToFile(String stringData){
        try{
            PrintWriter writer = new PrintWriter("db.json", "UTF-8");
            writer.println(stringData);
            writer.close();
        } catch (IOException e) {
           System.out.println(e);
        }
    }
}
