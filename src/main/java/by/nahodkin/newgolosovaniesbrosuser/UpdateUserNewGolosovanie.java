package by.nahodkin.newgolosovaniesbrosuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateUserNewGolosovanie {
    @Autowired
    private UserService userService;

    public void update() {
        for (int i = 1; i <= 120; i++) {
            userService.updateUserStatus(i, "0"
                    , null, null, null
                    , null, null, null
                    , null, null, null);
        }
    }
}
