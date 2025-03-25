package ex1;

import java.util.Random;

public class Generator {
    public String generateEmpId(String empFirstName) {
        int random = new Random().nextInt(1000);
         String empId= empFirstName.substring(0, 1) + random;
        return empId;
    }
}
