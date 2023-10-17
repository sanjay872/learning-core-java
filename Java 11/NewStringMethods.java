import java.lang.invoke.MethodHandles;
import java.util.List;

public class NewStringMethods {
    public static void main(String[] args) {

        /* *************************************JAVA 8**************************************** */

        //join(delimiter,characters)
        String languages=String.join("_","Java","C","C++","Python");
        //System.out.println(languages);
        List<String> listOfLanguages=List.of("Java","Python","C","C++");
        //System.out.println(String.join(",",listOfLanguages));

        /* *************************************JAVA 9**************************************** */

        //char - returns streams of ascii values
        //"Character".chars().forEach(System.out::println);

        //codePoints - returns streams of unicode values
        //"Characters".codePoints().forEach(System.out::println);

        /* *************************************JAVA 10**************************************** */
        //No New Methods

        /* *************************************JAVA 11**************************************** */

        //isBlank
        //System.out.println("".isBlank());

        //lines - returns number of lines
        //System.out.println("\n\n".lines().count());

        //repeat - to repeat a string n times
        //System.out.println("abc".repeat(2));

        //strip - to remove leading and trailing white spaces
        //System.out.println(" acs ".strip());

        //stripLeading - remove leading white spaces
        //System.out.println(" 123 ".stripLeading());

        //stripTrailing - remove trailing white spaces
        //System.out.println(" 123 ".stripTrailing());

        /* *************************************JAVA 12**************************************** */

        //indent
        //System.out.println("123\nasd\nqwe".indent(2));

        //transform
        String output="string".transform(String::toUpperCase);
        //System.out.println(output);

        //describeConstable() -  containing nominal descriptor for the given string, which is the string itself.
        //System.out.println("123".describeConstable().get());

        //resolveConstantDesc() - This method resolves the given string as ConstantDesc and returns the string itself.
        //System.out.println("Java".resolveConstantDesc(MethodHandles.lookup()));

        /* *************************************JAVA 13 and Java 14**************************************** */

        //No New Methods

        /* *************************************JAVA 15**************************************** */

        //formatted
        System.out.printf("1) %s 2) %s 3) %s %n", "Java", "Python", "JavaScript");

        //strip intent
        System.out.println("   123".stripIndent());

        //translateEscapes() - This method removes indentation of the given string at the beginning and at the end of every line.
        String str = "Tab \t Next Line \n Space \s Single Quote \' Double Quote \" ";
        System.out.println(str.translateEscapes());

        /* *************************************JAVA 16 and JAVA 17**************************************** */

        //No New Methods
    }
}
