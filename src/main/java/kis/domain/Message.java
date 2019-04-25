package kis.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//антоация дает знать спрингу не только кусок кода, а сущность которую необходимо сохраять в базе данных
@Entity
public class Message {
    //поле id будет индитификатором, для того чтобы различать дв езаписи в одной таблице
    @Id
    //фраймвор сам должен совместно с БД в каком виде и в каком порядке будут генерироваться эти индитификаторы
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String text1;
    private String text2;

    public Message() {
    }

    public Message(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}
