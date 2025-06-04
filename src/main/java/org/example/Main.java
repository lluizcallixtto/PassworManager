package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("🔐 Bem-vindo ao Gerenciador de Senhas!");

        // Autenticação
        if (!Authenticator.login(scanner)) {
            System.out.println("❌ Autenticação falhou. Encerrando...");
            return;
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar senha");
            System.out.println("2. Verificar vazamento");
            System.out.println("3. Gerar senha segura");
            System.out.println("4. Sair");
            System.out.print("Escolha: ");
            int opt = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opt) {
                case 1:
                    PasswordManager.addPassword(scanner);
                    break;
                case 2:
                    BreachChecker.check(scanner);
                    break;
                case 3:
                    PasswordGenerator.generate();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}