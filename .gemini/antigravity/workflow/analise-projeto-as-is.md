# Workflow: Geração de Material de Estudo (As-Is)

## Objetivo
Este workflow instrui o assistente de IA a investigar pacotes ou diretórios específicos de um projeto e gerar um material de consulta didático sobre o funcionamento **atual** (As-Is) do código, sem sugerir ou aplicar refatorações.

## Quando usar
Use este comando (`/analise-projeto-as-is`) quando você estiver assumindo um novo projeto, uma nova feature ou preparando-se para refatorar código legado e precisa entender "o que o código faz" e "como as classes se relacionam hoje".

## Parâmetros de Entrada
Ao invocar este workflow, o usuário deve (idealmente) fornecer os pacotes ou diretórios que deseja analisar.
- **Exemplo de uso:** `/analise-projeto-as-is analise o pacote src/main/java/minha_feature e inclua mapeamento de dependências externas.`

---

## Instruções para o Assistente (AI Instructions)

Quando este workflow for acionado, siga **rigorosamente** os passos abaixo:

### Passo 1: Descoberta e Leitura (Discovery)
1. Utilize suas ferramentas de exploração (`list_dir`, `view_file`, `grep_search`) para listar e ler todos os arquivos contidos nos pacotes informados pelo usuário.
2. Identifique os atores principais: Entidades, Serviços, Factories, Estratégias, etc.
3. **Importante:** Não altere nenhum arquivo, não crie testes e não proponha refatorações de arquitetura. O foco é apenas entender o código.

### Passo 2: Verificação de Dependências Externas (Opcional)
1. Avalie o prompt do usuário para determinar se ele solicitou a inclusão do mapeamento de dependências externas (ex: Banco de Dados, APIs, Mensageria/Kafka).
2. Se o usuário **não pedir explicitamente**, ignore os arquivos de configuração e anotações de infraestrutura, focando apenas no Domínio/Business.
3. Se o usuário pedir, inclua como essas dependências interagem com as classes centrais do pacote analisado.

### Passo 3: Geração do Material (Estrutura do Documento)
Gere a resposta para o usuário (ou crie um artefato `.md` como `material_de_estudo_as_is.md`) sempre em **Português**. O documento deve possuir a seguinte estrutura:

#### 1. Regra de Negócio (O que a aplicação faz?)
- Descreva o fluxo de negócio com uma linguagem clara e funcional (pensando no negócio, não nos *ifs* e *fors*).
- Explique o papel das entidades principais no fluxo.
- Destaque as regras mais críticas encontradas no código lido (ex: regras de cálculo, condições de parada, validações).

#### 2. Mapeamento Técnico (Como funciona hoje?)
- Gere um **Diagrama de Classes usando sintaxe Mermaid**.
- **Regra Absoluta para o Mermaid:** O diagrama deve usar **EXATAMENTE os mesmos nomes** para as Classes, Interfaces, Métodos e Atributos originais do código, não importa quão ruins ou fora de padrão eles estejam. Isso é fundamental para manter o mapeamento fiel ao que está no repositório.

#### 3. Pontos de Atenção (Opcional)
- Liste brevemente características da arquitetura atual (ex: acoplamento elevado, magic numbers, classes anêmicas), **apenas apontando o estado atual**, sem começar a refatorar.
