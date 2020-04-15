package serialization;

import com.thoughtworks.xstream.XStream;
import dto.ValCurs;
import dto.Valute;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class XML {
    public static void main(String[] args) {
        XStream xstream = new XStream();
        xstream.processAnnotations(ValCurs.class);
        xstream.processAnnotations(Valute.class);

        Valute val1 = new Valute("EUR", "20.46", "47", "1", "978", "Euro");
        Valute val2 = new Valute("EUR", "20.35", "48", "1", "977", "Euro");
        Valute val3 = new Valute("EUR", "20.78", "49", "1", "976", "Euro");

        Valute[] vArray = new Valute[3];
        vArray[0] = val1;
        vArray[1] = val2;
        vArray[2] = val3;

        ValCurs curs = new ValCurs("Official exchange rate", "13.02.2018", vArray);

        String stringCurs = xstream.toXML(curs);
        writeUsingFileWriter(stringCurs);

        ValCurs xml = (ValCurs) xstream.fromXML(new File("./FileWriterXML.txt"));
        //System.out.println(xstream.toXML(xml));
    }

    private static void writeUsingFileWriter(String data) {
        File file = new File("./FileWriterXML.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


