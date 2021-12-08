package Lab;

public class main
{
    public  static void main(String[] args)
    {
        Sportsman Vova = new Sportsman.Builder().SetAge(20).SetFirstname("Vova").SetLastname("Mukutyk").
                SetHeight(180).SetSport("basketball").SetQualification("first degree").SetWeight(70).build();
        System.out.println(Vova.toString());

        Sportsman Max = new Sportsman.Builder().SetAge(20).SetFirstname("max").SetLastname("Mukutyk").
                SetHeight(180).SetSport("basketball").SetQualification("first degree").SetWeight(70).build();
        System.out.println(Vova.toString());

        BasketballPlayer Dima = new BasketballPlayer.Builder()
                .SetAge(21)
                .SetFirstname("Dmutro")
                .SetLastname("Kruvenko")
                .SetClub("Lakers")
                .SetHeight(200)
                .SetQualification("first degree")
                .SetJump(1.20f)
                .SetPosition("forward")
                .SetWeight(90)
                .SetSport("basketball")
                .SetShot(37)
                .SetSpeed(50)
                .build();

        //System.out.println(Dima.toString());
        System.out.println(Max.equals(Dima));
        //System.out.println(Vova.hashCode());
    }

}
