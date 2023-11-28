package bloodDonor.App.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class BloodDonor {

    @Id
    @GeneratedValue
    int id;
    private String fName;
    private String lName;
    private String email;
    private String contact;
    private String aContact;
    private String bloodGroup;
    private String country;
    private String state;
    private String city;
    public BloodDonor(String fName, String lName, String email, String contact, String aContact, String bloodGroup, String country, String state, String city) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.contact = contact;
        this.aContact = aContact;
        this.bloodGroup = bloodGroup;
        this.country = country;
        this.state = state;
        this.city = city;
    }
}
