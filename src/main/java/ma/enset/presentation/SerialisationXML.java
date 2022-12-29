package ma.enset.presentation;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import ma.enset.Operation;
import ma.enset.Releve;
import ma.enset.t_op;

import java.io.File;
import java.util.Date;

public class SerialisationXML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Releve releve = new Releve(1376666,new Date(),5600);
        releve.ops.ajouterOperation(new Operation(t_op.CREDIT,new Date(2019,10,11),4500,"some money!"));
        releve.ops.ajouterOperation(new Operation(t_op.DEBIT,new Date(2020,2,10),7500,"some money!"));
        releve.ops.ajouterOperation(new Operation(t_op.CREDIT,new Date(2021,5,3),8600,"some money!"));

        Marshaller marshaller =jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve,new File("releve.xml"));
    }
}
