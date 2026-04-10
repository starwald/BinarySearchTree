# Binary Search Tree Dictionary (Francés → Español)

## Descripción

Este proyecto implementa un diccionario Francés–Español utilizando un **Árbol Binario de Búsqueda (BST)**.

El programa:

* Lee un archivo con asociaciones de palabras (francés → español)
* Construye un BST ordenado por la palabra en francés
* Permite buscar traducciones de forma eficiente
* Traduce un texto completo palabra por palabra

---

## Objetivos del proyecto

* Implementar un **Binary Search Tree (BST)**
* Aplicar BST como estructura tipo **Map**
* Practicar búsqueda e inserción eficiente
* Analizar rendimiento mediante profiling

---

## Estructura del proyecto

```
BinarySearchTree/
│
├── diccionario.txt
├── texto.txt
│
├── src/
│   ├── main/java/bst/
│   │   ├── Association.java
│   │   ├── BinaryTree.java
│   │   ├── Node.java
│   │   ├── DictionaryLoader.java
│   │   ├── Translator.java
│   │   ├── Profiler.java
│   │   └── Main.java
│   │
│   └── test/java/bst/
│       ├── AssociationTest.java
│       └── BinaryTreeTest.java
│
├── classes/
└── README.md
```

---

## Cómo ejecutar

### 1. Compilar el proyecto

```
javac -d classes src/main/java/bst/*.java
```

### 2. Ejecutar el programa

```
java -cp classes bst.Main
```

---

## Archivos de entrada

### `diccionario.txt`

Debe contener asociaciones en el formato:

```
(oui, si)
(maison, casa)
(devoirs, tarea)
(femme, mujer)
(chien, perro)
(ville, pueblo)
```

---

### `texto.txt`

Ejemplo:

```
La femme me a demandé de faire mes devoirs sur ma ville.
```

---

## Ejemplo de salida

```
*La* mujer *me* *a* *demandé* *de* *faire* *mes* tarea *sur* *ma* pueblo.
```

---

## Pruebas unitarias

Se implementaron pruebas con **JUnit 4** para:

* Inserción en el BST
* Búsqueda de elementos existentes
* Búsqueda de elementos inexistentes

---

## Profiling

Se midió el tiempo de ejecución de:

* Inserción de múltiples elementos
* Búsqueda en el árbol

### Complejidad:

* Inserción: O(log n) promedio, O(n) peor caso
* Búsqueda: O(log n) promedio, O(n) peor caso

---

## Consideraciones importantes

* La búsqueda es **case-insensitive**
* Palabras no encontradas se muestran entre asteriscos:

  ```
  *palabra*
  ```
* El BST se ordena por la palabra en francés

---

## Referencias

* Java Structures, Capítulo 12
* https://www.geeksforgeeks.org/binary-search-tree/

---

## Autor

Santiago Maldonado

---
