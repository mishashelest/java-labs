package Lab;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

public class SportsmanTeam extends Sportsman
{
    private String TeamName;
    private List<Sportsman> SportsmanList;
    public String getTeamName()
    {
        return TeamName;
    }

//    public  void SetTeamName (String TeamName)
//    {
//        this.TeamName = TeamName;
//    }


    public List<Sportsman> getSportsmanList()
    {
        return SportsmanList;
    }



    public static class Builder
    {
        private SportsmanTeam newSportsmanTeam;

        public Builder()
        {
            newSportsmanTeam = new SportsmanTeam();
        }

        public SportsmanTeam.Builder SetAge(int age)
        {
            newSportsmanTeam.age = age;
            return this;
        }

        public SportsmanTeam.Builder SetHeight(int height)
        {
            newSportsmanTeam.height = height;
            return this;
        }

        public SportsmanTeam.Builder SetList(List<Sportsman> list)
        {
            newSportsmanTeam.SportsmanList = list;
            return this;
        }

        public SportsmanTeam.Builder SetWeight(int weight)
        {
            newSportsmanTeam.weight = weight;
            return this;
        }

        public SportsmanTeam.Builder SetSport(String sport)
        {
            newSportsmanTeam.sport = sport;
            return  this;
        }

        public SportsmanTeam.Builder SetQualification(String qualification)
        {
            newSportsmanTeam.qualification = qualification;
            return this;
        }

        public SportsmanTeam.Builder SetLastname(String lastname)
        {
            newSportsmanTeam.lastname = lastname;
            return  this;
        }

        public SportsmanTeam.Builder SetFirstname(String firstname)
        {
            newSportsmanTeam.firstname = firstname;
            return this;
        }

        public SportsmanTeam.Builder SetTeamName(String teamname)
        {
            newSportsmanTeam.TeamName = teamname;
            return this;
        }

        public SportsmanTeam build()
        {
            return newSportsmanTeam;
        }

    }


    public List<Sportsman> SortSport()
    {
        SportsmanList.sort( new SportsmanComparator());
        return SportsmanList;
    }

    public List<Sportsman> SortSportStream()
    {
        return SportsmanList.stream().sorted(new SportsmanComparator()).toList();
    }

    public List<Sportsman> FilterHeight(int height)
    {
        List<Sportsman> plus = new ArrayList<>();
        for (var anm : SportsmanList)
        {
            if (anm.getHeight() >= height)
            {
                plus.add(anm);
            }
        }
        return plus;
    }

    public List<Sportsman> FilterHeightStream(double height)
    {
        return SportsmanList.stream().filter(a -> a.getHeight() >= height).toList();
    }


    public List<Sportsman> getSportsmanListOfAge(int age)
    {
        List<Sportsman> plus = new ArrayList<Sportsman>();
        for (var spt : SportsmanList)
        {
            if (spt.getAge() == age)
            {
                plus.add(spt);
            }
        }
        return plus;
    }

    public List<Sportsman>getSportsmanListOfAgeStream(int age)
    {
        return SportsmanList.stream().filter(a->a.age == age).toList();
    }


    @Override
    public String toString()
    {
//        return "Lastname\t" + lastname + "\t Firstname\t" + firstname + "\tAge\t" + age + "\tHeight\t" + height + "\tWeight\t" +
//                weight + "\tSport\t" + sport + "\tQualification\t" + qualification;
        return "Team {Name: " + TeamName  + "| Sportsman list: " + SportsmanList + "|}";
    }
}
