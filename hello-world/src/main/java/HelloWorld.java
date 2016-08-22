public class HelloWorld {

    public static String hello(String input) {
        if (input == "" || input == null){
            return "Hello, World!";
        }
        return "Hello, " + input + "!";
    }
}
