# Source Code ☕

Pasta que contém o código-fonte Java do projeto 02:  **Agenda De Contatos PassGuardian**.

---

## 📂 Arquitetura do Projeto

O código está organizado em camadas dentro do diretório `src/br/edu/`:

```text
02-AgendaContatos/       # Pasta atual do projeto
├── src/
│   └── br/edu/
│       ├── principal/   # Inicialização do sistema (Principal.java)
│       ├── modelo/      # Classe de domínio (Contato.java)
│       ├── servico/     # Regras de negócio e operações (Agenda.java)
│       ├── dao/         # Persistência de dados (ContatoDAO.java)
│       └── uteis/       # Funções auxiliares (Uteis.java)
├── contatos.txt         # Base de dados (gerada automaticamente)
```

### 🧩 Divisão de Responsabilidades

| Classe | Camada / Papel | Responsabilidade Principal |
| :--- | :--- | :--- |
| `Principal` | Controle / Visão | Coordena o fluxo do menu e execução do programa. |
| `Contato` | Modelo (`Domain`) | Modela a entidade de contato e seus atributos. |
| `Agenda` | Serviço (`Business`) | Centraliza as regras de negócio e a lógica do CRUD. |
| `ContatoDAO`| Dados (`Data/DAO`) | Gerencia a leitura e escrita no arquivo físico. |
| `Uteis` | Utilitários | Fornece funções de suporte reutilizáveis. |

---