---
# 👨‍💼 Cadastro de Funcionários

<img width="1536" height="1024" alt="funcionario" src="https://github.com/user-attachments/assets/7970089e-ed58-45f4-b2c6-2238314e85eb" />

## 📖 Sobre o projeto

O Cadastro de Funcionários é uma aplicação desenvolvida em Java com o objetivo de praticar e consolidar conceitos fundamentais da linguagem por meio de um sistema simples de cadastro e análise de funcionários.

O programa recebe os dados de um funcionário, calcula seu bônus, classifica seu nível profissional e determina seu tempo de empresa.

---

## 📋 Funcionalidades

* Cadastro do nome do funcionário
* Cadastro da idade
* Cadastro do cargo
* Cadastro do salário
* Cadastro do ano de admissão
* Cálculo automático do bônus
* Classificação do funcionário por faixa salarial
* Classificação do tempo de empresa
* Exibição dos dados cadastrados

---

## 💰 Regras de Negócio

### Bônus

| Salário             | Bônus |
| ------------------- | ----: |
| Até R$ 2.000        |   20% |
| R$ 2.001 a R$ 5.000 |   10% |
| Acima de R$ 5.000   |    5% |

### Nível do funcionário

| Salário             | Nível  |
| ------------------- | ------ |
| Até R$ 2.000        | Júnior |
| R$ 2.001 a R$ 5.000 | Pleno  |
| Acima de R$ 5.000   | Sênior |

### Tempo de empresa

| Tempo           | Classificação |
| --------------- | ------------- |
| Menos de 2 anos | Novato        |
| De 2 a 5 anos   | Experiente    |
| Acima de 5 anos | Veterano      |

O ano atual é obtido automaticamente através da classe `Year` da API de datas do Java.

---

## 🛠 Tecnologias utilizadas

☕ Java 17

💻 IntelliJ IDEA

🔧 Git

🐙 GitHub

---

## 📚 Conceitos praticados

* Variáveis e tipos primitivos
* Entrada de dados com `Scanner`
* Saída de dados com `System.out`
* Estruturas condicionais `if`, `else if` e `else`
* Métodos
* Parâmetros e retorno de métodos
* Operadores matemáticos
* Cálculos com porcentagem
* Manipulação de `String`
* Classe `Year`
* Formatação de valores com `printf`
* Organização e reutilização de código

---

## 📂 Estrutura do projeto

```text
CadastroFuncionarios/
│
├── src/
│   └── CadastroFuncionarios.java
│
└── README.md
```

---

## ▶️ Como executar

1. Clone o repositório:

```bash
git clone URL_DO_REPOSITORIO
```

2. Abra o projeto no **IntelliJ IDEA**.

3. Execute a classe:

```text
CadastroFuncionarios.java
```

4. Informe os dados solicitados no terminal.

---

## 💻 Exemplo de execução

```text
===== CADASTRO DE FUNCIONÁRIO =====

Nome: Flavio
Idade: 25
Cargo: Desenvolvedor
Salário: R$ 4500
Ano de admissão: 2023

===== DADOS DO FUNCIONÁRIO =====
Nome: Flavio
Idade: 25
Cargo: Desenvolvedor
Salário: R$ 4500,00
Bônus: R$ 450,00
Nível: Pleno
Tempo de empresa: Experiente
```

---

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de **consolidar os fundamentos da linguagem Java**, principalmente entrada e saída de dados, estruturas condicionais, métodos, cálculos e organização do código.

O projeto faz parte da minha sequência de estudos e prática em **Java**, servindo como base para projetos futuros com **Programação Orientada a Objetos e Spring Boot**.

---

## 👨‍💻 Autor

**Flavio Alexandre Ribeiro**

Projeto desenvolvido para fins de estudo e prática em Java.
