import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DB db = new DB();

        Sportsman[] a = new Sportsman[]
        {
            new Sportsman.Builder()
                    .SetAge(20).SetFirstname("Vova")
                    .SetLastname("Mukutyk")
                    .SetHeight(180)
                    .SetSport("Box")
                    .SetQualification("first degree")
                    .SetWeight(70)
                    .build(),

            new Sportsman.Builder()
                    .SetAge(20).SetFirstname("max")
                    .SetLastname("Mukutyk").
                    SetHeight(190)
                    .SetSport("Basketball")
                    .SetQualification("first degree")
                    .SetWeight(70)
                    .build(),

            new Sportsman.Builder()
                    .SetAge(21)
                    .SetFirstname("Vadim")
                    .SetLastname("Zuganash")
                    .SetHeight(170)
                    .SetWeight(67)
                    .SetSport("Football")
                    .SetQualification("KMS")
                    .build()
        };
        db.executeSQL("CREATE TABLE Sportsman (Id INT PRIMARY KEY AUTO_INCREMENT,  Age INT, Firstname NVARCHAR(30),Lastname NVARCHAR(30),  Height INT, Sport NVARCHAR(30));");
        for (var anm : a) {
            db.executeSQL("INSERT INTO Sportsman (Age, Firstname, Lastname, Height, Sport) VALUES "
                    + String.format("(%d, '%s', '%s', %d, '%s');", anm.getAge(), anm.getFirstname(), anm.getLastname(),
                    anm.getHeight(), anm.getSport()));
        }

        try {
            ResultSet res = db.executeSQLWithResult("SELECT * FROM Sportsman");
            System.out.println("Animals : ");
            while (res.next()) {
                System.out.println(res.getString("Id") + ", "
                        + res.getString("Firstname") + ", "
                        +res.getString("Lastname") + ", "
                        + res.getString("Age") + ", "
                        + res.getString("Sport") + ", ");
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    }

