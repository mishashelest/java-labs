package org.laboratory;

import com.fasterxml.jackson.dataformat.xml.*;

import java.io.File;
import java.io.IOException;

public class SerializeXML
{
    XmlMapper mapper;

    public SerializeXML()
    {
        mapper = new XmlMapper();
    }

    public void serializer(Sportsman obj, File file) throws IOException
    {
        try
        {
            mapper.writeValue(file, obj);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Sportsman  deserializer(File file) throws RuntimeException
    {
        try
        {
            return mapper.readValue(file, Sportsman.class);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }
}
