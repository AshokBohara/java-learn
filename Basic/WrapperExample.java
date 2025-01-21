// example of wrapper class in java ..
public class WrapperExample
 {
    public static void main(String[] args)
     {
        Integer num = 10;

        int value = num;

        String str = Integer.toString(num);
        int parsedValue = Integer.parseInt("25");

        System.out.println("Value: " + value);
        System.out.println("Parsed Value: " + parsedValue);
    }
}
