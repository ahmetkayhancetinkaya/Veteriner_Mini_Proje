package veteriner.entities.concretes;

import com.sun.istack.NotNull;
import org.hibernate.annotations.GenerationTime;
import veteriner.entities.abstracts.Entitiy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

import static org.hibernate.annotations.GenerationTime.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Animals implements Entitiy {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int animal_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String breed ;

    @Column(nullable = false)
    private String age;


    private String info;



}
