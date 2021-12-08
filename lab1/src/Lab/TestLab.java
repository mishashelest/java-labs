package Lab;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class TestLab
{
    @DataProvider
    public Object[][] equalsProvider()
    {
        Sportsman man = new Sportsman.Builder()
                .SetAge(30)
                .SetSport("Box")
                .SetFirstname("Viktor")
                .SetLastname("Shevchenko")
                .SetHeight(170)
                .SetWeight(65)
                .SetQualification("KMS")
                .build();
        Sportsman man1 = new Sportsman.Builder()
                .SetFirstname("Volodumur ")
                .SetLastname("Petrenko")
                .SetSport("Basketball")
                .SetAge(22)
                .SetHeight(190)
                .SetWeight(97)
                .SetQualification("MS")
                .build();
        Sportsman man2 =  new Sportsman.Builder()
            .SetAge(30)
            .SetSport("Box")
            .SetFirstname("Viktor")
            .SetLastname("Shevchenko")
            .SetHeight(170)
            .SetWeight(65)
            .SetQualification("KMS")
            .build();

        return new Object[][]{ {man , man1 , false} , {man , man2 , true} };

    }

    @Test(dataProvider = "equalsProvider")
    public void testEquals(Sportsman m1,Sportsman m2, boolean res )
    {
        assertEquals((m1.equals(m2)),res);
    }

    @DataProvider
    public Object[][] equalsProviderA()
    {
        BasketballPlayer man = new BasketballPlayer.Builder()
                .SetLastname("Sidorenko")
                .SetFirstname("Max")
                .SetSport("Basketball")
                .SetClub("Lakers")
                .SetAge(27)
                .SetPosition("Center")
                .SetSpeed(20)
                .SetShot(37)
                .SetJump(91)
                .SetWeight(120)
                .SetHeight(210)
                .SetQualification("secon degree")
                .build();

        BasketballPlayer man1 = new BasketballPlayer.Builder()
                .SetLastname("melenko")
                .SetFirstname("Oleg")
                .SetSport("Basketball")
                .SetClub("Lakers")
                .SetAge(27)
                .SetPosition("Point guard")
                .SetSpeed(80)
                .SetShot(67)
                .SetJump(60)
                .SetWeight(90)
                .SetHeight(195)
                .SetQualification("secon degree")
                .build();


        return new Object[][]{ {man , man1 , false}  };
    }

    @Test(dataProvider = "equalsProviderA")
    public void testEquals(BasketballPlayer m1,BasketballPlayer m2, boolean res )
    {
        assertEquals((m1.equals(m2)),res);
    }

}
