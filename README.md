# 🔐 Gerenciador de Senhas Seguras — Projeto Java

Este projeto foi desenvolvido para demonstrar o uso de boas práticas em segurança da informação e programação Java. O sistema permite cadastrar senhas de diferentes serviços, criptografá-las, verificar vazamentos e gerar senhas fortes automaticamente.

---

## 🚀 Funcionalidades

- 📝 Cadastro de senhas com nome do serviço e usuário
- 🔐 Criptografia AES para armazenar senhas com segurança
- 🔏 Senha-mestra protegida com hash usando BCrypt
- ✅ Verificação se a senha já foi vazada em bancos de dados públicos
- 🧠 Geração automática de senhas seguras
- 📁 Armazenamento em memória (versão local)
- ⏳ Autenticação em dois fatores (em desenvolvimento)

---

## 🧪 Exemplo de uso

```bash
🔐 Bem-vindo ao Gerenciador de Senhas!
Digite a senha-mestra: ••••••••••

Menu:
1. Adicionar senha
2. Verificar vazamento
3. Gerar senha segura
4. Sair

Escolha: 1
Serviço: Email
Usuário: luiz.123
Senha: MinhaSenhaSegura!
🔒 Senha criptografada e salva com sucesso:
Serviço: Email, Usuário: luiz.123, Senha: q4Vd9vLq2V9HEyqzXWjWKw==
```

---

## 🧰 Tecnologias Utilizadas

- ☕ Java (JDK 17+)
- 📦 Maven (gerenciador de dependências)
- 🔐 jBCrypt (criptografia da senha-mestra)
- 🔏 javax.crypto (criptografia AES)
- 🌐 (Opcional) API HaveIBeenPwned (para verificação de vazamentos)

---

## ▶️ Como Executar

1. Instale o JDK 17 ou superior
2. Clone o projeto:

```bash
git clone https://github.com/seu-usuario/gerenciador-senhas-java.git
cd gerenciador-senhas-java
```

3. Compile e execute:

```bash
mvn clean install
java -cp target/classes org.example.Main
```

Ou abra com IntelliJ IDEA e execute a classe Main.java.

---

## ✅ Avaliação (Checklist)

- [x] Cadastro de senhas com criptografia AES
- [x] Autenticação com senha-mestra (bcrypt)
- [x] Verificação de senhas vazadas
- [x] Geração de senhas seguras
- [x] Código limpo, organizado e comentado
- [x] Projeto versionado no GitHub

---

## 📌 Observações

- O projeto pode ser estendido para armazenar dados em arquivos locais ou banco de dados.
- O uso da API haveibeenpwned é opcional, a versão atual usa uma base interna simulada.
- Commits fora do prazo podem invalidar a entrega conforme instrução do professor.

## 👨‍🎓 Desenvolvedor

Luiz Eduardo  
Aluno de Análise e Desenvolvimento de Sistemas — Universidade Tiradentes  
