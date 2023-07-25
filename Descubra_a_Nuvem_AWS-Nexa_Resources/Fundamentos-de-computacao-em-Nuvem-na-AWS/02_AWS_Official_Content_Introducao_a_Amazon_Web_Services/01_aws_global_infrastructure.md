# AWS Global Infrastructure (AWS Official Content)

**Descrição:** Veja a importância de conhecer os conceitos à respeito da Infraestrutura Global AWS, entendendo como esse tópico é crucial para entender e como criar e usar os serviços AWS.

Entender a infraestrutura global da AWS é crucial para entender como se conectar, criar, compilar e implantar suas arquiteturas e usar os serviços na AWS Cloud.

**Infraestrutura global da AWS:** zonas de disponibilidade, regiões e locais de borda da AWS, as vezes chamadas de AZs.

# => Se preparando
Quando estiver se preparando vários aspectos devem ser considerados.

O primeiro e entender a relação entre esses itens.
Ao analisar os três componentes de infraestrutura em conjuntos.

## Algumas questões a se considerar:

- Como eles se encaixam no contexto da sua arquitetura?
- Como eles funcionam individualmente e em conjunto?
- Quais são as minhas opções?
- Como determinar quando os serviços devem usar uma AZ, Região ou local de borda? 

## Em seguida, analisar cada um dos componentes separados.
- ### **AZs**(zonas de disponibilidade)

  - Nas AZs, estude quais serviços são limitados por fronteiras e como as AZs podem ajudar a criar um ambiente altamente disponível.
  - Observar como as AZs se comportam  quando se está determinando ponto de falhas nas arquiteturas, e como é feita a comunicação ao ir de uma AZ para outra, isso é diferente em cada serviço, então é preciso saber quais serviços lidam especialmente com AZs e como eles se conectam e se comunicam com as AZs.

- ### **Regiões**

  - **Região AWS:** locais físicos ao redor do mundo onde a AWS mantém clusters de data centers.
  - Analisar os mesmos itens que nas AZs, e procurar maneiras de usar regiões na recuperação de desastres e na continuidade de negócios.
  - O que pode ser feito para evitar falhas catastróficas e quais serviços ajudam a usar as suas regiões.
  - Entender quando usar diferentes regiões e quais são os benefícios de usar uma região específica, ou usar várias regiões.
  - Analisar como o uso da região afeta requisitos de conformidade.

Com frequência, o gerenciamento de dados é determinado por fronteiras soberanas. É importante saber como essas leis e requisitos afetarão o uso da AWS Cloud.

- ### **Locais de borda**
  - **Locais de borda da AWS:** endpoints que veiculam conteúdo armazenado em cache e dão acesso a serviço da AWS.
  - Analisar quais serviços aproveitam locais de borda e qual é a diferença de uso nesses serviços.
  - Pode escolher quais locais da borda usar?
  - Como os locais de borda são usados no Amazon Cloud Front?
  - E no AWS Global Accelerator?
  - Os locais de borda são usados apenas nesses serviços? ou eles são usados em outros momentos?
  - Quais benefícios são fornecidos pelos locais de borda e qual nível de gerenciamento pode ser imposto?

Zonas de disponibilidade, regiões e locais de borda são componentes crucias para entender e usar a AWS.
