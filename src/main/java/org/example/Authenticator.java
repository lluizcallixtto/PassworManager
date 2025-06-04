package org.example;

import org.mindrot.jbcrypt.BCrypt;
import java.util.Scanner;

public class Authenticator {
    private static final String MASTER_HASH = "$2a$12$6WZ9CJ5K/1WMWuIOvvBXB.xWBHbu5dM7qxtCjoUbEO.6wIYzpOOca"; // hash da senha "123456"

    public static boolean login(Scanner scanner) {
        System.out.print("Digite a senha-mestra: ");
        String senha = scanner.nextLine();

        return BCrypt.checkpw(senha, MASTER_HASH);
    }
}
