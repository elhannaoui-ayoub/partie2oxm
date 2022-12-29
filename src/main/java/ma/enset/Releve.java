package ma.enset;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;
@XmlRootElement

public class Releve {

    private long rib;
    private Date dateReleve ;
    private double solde;

    public Operations ops;

    public Releve() {

    }

    public Releve(long rib, Date dateReleve, double solde) {

        this.rib = rib;
        this.dateReleve = dateReleve;
        this.solde = solde;
        this.ops=new Operations(new Date(2018,11,10),new Date());
    }


    public long getRib() {
        return rib;
    }
    public void setRib(long rib) {
        this.rib = rib;
    }
    public Date getDateReleve() {
        return dateReleve;
    }
    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }


}