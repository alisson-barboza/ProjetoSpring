### ProjetoSpring 

Sistema desenvolvido em Spring para realizar um CRUD de aluno e matéria e permitir a junção (matrícula) dos mesmos.

COMO EXECUTAR : Realizar a compilação através de uma IDE, e realizar as requisições via POSTMAN para as URL's específicas de cada controller O projeto possui atualmente 3 componentes para receber requisições.

1 - AlunoController (/aluno)<p>
  <p>1.1 - /listar - Listar todos os alunos já cadastrados no banco\n
  <p>1.2 - /buscar/{nome} - Resquisição via PathVariable para consultar um aluno a partir do seu nome
  <p>1.3 - /inserir - Requisição via JSON - RequestBody que irá receber um aluno para ser salvo no banco
  <p>1.4 - /alterar - Requisição via JSON - RequestBody que irá receber um aluno para ser alterado no banco
  <p>1.5 - /remover/{nome} - Requisição via PathVariable para remover um aluno do banco a partir do seu nome
  
2 - MateriaController (/materia)
  <p>2.1 - /listar - Listar todas as matérias já cadastradas no banco
  <p>2.2 - /buscar/{nome} - Requisição via PathVariable para consultar a Materia a partir do seu nome
  <p>2.3 - /inserir - Requisição via JSON - RequestBody que irá receber uma matéria para ser salva no banco
  <p>2.4 - /alterar - Requisição via JSON - RequestBody que irá receber uma matéria para ser alterada no banco
  <p>2.5 - /remover/{nome} - Requisição via PathVariable para remover uma materia do banco a partir do seu nome (caso não exista nenhum aluno matriculado na mesma)</p>
  
3 - MatricularController
  <p>3.1 /matricular - Requisição via JSON - RequestBody que irá receber um DTO contendo o aluno e a lista de cadeiras nas quais o aluno será matriculado</p>
  
  
  Banco de dados - O Application properties e o POM.xml estão configurados para usar o MYSQL. Além disso, o banco está configurado para gerar as tabelas ao início da aplicação (create)
