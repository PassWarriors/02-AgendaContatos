# 📇 Projeto 02: PassGuardian - Agenda de Contatos


**Projeto 02: Agenda de contatos feita a partir da versão V5.0.0 do projeto de Agenda de Contatos, cuja é feita durante as aulas de POO**

**Essa projeto não necessariamente é o final, apenas um teste de tentar estruturar o projeto. Interfaces e elementos representam apenas experimentos**


NOTA: O projeto vai tentar seguir as aulas de POO, atualizando formatos e sua estrutura de forma a ficar coerente e mais adequada para funcionar melhor

---

## 🎯 Objetivo

Construir um sistema completo de CRUD (Create, Read, Update, Delete) para contatos, aplicando na prática a evolução dos conceitos de POO, separação de responsabilidades e persistência em arquivos.

---

## 🚀 Funcionalidades

- **Gerenciamento Completo (CRUD):** Cadastrar, listar, pesquisar, atualizar e remover contatos.
- **Persistência Automática:** Salva a lista em um arquivo de texto (`contatos.txt`) e recupera os dados de forma transparente ao iniciar o sistema.
- **Tratamento de Falhas:** Tratamento de exceções estruturado para garantir que erros de gravação não quebrem a execução do programa.
- **Sobre o Sistema:** Tela informativa com detalhes do software.

### 📝 Estrutura de um Contato
Cada registro armazena estritamente:
* `Nome`
* `Celular`
* `E-mail`

---

## 🛠️ Tecnologias e Conceitos

### Stack Técnica
* **Linguagem:** Java
* **Coleções:** Collections Framework (`List` e `ArrayList`)
* **Versionamento:** Git & GitHub


## 💾 Detalhes da Versão Atual (`V3.0.0`) - Atualização JFrame
Adicionado suporte para janelas individuais e abandonado o terminal.

ESSA VERSÃO NÃO FOI ADEQUADAMENTE TESTADA!

### Erros/detalhes chatos conhecidos:
- Janela sem ícone / cores oficiais.
- É possível criar várias janelas de adicionar contato.
- Falta `ALTERAR`, `PESQUISAR`
- Organização melhor do código e separação de funções.
- Corrigir detalhes para melhorar a interação com o programa.

ESSES DETALHES DEVEM SER REVISADOS E ABORDADOS NAS PRÓXIMAS ATUALIZAÇÕES



---

## ⏳ Histórico de Evolução


| Versão | Fase | Principais Implementações |
| :---: | :--- | :--- |
| **V1.0.0** | Anterior | DAO totalmente orientado a objetos (métodos de instância e construtores). |
| **V1.1.0** | Anterior | Adicionado controle de dados e melhorar busca. |
| **V2.0.0** | Anterior | Adicionado o modelo MVC básico, irá ser melhorado. |
| **V2.1.0** | Anterior | Colocado o programa principal dentro da classe `AgendaView` e impedir inputs vazios. |
| **V3.0.0** | Atual | Adicionado duas classes JFrame para mostrar a `TelaPrincipal` e a telinha `TelaAdicionarContatos` que basicamente fazem a mesma coisa do `AgendaView`, que agora não existe mais. Nessa atualização só tem `ADICIONAR` e `EXCLUIR`. Certifique-se de salvar sua agenda usando o botão `Salvar Contatos`.
---

## 🔧 Como Executar o Projeto

1. Certifique-se de ter o **Java JDK** (versão 8 ou superior) instalado em sua máquina.
2. Clone este repositório ou baixe os arquivos de código.
3. Abra a pasta raiz do projeto na sua IDE de preferência (Eclipse, IntelliJ, VS Code, NetBeans).
4. Navegue até o arquivo `02-AgendaContatos/src/br/edu/principal/Principal.java`.
5. Execute o método `main`.
6. Interaja com o sistema através do menu interativo no console/terminal.

---
<div align="center">

## 💲🪙💲**`let's go gambling`**!💲🪙💲

<img src="resources/images/image-1.png" alt="apostas são monocromáticas" width="120" height="80"/>
<img src="resources/images/image-3.png" alt="lets go gambling" width="170" height="150" />
<img src="resources/images/image-2.png" alt="benda" width="120" height="80" />

### ⬆️`OH DANG IT!`⬆️

</div>
