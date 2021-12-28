package veteriner.entities.concretes;

import com.sun.istack.NotNull;
import veteriner.entities.abstracts.Entitiy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Owners implements Entitiy {


    @GeneratedValue(strategy = GenerationType.AUTO)
    private int owner_id;

    @Id
    @Column(unique = true, nullable = false)
    private String identity_number;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private String telephoneNumber;

    @Column(nullable = false)
    private String e_mail;

    @OneToMany(targetEntity = Animals.class,cascade =  CascadeType.ALL)
    @JoinColumn (name = "owner_identity_number", referencedColumnName = "identity_number")
    private List<Animals> animals;


}
