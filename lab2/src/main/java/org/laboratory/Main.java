package org.laboratory;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.File;

public class Main
{
    public static void main(String[] args) {
        Sportsman Vova = new Sportsman.Builder()
                .SetAge(20).SetFirstname("Vova")
                .SetLastname("Mukutyk")
                .SetHeight(180)
                .SetSport("basketball")
                .SetQualification("first degree")
                .SetWeight(70).build();

        Sportsman Max = new Sportsman.Builder()
                .SetAge(20).SetFirstname("max")
                .SetLastname("Mukutyk").
                SetHeight(180)
                .SetSport("basketball")
                .SetQualification("first degree")
                .SetWeight(70).build();

        Sportsman Vadim = new Sportsman.Builder()
                .SetAge(21)
                .SetFirstname("Vadim")
                .SetLastname("Zuganash")
                .SetHeight(170)
                .SetWeight(67)
                .SetSport("football")
                .SetQualification("KMS")
                .build();

        SerializeTXT srzTxt = new SerializeTXT();
        SerializeJSON srzJson = new SerializeJSON();
        SerializeXML srzXml = new SerializeXML();
        File fTxt = new File("Sportsman.txt");
        File fJson = new File("Sportsman.json");
        File fXml = new File("Sportsman.xml");

        try
        {
            srzTxt.serializer(Vova, fTxt);
            srzJson.serializer(Max, fJson);
            srzXml.serializer(Vadim, fXml);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        Sportsman MaxTxt = new Sportsman();
        Sportsman VovaJson = new Sportsman();
        Sportsman VadimXml = new Sportsman();

        try
        {

            MaxTxt = srzTxt.deserializer(fTxt);
            VovaJson = srzJson.deserializer(fJson);
            VadimXml = srzXml.deserializer(fXml);
        } catch (Exception e)
        {

            System.out.println(e.getMessage());
        }

        System.out.println(MaxTxt);
        System.out.println(VovaJson);
        System.out.println(VadimXml);


    }
}
