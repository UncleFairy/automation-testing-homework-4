package dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.Arrays;

@XStreamAlias("ValCurs")
public class ValCurs {
    @XStreamAsAttribute
    private String name;

    @XStreamAsAttribute
    private String Date;

    @XStreamImplicit
    private Valute[] Valute;

    public ValCurs() {
    }

    public ValCurs(String name, String date, dto.Valute[] valute) {
        this.name = name;
        Date = date;
        Valute = valute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public dto.Valute[] getValute() {
        return Valute;
    }

    public void setValute(dto.Valute[] valute) {
        Valute = valute;
    }
}