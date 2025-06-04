package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Scanner;

public class BreachChecker {
    public static void check(Scanner scanner) throws Exception {
        System.out.print("Senha para verificar: ");
        String senha = scanner.nextLine();

        String sha1 = sha1(senha).toUpperCase();
        String prefix = sha1.substring(0, 5);
        String suffix = sha1.substring(5);

        URL url = new URL("https://api.pwnedpasswords.com/range/" + prefix);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        boolean found = false;

        while ((inputLine = in.readLine()) != null) {
            if (inputLine.startsWith(suffix)) {
                found = true;
                break;
            }
        }
        in.close();

        if (found) {
            System.out.println("⚠️ Sua senha foi encontrada em vazamentos!");
        } else {
            System.out.println("✅ Sua senha não foi encontrada.");
        }
    }

    private static String sha1(String input) throws Exception {
        MessageDigest mDigest = MessageDigest.getInstance("SHA1");
        byte[] result = mDigest.digest(input.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte b : result) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
