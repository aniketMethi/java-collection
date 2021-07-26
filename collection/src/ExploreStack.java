import java.util.*;

public class ExploreStack
{

    public static void main(String[] args) {

        Stack<String> variables = new Stack<>();
        variables.push("a");
        variables.push("b");
        variables.push("c");
        variables.push("d");
        variables.push("e");

        System.out.println(variables);
        System.out.println(variables.peek());

        variables.pop();

        System.out.println(variables);
        System.out.println(variables.peek());

    }



}
