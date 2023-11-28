package bloodDonor.App.repository;


import bloodDonor.App.entity.BloodDonor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BloodDonorRepository extends JpaRepository<BloodDonor,Integer> {
    public List<BloodDonor> findByEmail(String email);
    public List<BloodDonor> findByBloodGroup(String bloodGroup);
    public List<BloodDonor> findByBloodGroupAndState(String bloodGroup,String state);
}