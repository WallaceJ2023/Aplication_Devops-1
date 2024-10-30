# SmartCities - Projeto de Testes Automatizados

## Introdução

Este repositório contém o projeto de testes automatizados do sistema **SmartCities**, desenvolvido durante o módulo de **Testes Automatizados**. O objetivo é validar as funcionalidades críticas do sistema utilizando **BDD (Behavior Driven Development)** com Gherkin e automação de testes para APIs.

> **Atenção:**
>
> - Verifique se o arquivo enviado está correto. Não será possível substituir o arquivo após a entrega na plataforma ou a correção do professor.
> - Não deixe para enviar sua atividade nos últimos minutos do prazo para evitar possíveis problemas técnicos.
> - Não compartilhe sua atividade em grupos de WhatsApp, Discord ou Teams, pois isso pode gerar plágio e anular a atividade de todos os envolvidos.
> - Você tem até 15 dias após a publicação da nota para solicitar revisão da correção.

## Objetivo

O desafio visa integrar técnicas de automação de testes no projeto **SmartCities**, desenvolvido em **Java Spring** ou **C#**, para garantir a qualidade da aplicação por meio de testes automatizados. O projeto deve conter testes de API e cenários de teste utilizando **BDD com Gherkin**.

## Requisitos

### 1. Cenários de Teste BDD
- Escrever no mínimo **3 cenários de teste** usando **Gherkin** para validar as principais funcionalidades da aplicação.
- Cobrir cenários positivos (caminhos felizes) e negativos (falhas).

### 2. Testes de API
- Implementar testes automatizados para todas as APIs do projeto, garantindo:
  - **Validação do status code** (códigos de resposta HTTP corretos).
  - **Validação do corpo de resposta** (estrutura e dados do JSON).
  - **Testes de contrato** utilizando **JSON Schema**.

### 3. Execução dos Testes
- Os testes devem ser fáceis de executar localmente ou integrados em um pipeline de **CI/CD** (Integração Contínua) utilizando ferramentas como **Azure DevOps**, **GitHub Actions**, ou **Jenkins**.

## Ferramentas Sugeridas
- Para projetos em **C#**, pode-se utilizar o **Cucumber** (Java) ou **SpecFlow** (C#), embora o uso de SpecFlow não seja obrigatório.


```bash
git clone https://github.com/seu-usuario/smartcities-teste-automatizado.git
cd smartcities-teste-automatizado
mvn test

