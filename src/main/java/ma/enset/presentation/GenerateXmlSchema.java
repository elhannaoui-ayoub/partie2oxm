package ma.enset.presentation;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.SchemaOutputResolver;
import ma.enset.Releve;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class GenerateXmlSchema {
    public static void main(String[] args) throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        jaxbContext.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
               File file =new File("releve.xsd");
                StreamResult streamResult = new StreamResult(file);
                return streamResult;
            }
        });
    }
}
