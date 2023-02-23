import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<String> supplier = () ->" Olá Mundo em espanhol!";
        String s = supplier.get();
        System.out.println("A String é: " + s);

        List<String> strings = new ArrayList<>(List.of("one", "two","tree","four","five"));
        strings.removeIf(string -> !string.startsWith("t"));
        strings.forEach(x -> System.out.println(x));

    }
}