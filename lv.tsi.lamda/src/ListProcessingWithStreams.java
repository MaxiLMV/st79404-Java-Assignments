import java.util.List;
import java.util.ArrayList;

public class ListProcessingWithStreams {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("a1");
        l.add("a2");
        l.add("a3");
        l.add("b3");
        l.add("b2");
        l.add("c1");
        l.add("c2");
        l.add("b1");
        System.out.println("");
        System.out.println("----First element of the list----");
        System.out.println(l.get(0));
        System.out.println("------Output using Uppercase-----");
        l.replaceAll(String::toUpperCase);
        l.forEach(System.out::println);
        l.replaceAll(String::toLowerCase);
        System.out.println("-----Elements starting with b----");
        l.stream().filter(x -> x.startsWith("b")).forEach(System.out::println);
        System.out.println("-----Elements starting with C----");
        l.replaceAll(String::toUpperCase);
        l.stream().sorted().filter(x -> x.startsWith("C")).forEach(System.out::println);
    }
}