package org.example;

import java.util.Scanner;

public class PasswordManager {
    public static void addPassword(Scanner scanner) throws Exception {
        System.out.print("Serviço: ");
        String servico = scanner.nextLine();
        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        String encrypted = CryptoUtils.encrypt(senha);
        System.out.println("🔒 Senha criptografada e salva com sucesso:");
        System.out.println("Serviço: " + servico + ", Usuário: " + usuario + ", Senha: " + encrypted);
        // Aqui você pode salvar isso num arquivo local ou banco
    }
}
