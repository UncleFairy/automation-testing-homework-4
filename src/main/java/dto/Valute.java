package dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("Valute")
public class Valute {
    private String CharCode;

    private String Value;

    @XStreamAsAttribute
    private String ID;

    private String Nominal;

    private String NumCode;

    private String Name;

    public Valute() {
    }

    public Valute(String charCode, String value, String ID, String nominal, String numCode, String name) {
        this.CharCode = charCode;
        this.Value = value;
        this.ID = ID;
        this.Nominal = nominal;
        this.NumCode = numCode;
        this.Name = name;
    }

    public String getCharCode() {
        return CharCode;
    }

    public void setCharCode(String CharCode) {
        this.CharCode = CharCode;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNominal() {
        return Nominal;
    }

    public void setNominal(String Nominal) {
        this.Nominal = Nominal;
    }

    public String getNumCode() {
        return NumCode;
    }

    public void setNumCode(String NumCode) {
        this.NumCode = NumCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}
