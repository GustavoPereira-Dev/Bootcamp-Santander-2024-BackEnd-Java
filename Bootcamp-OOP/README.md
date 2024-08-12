 # Projeto Bootcamp OOP
 
- Esse projeto repositório conta com a abstração de um pequeno sistema de um site de Bootcamps ou cursos (como o caso da DIO) para o paradigma de programação orientada a objetos em Java, contendo as classes:
  - Bootcamp (classe principal que é utilizada para coletar propriedades como os participantes do Bootcamp, conteúdos, etc.)
  - Conteudo (classe que é pai de várias outras e que cuida da base de um conteúdo do Bootcamp)
  - Curso (classe filha de conteúdo que é abstração dos vídeos de cursos em vídeos vistos comumente na plataforma)
  - Desafio (classe filha de conteúdo e pai de outros "Desafios" que é abstração dos Desafios, sejam eles em códigos ou em projetos vistos comumente na plataforma)
    - DesafioCodigo (classe filha de Desafio que é a abstração dos desafios de códigos vistos comumente na plataforma)
    - DesafioProjeto (classe filha de Desafio que é a abstração dos desafios de projetos, como no caso desse repo, vistos comumente na plataforma)
   - Dev (classe do desenvolvedor, ou o participante do Bootcamp)
   - Mentoria (classe filha de conteúdo que é abstração das mentorias de um vídeo longo rotineiramente liberadas no Bootcamp)
   - Main(classe main do projeto)
- Para utilizá-la é necessário criar uma lista de objetos dos conteúdos como o "Curso", "Mentoria", "DesafioCodigo" e "DesafioProjeto" e acrescentá-las em um objeto de um Bootcamp. Após isso, pode se criar os participantes e adicioná-los nos Bootcamps (após a inscrição é possível utilizar a ação "progredir" para o dev avançar nos conteúdos e também a listagem de conteúdos inscritos e concluídos do usuário e total de XP adquirido pelo mesmo)
- Exemplos de execução

> Conteúdos Inscritos Camila:[Curso{titulo='curso java', descricao='descrição curso java', cargaHoraria=8}, Curso{titulo='curso js', descricao='descrição curso js', cargaHoraria=4}, Mentoria{titulo='mentoria de java', descricao='descrição mentoria java', data=2024-08-12}, br.com.dio.desafio.dominio.DesafioCodigo@7adf9f5f, br.com.dio.desafio.dominio.DesafioProjeto@85ede7b]

> Conteúdos Inscritos Camila:[br.com.dio.desafio.dominio.DesafioCodigo@7adf9f5f, br.com.dio.desafio.dominio.DesafioProjeto@85ede7b]
Conteúdos Concluídos Camila:[Curso{titulo='curso java', descricao='descrição curso java', cargaHoraria=8}, Curso{titulo='curso js', descricao='descrição curso js', cargaHoraria=4}, Mentoria{titulo='mentoria de java', descricao='descrição mentoria java', data=2024-08-12}]

> XP:150.0

> Conteúdos Inscritos João:[Curso{titulo='curso java', descricao='descrição curso java', cargaHoraria=8}, Curso{titulo='curso js', descricao='descrição curso js', cargaHoraria=4}, Mentoria{titulo='mentoria de java', descricao='descrição mentoria java', data=2024-08-12}, br.com.dio.desafio.dominio.DesafioCodigo@7adf9f5f, br.com.dio.desafio.dominio.DesafioProjeto@85ede7b]

> Conteúdos Inscritos João:[]
Conteúdos Concluidos João:[Curso{titulo='curso java', descricao='descrição curso java', cargaHoraria=8}, Curso{titulo='curso js', descricao='descrição curso js', cargaHoraria=4}, Mentoria{titulo='mentoria de java', descricao='descrição mentoria java', data=2024-08-12}, br.com.dio.desafio.dominio.DesafioCodigo@7adf9f5f, br.com.dio.desafio.dominio.DesafioProjeto@85ede7b]
XP:150.0
