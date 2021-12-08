package Lab;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public class main
{
    public  static void main(String[] args)
    {
        List<Sportsman> mans =  new ArrayList<Sportsman>();
        Sportsman Vova = new Sportsman.Builder()
                .SetAge(20).SetFirstname("Vova")
                .SetLastname("Mukutyk")
                .SetHeight(180)
                .SetSport("Box")
                .SetQualification("first degree")
                .SetWeight(70).build();
        System.out.println(Vova.toString());

        Sportsman Max = new Sportsman.Builder()
                .SetAge(20).SetFirstname("max")
                .SetLastname("Mukutyk").
                SetHeight(190)
                .SetSport("Basketball")
                .SetQualification("first degree")
                .SetWeight(70).build();
        System.out.println(Vova.toString());

        Sportsman Vadim = new Sportsman.Builder()
                .SetAge(21)
                .SetFirstname("Vadim")
                .SetLastname("Zuganash")
                .SetHeight(170)
                .SetWeight(67)
                .SetSport("Football")
                .SetQualification("KMS")
                .build();

        mans.add(Vova);
        mans.add(Vadim);
        mans.add(Max);

        SportsmanTeam z1 = new SportsmanTeam.Builder().SetList(mans).SetTeamName("abc").build();

        String sorted = new String();
        sorted = "";
        for (var an : z1. SortSport()) {
            sorted += an.toString() + "\n";
        }
        System.out.println(sorted + "\n");

        String sortedStream = new String();
        sortedStream = "";
        for (var an : z1.SortSportStream()) {
            sortedStream += an.toString() + "\n";
        }
        System.out.println(sortedStream + "\n");

        String filtered = new String();
        filtered = "";
        for (var an : z1.FilterHeight(185)) {
            filtered += an.toString() + "\n";
        }
        System.out.println(filtered + "\n");

        String filteredStream = new String();
        filteredStream = "";
        for (var an : z1.FilterHeightStream(180)) {
            filteredStream += an.toString() + "\n";
        }
        System.out.println(filteredStream + "\n");

        String find = new String();
        find = "";
        for (var an : z1.getSportsmanListOfAge(18)) {
            find += an.toString() + "\n";
        }
        System.out.println(find + "\n");

        String findStream = new String();
        findStream = "";
        for (var an : z1.getSportsmanListOfAgeStream(17)) {
            findStream += an.toString() + "\n";
        }
        System.out.println(findStream + "\n");
    }

}
