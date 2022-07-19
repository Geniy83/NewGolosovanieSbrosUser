package by.nahodkin.newgolosovaniesbrosuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void updateUserStatus(Integer id, String status
            , String q11, String q12, String q13
            , String q21, String q22, String q23
            , String q31, String q32, String q33) {
        userRepository.updateStatusByUser(id, status
                , q11, q12, q13
                , q21, q22, q23
                , q31, q32, q33);
    }
}
