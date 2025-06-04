package org.example;

import org.mindrot.jbcrypt.BCrypt;

public class HashGenerator {
    public static void main(String[] args) {
        String senha = "1S3g#LuizM@sterPwd!";
        String hash = BCrypt.hashpw(senha, BCrypt.gensalt(12));
        System.out.println("Hash gerado: " + hash);
    }
}
