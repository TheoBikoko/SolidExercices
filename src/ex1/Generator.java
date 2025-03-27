package ex1;

import java.util.Random;

class Generator {
    static String generateEmpId(String empFirstName) {
        int random = new Random().nextInt(1000);
        return empFirstName.substring(0, 1) + random;
    }
}
