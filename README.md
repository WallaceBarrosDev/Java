# JDBC (Java DataBase Connectivity)

> coneção com banco de dados em java

## Requisitos

1. definir um banco de dados. exemplo: mysql
2. criar um banco de dados e um tabela
3. baixa o driver jdbc do banco de dados

---

## passo a passo

1. importar driver jdbc do db para a passta libs
2. criar um arquivo de conecxão

### class de conexão

#### definir a url de acesso ao banco de dados, ela e formada por

1. especificação do driver
2. endpoint
3. porta de acesso
4. nome do banco de dados
    
URL = driver + "://" + endpont + ":" + port + "/" + table;
exemplo = jdbc:mysql://localhost:3006/users
    
#### definir as varivais de ambiente

1. nome de usuaro. exemplo: root
2. senha de acesso. 

#### criando uma conexão

1. criasse uma conexão com as informações dadas ate agora
conection = driver + "://" + endpont + ":" + port + "/" + table + "?user=" + user + "&password=" + password;
exemplo: jdbc:mysql://localhost:3006/users?user=meuUsuario&passowrd=minhasenha;

---

## Referencias 

[video explicando como se conecar ao DB usando JDBC](https://www.youtube.com/watch?v=70s7JsiaBRc)