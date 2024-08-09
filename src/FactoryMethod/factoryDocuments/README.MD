## Explicação

### Document
`Document` é a classe abstrata que define o comportamento genérico de um documento. Todos os documentos terão um método `open`.

### WordDocument e PDFDocument
São implementações concretas da classe `Document`. Cada uma implementa o método `open` de maneira específica para o tipo de documento.

### DocumentCreator
`DocumentCreator` é a classe abstrata que declara o método factory `createDocument`. O método `openDocument` é um método comum que utiliza o método factory para criar e abrir um documento.

### WordDocumentCreator e PDFDocumentCreator
São as subclasses concretas que implementam o método `createDocument` para criar uma instância específica de `WordDocument` ou `PDFDocument`.

### Main
No código principal, a classe `Main` decide qual criador concreto usar, e o método `openDocument` cria e abre o documento apropriado sem saber qual é a classe concreta do documento.

## Vantagens do Factory Method

- **Desacoplamento**: O código que usa os objetos criados não precisa conhecer a classe concreta dos objetos.
- **Extensibilidade**: Novos tipos de produtos podem ser facilmente introduzidos ao sistema, criando novas subclasses de `DocumentCreator` sem modificar o código existente.
- **Clareza**: O código é mais organizado e segue o princípio de responsabilidade única (SRP).

## Desvantagens

- **Complexidade**: Introduz classes adicionais, o que pode tornar o código mais complexo.
- **Subclasses**: Para cada novo tipo de produto, é necessário criar uma nova subclasse de `Creator`.

O Factory Method é um padrão poderoso para situações onde a criação de objetos precisa ser delegada a subclasses, promovendo flexibilidade e desacoplamento no código.
