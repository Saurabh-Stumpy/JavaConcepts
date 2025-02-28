import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> num = List.of(1,2,3,4,5,6,7);

        Stream<Integer> str =num.stream().filter(n->n%2==0);

        List<Integer> even = str.collect(Collectors.toList());
 
        System.out.println(even);

    }
}