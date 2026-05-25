## Integrante

- Andrés Felipe Franco Mesa

## Objetivo

El objetivo de esta actividad fue crear un sistema sencillo de pedidos para una pizzería usando pilas manuales en Java.  
Con este trabajo se buscó entender cómo funcionan las pilas, las listas ligadas y el sistema Undo/Redo sin usar la librería Stack de Java.

## Funciones del programa

El programa permite:

- Registrar pizzas
- Deshacer pedidos
- Rehacer pedidos
- Mostrar el pedido actual

Cada pizza tiene:

- Nombre
- 3 ingredientes guardados en un arreglo fijo

## Explicación general

Se trabajó con dos pilas:

- Una pila principal donde se guardan los pedidos
- Una pila secundaria que guarda temporalmente los pedidos deshechos

Cuando se hace Undo, el pedido pasa de la pila principal a la secundaria.

Cuando se hace Redo, el pedido vuelve a la pila principal.

## Archivos del proyecto

- Main.java
- Pizza.java
- Nodo.java
- Pila.java
- GestionPedidos.java

## Video de sustentación

Link del video:

PEGAR_LINK_AQUI

## Repositorio GitHub

PEGAR_LINK_GITHUB_AQUI
