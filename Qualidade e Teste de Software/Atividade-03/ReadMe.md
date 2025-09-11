# 🧪 Testes Unitários com JUnit 5

Este projeto é um exemplo simples de **testes unitários em Java** usando **JUnit 5**, criado como exercício de introdução a testes automatizados.
Ele contém **4 métodos principais**, cada um com testes que verificam seu funcionamento usando `assertTrue` e `assertFalse`.

---

## 📂 Estrutura do Projeto

```
src
 ├── main
 │    └── java
 │         └── br.edu.exemplo
 │               └── AppUtils.java        # Classe com os métodos
 └── test
      └── java
           └── br.edu.exemplo
                 └── AppUtilsTest.java   # Testes unitários
```

---

## 🛠 Métodos Implementados

| Método                                        | Descrição                                                  |
| --------------------------------------------- | ---------------------------------------------------------- |
| `ehNumeroPar(int n)`                          | Retorna `true` se o número for par, `false` caso contrário |
| `contemPalavra(String frase, String palavra)` | Verifica se a frase contém a palavra (case-insensitive)    |
| `loginValido(String usuario, String senha)`   | Simula um login simples                                    |
| `ehMaiorDeIdade(int idade)`                   | Retorna `true` se a idade for maior ou igual a 18          |

---

## 🧩 Exemplo de Uso

```java
boolean resultado = AppUtils.ehNumeroPar(10); // true
boolean login = AppUtils.loginValido("admin", "1234"); // true
```

---

## ✅ Testes Unitários

Os testes estão em `AppUtilsTest.java`. Cada método possui **validação positiva e negativa** usando `assertTrue` e `assertFalse`.

### Exemplo de Saída no Console

```
10 é par? true
7 é par? false
"Hoje tem aula de Java" contém "java"? true
"Hoje tem aula de Python" contém "java"? false
Login admin/1234 válido? true
Login user/senha válido? false
20 é maior de idade? true
15 é maior de idade? false

Process finished with exit code 0
```

No IntelliJ, os testes aparecem na aba de execução do **JUnit**:

```
AppUtilsTest
  ✔ testEhNumeroPar()
  ✔ testContemPalavra()
  ✔ testLoginValido()
  ✔ testEhMaiorDeIdade()
```

---

## ⚙️ Como Rodar

1. Abra o projeto no **IntelliJ IDEA**.
2. Certifique-se de que o projeto está configurado com **JUnit 5**.
3. Clique com o botão direito em `AppUtilsTest` → **Run 'AppUtilsTest'**.
4. Confira o console para ver os resultados.

> Você também pode rodar via terminal usando Maven:
>
> ```bash
> mvn test
> ```

---

## 💡 Observações

* Todos os testes estão passando (✔️ verde) com saída no console.
* O projeto é ideal para **iniciantes** entenderem como criar métodos, validar lógica e escrever testes automatizados.
* É um exemplo básico, mas pode ser expandido para **métodos mais complexos e testes adicionais**.

---

## 📝 Autor

Luccas Lohan Parrilla
Exercício acadêmico – Introdução a Testes Unitários com JUnit 5
