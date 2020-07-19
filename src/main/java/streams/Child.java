package streams;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Child extends Parent {
    public Child() { count++; }
    public static void main(String [] args) {
        System.out.println("Count = " + getCount());
        Child obj = new Child();
        System.out.println("Count = " + getCount());
        String nyr = new String("jhgjhg");
        "hjghj".concat("jhgjhm");
        String jhgh = "jhgjhg";
        System.out.println(nyr == "jhgjhg");

        YearMonth ym1 = YearMonth.of(2015, Month.SEPTEMBER);
        YearMonth ym2 = YearMonth.of(2016, Month.FEBRUARY);
        System.out.println(ym1);
        System.out.println(ym2);

        System.out.println(ym2.compareTo(ym1));
        System.out.println(ym1.until(ym2, ChronoUnit.MONTHS));
        System.out.println(ym2.until(ym1, ChronoUnit.MONTHS));
        System.out.println(ym1.minus(Period.ofMonths(4)).getMonthValue());

        int i = 0;
        int f = i >> 4;
        System.out.println(f);

        Supplier<String> ij= () -> "Car";
        Consumer<String> c = x -> System.out.print(x.toLowerCase());
        Consumer<String> d = x -> System.out.print(x.toUpperCase());
        c.andThen(d).accept(ij.get());
        System.out.println();


        System.out.println(String.format("Local time: %1$tB", Calendar.getInstance()));
        System.out.println(String.format("Local time: %tT", Calendar.getInstance()));
//        System.out.println(String.format("Local time: %tT", Calendar.getInstance().toString()));;
        System.out.println(String.format("Local time: %tH:%tM:%tS", LocalTime.now(),
                LocalTime.now(),LocalTime.now()));

        System.out.println(String.format("Local time: %tT", LocalTime.now()));

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(new FileWriter("tt"));
            inputStream = new BufferedReader(new FileReader("tt"));
            Stream.of("RED","GREEN","BLUE").forEach(outputStream::println);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Boolean jbksdfj = true;
        System.out.println(Boolean.toString(jbksdfj));
        System.out.println(Boolean.parseBoolean("true"));

        Predicate<String> lengther = (s) -> s.length() < 2;
        Predicate<String> equalizer = Predicate.isEqual("car");
        Function<Boolean,String> booleaner = g -> Boolean.toString(g);
        Function<String,Boolean> stringer  = s -> Boolean.parseBoolean(s);
        System.out.println(lengther.negate().or(equalizer).test("CAR"));

        Locale locale = new Locale("USA") ;
        System.out.println("Country: " + locale.getCountry());
    }

}