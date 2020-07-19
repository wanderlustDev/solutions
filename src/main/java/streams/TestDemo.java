package streams;

import javax.swing.text.html.Option;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Optional;

public class TestDemo{
    int value;
    public TestDemo(int value) {
        value = value;
    }
    public static void main(String[] args) throws IOException {
        SuggestionBox officeSuggestionBox = new SuggestionBox() {
            public void onSelection() {
                //Do action when item has been selected.
                System.out.println("Office selected.");
            }

            public void onRemoveSelection() {
                //Do action when item selection has been removed.
                onSelection();
                System.out.println("Office removed.");
            }
        };
        officeSuggestionBox.onRemoveSelection();
        HashMap<TestDemo, String> mapp = new HashMap();
        mapp.put(new TestDemo(5), "jj");

        System.out.println(mapp.get(new TestDemo(5)));

        Long l = new Long(1234);
        Long l1 = l;
        System.out.println(l1 == l);
        l++;
        System.out.println(l1 == l);
        Child.main(args);

        byte c1[] = {10, 20, 30, 40, 50};
        byte c2[] = {60, 70, 80, 90};
        ByteArrayOutputStream b1 = new ByteArrayOutputStream();
        ByteArrayOutputStream b2 = new ByteArrayOutputStream(10);
        b2.write(100);
        System.out.println("Out 1 : " + b2.size());
        b2.write(c1, 0, c2.length);
        System.out.println("Out 2 : " + b2.size());
        byte b[] = b2.toByteArray();
        System.out.println("Out 3 : " + b.length);
        b2.flush();
        System.out.println("Out 4 : " + b2.size());
        b2.reset();
        System.out.println("Out 5 : " + b2.size());
        b1.writeTo(b2);
        System.out.println("Out 6 : " + b1.size());

        BufferedReader reader = new BufferedReader(new FileReader("initconfig.txt"));
        //reader.lines().f

    }
}
