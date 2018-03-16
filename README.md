# Spring Jax (WS/RS) Com Mongo

Interface com dois barramentos de WebService REST e WSDL(SOAP) para listagem da mesma fonte de dados.
  - https://spring.io
  - https://projects.spring.io/spring-boot
  - https://www.mongodb.com
  - https://mlab.com/


# Sobre o Projeto

Feito um REST e um WBS-SOAP usando Jax WS/RS para listar pessoa e hobbie.

# MongoDB

Para o MongoDB, preferi não hospedar um servidor local, acabei usando da mLab mesmo.

# Demo

https://spring-jax-mongo.herokuapp.com/

### Endpoints REST (Spring REST)

`GET`

https://spring-jax-mongo.herokuapp.com/pessoa

https://spring-jax-mongo.herokuapp.com/hobbie

![](https://i.imgur.com/HVjyIpi.png)
![](https://i.imgur.com/tlg6ngu.png)

### Endpoints WBS-SOAP (JAX-WS)

`GET`

https://spring-jax-mongo.herokuapp.com/WBS/PessoaWBS?WSDL

https://spring-jax-mongo.herokuapp.com/WBS/HobbieWBS?WSDL

![](https://i.imgur.com/PP6mATF.png)
![](https://i.imgur.com/dpnu7qm.png)

#

# ~ by matheusluciox@gmail.com