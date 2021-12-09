package org.laboratory;
import java.io.File;
import java.io.*;
import java.io.IOException;

public class SerializeTXT
{
    public void serializer(Sportsman obj, File file) throws IOException
    {
        try(FileWriter fw = new FileWriter(file)){
            String str = "Firstname = " + obj.getFirstname() + ",Lastname = " + obj.getLastname()
                    + ",Height = " + obj.getHeight()
                    + ",Weight = " + obj.getWeight() + ",Age = " + obj.getAge()
                    + ",Sport = " + obj.getSport() + ",Qualification = " + obj.getQualification();
            fw.write(str);
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Sportsman deserializer(File file) throws IOException {
        try (BufferedReader fr = new BufferedReader(new FileReader(file))) {
            String[] fields = fr.readLine().split(",");

            Sportsman.Builder a = new Sportsman.Builder();
            a.SetFirstname(fields[0].split(" ")[2]);

            a.SetLastname(fields[1].split(" ")[2]);
            a.SetHeight(Integer.parseInt(fields[2].split(" ")[2]));
            a.SetWeight(Integer.parseInt(fields[3].split(" ")[2]));
            a.SetAge(Integer.parseInt(fields[4].split(" ")[2]));
            a.SetSport(fields[5].split(" ")[2]);
            a.SetQualification(fields[6].split(" ")[2]);

            return a.build();
        }
        catch (IOException e) {
            throw new RuntimeException("File is empty");
        }
    }
}
