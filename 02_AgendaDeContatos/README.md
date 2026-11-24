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
│       ├── controle/    # Trabalha com lógica (AgendaController.java)
│       ├── modelo/      # Classe de domínio (Contato.java)
│       ├── servico/     # Regras de negócio e operações (Agenda.java)
│       ├── dao/         # Persistência de dados (ContatoDAO.java)
│       └── Telas/       # Interface com JFrames (TelaPrincipal e TelaAdicionarContato)
└── contatos.txt         # Base de dados (gerada automaticamente)
```

### 🧩 Divisão de Responsabilidades
| Classe | Responsabilidade Principal |
| :--- | :--- |
| `Principal` | Instancia os módulos do programa e `inicializa`. |
| `Contato` | Modela a entidade de `contato` e seus atributos. |
| `Agenda` | Centraliza as regras de negócio e a lógica do `CRUD`. |
| `ContatoDAO`| Gerencia a `leitura` e `escrita` no arquivo físico. |
| `AgendaController`| Gerencia a `lógica interna` do programa. |
| `TelaPrincipal`| `Tela` onde fica todos os dados, como os contatos e botão de adicionar, que chama a tela `TelaAdicionarContato`. Também foi adicionado um botão para `SalvarContato`|
| `TelaAdicionarContato` | `Tela` onde o usuário digita `nome`, `celular` e `email` de um contato que não seja vazio em nenhum campo!|
---

1 minuto de silêncio para a classe AgendaView e tudo o que ela fez