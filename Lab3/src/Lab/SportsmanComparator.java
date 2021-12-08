package Lab;
import java.util.Comparator;
public class SportsmanComparator implements Comparator<Sportsman>
{
    @Override
    public int compare(Sportsman one, Sportsman two)
    {
        return one.compareTo(two);
    }
}
