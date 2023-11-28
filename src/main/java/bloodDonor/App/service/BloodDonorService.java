package bloodDonor.App.service;

import bloodDonor.App.entity.BloodDonor;
import bloodDonor.App.repository.BloodDonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BloodDonorService {
    @Autowired
    private BloodDonorRepository bloodDonorRepository;

    @PostConstruct
    public void initDb() {
        List<BloodDonor> users = new ArrayList<>();
        users.add(new BloodDonor("Vivek", "Narayan", "ram@gmail.com","1234567890","NA","B+","India", "Madhya Pradesh", "Jabalpur"));
        users.add(new BloodDonor("Ghanshyam", "Ram", "shyam@gmail.com","1234567891","NA","B+","India", "Goa", "City"));
        bloodDonorRepository.saveAll(users);
    }
    public BloodDonor addUser(BloodDonor bloodDonor) {

        return bloodDonorRepository.save(bloodDonor);
    }

    public Iterable<BloodDonor> getUsers(){
        return bloodDonorRepository.findAll();
    }

    public List<BloodDonor> getUserByEmail(String email){
        return bloodDonorRepository.findByEmail(email);
    }

    public List<BloodDonor> getUserBYBgNdState(String bloodGroup,String state)
    {
        return bloodDonorRepository.findByBloodGroupAndState(bloodGroup, state);

    }

    public List<BloodDonor> getUserByBg(String bloodGroup){
        return bloodDonorRepository.findByBloodGroup(bloodGroup);
    }
}