#language:pt
@all @search
Funcionalidade: Busca por produtos
  Como um visitante
  Eu gostaria de realizar uma busca
  A fim de visualizar os itens que eu estou buscando

@doing
Cenário: Carregamento da seção de Header
  Dado que eu acesso a pagina principal
  Quando eu realizo uma busca por "Printed Chiffon Dress"
  Então eu devo visualizar que seção de heading do search está sendo exibida