package ma.enset;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.util.Date;
@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {
    private t_op type;
    private Date date;
    private double montant;
    private String description;

    public Operation() {

    }

    public Operation(t_op type, Date date, double montant, String description) {
        this.type = type;
        this.date = date;
        this.montant = montant;
        this.description = description;
    }
    public t_op getType() {
        return type;
    }
    public void setType(t_op type) {
        this.type = type;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "type=" + type +
                ", date='" + date + '\'' +
                ", montant=" + montant +
                ", description='" + description + '\'' +
                '}';
    }
}
