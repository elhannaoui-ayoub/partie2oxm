package ma.enset.presentation;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import ma.enset.Operation;
import ma.enset.Releve;

import java.io.File;

public class DeserialisationXML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);



        Unmarshaller unmarshaller =jaxbContext.createUnmarshaller();

        Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
        System.out.println("*****************");
        for(Operation o: releve.ops.getOperations()){
            System.out.println(o.toString());
            System.out.println("--------------");
        }
    }
}
