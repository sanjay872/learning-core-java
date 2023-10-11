import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Institute
{
    String name;

    List<String> locations;

    public Institute(String name, List<String> locations)
    {
        this.name = name;
        this.locations = locations;
    }

    public String getName()
    {
        return name;
    }

    public List<String> getLocations()
    {
        return locations;
    }
}

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Institute> instituteList = new ArrayList<>();

        instituteList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
        instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
        instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore")));

        // Map converts stream into values
        List<String> instituteNames=instituteList.stream().map(Institute::getName).collect(Collectors.toList());
        System.out.println(instituteNames);

        // flat map converts multiple stream values into single stream values
        Set<String> locations=instituteList.stream().flatMap((ins)->ins.getLocations().stream()).collect(Collectors.toSet());
        System.out.println(locations);
    }
}
