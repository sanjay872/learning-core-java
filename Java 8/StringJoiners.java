import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoiners {
    public static void main(String[] args) {

        //using StringJoiner
        StringJoiner stringJoiner=new StringJoiner("|","[","]");
        stringJoiner.add("Meta");
        stringJoiner.add("Google");
        stringJoiner.add("IBM");
        stringJoiner.add("Youtube");
        System.out.println(stringJoiner);

        //using String.join()
        String[] companies=new String[]{"Meta","Google","IBM","Youtube"};
        String combinedCompanies=String.join("|",companies);
        System.out.println(combinedCompanies);

        // using Collectors.joining()
        String combinedCompaniesByCollectors= Arrays.stream(companies).collect(Collectors.joining("|","[","]"));
        System.out.println(combinedCompaniesByCollectors);
    }
}
