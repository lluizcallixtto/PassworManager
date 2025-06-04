package org.example;

import java.security.SecureRandom;

public class PasswordGenerator {
    public static void generate() {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#$%&*";

        String all = upper + lower + nums + symbols;
        SecureRandom random = new SecureRandom();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            int idx = random.nextInt(all.length());
            sb.append(all.charAt(idx));
        }

        System.out.println("🔐 Senha sugerida: " + sb.toString());
    }
}
