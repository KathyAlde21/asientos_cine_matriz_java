**_<h1 align="center">:vulcan_salute: Asientos Sala de Cine :computer:</h1>_**

**<h3>:blue_book: Contexto:</h3>**

<p>Un teatro registra la ocupación de sus asientos en una función especial mediante una matriz de 4x4, donde cada celda representa un asiento y su valor corresponde al precio pagado por el espectador que lo ocupó. La administración quiere hacer un análisis por zona, considerando tres áreas específicas: la diagonal principal, la zona superior (asientos por encima de esta diagonal) y la zona inferior (asientos por debajo).</p>
<p>Este ejercicio permitirá reforzar la comprensión y manipulación de matrices, así como el uso de condiciones para recorrer y filtrar elementos específicos según su posición.</p>

**<h3>:orange_book: Objetivo:</h3>**

<p>Diseñar un algoritmo que, dada una matriz de 4x4 con valores que representan los precios de asientos vendidos, realice un análisis por zonas: diagonal principal, zona superior y zona inferior. Además, debe comparar la suma de las zonas superior e inferior con la diagonal principal e indicar si dicha suma es menor.</p>

**<h3>:green_book: Instrucciones:</h3>**

1. Declarar una matriz de tamaño 4x4. Los valores pueden:
- Ingresarse manualmente por el usuario, o asignarse directamente en el código para facilitar la prueba.

2. Recorrer la matriz para:
- Calcular la suma de los valores en la diagonal principal (cuando fila = columna).
- Calcular la suma de la zona superior (cuando columna > fila).
- Calcular la suma de la zona inferior (cuando fila > columna).

3. Al finalizar, mostrar:
- El valor total de cada una de las tres zonas.
- Un mensaje indicando si la suma de la zona superior e inferior es menor que la diagonal principal, o si no se cumple la condición.

<img src="./assets/img/tabla_asientos_cine.png" alt="" style="width: 80%;">
