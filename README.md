1. Escribe una clase llamada Deck, que representará el deck o conjunto de cartas de poker. 
2. Escribe una clase llamada Card, que representará una carta de poker. 
3. Deck deberá tener dos atributos de algún tipo definido en el Collection Framework. 
4. Card deberá tener tres atributos: 
	a. Palo: tréboles, corazones, picas o diamantes. 
	b. Color: rojo. 
	c. Valor: 2 al 10, A, J, Q o K.
5. En EL Deck se inicializarán las 52 cartas de poker y las almacenará en uno de los atributos del tipo de estructura de datos seleccionados del Collection Framwork. 
6. En Deck se implementarán cuatro métodos que harán lo siguiente: 
	a. shuffle: mezclar el deck. El método deberá imprimir en pantalla el siguiente mensaje: Se mezcló el Deck. 
	b. head: mostrará la primera carta del deck, la carta deberá removerse del deck. El método deberá imprimir en pantalla un mensaje con el siguiente formato: 
{Palo},{Color},{Valor}
Quedan {número de cartas en deck} 
	c. pick: seleccionador una carta al azar, la carta deberá removerse del deck. El método deberá imprimir en pantalla un mensaje con el siguiente formato: 
{Palo},{Color},{Valor}
Quedan {número de cartas en deck} 
	d. hand: regresará un arreglo de cinco cartas del deck, las cartas deberán removerse del deck. EL método deberá imprimir en pantalla un mensaje con el siguiente formato: 
{Palo},{Color},{Valor}
{Palo},{Color},{Valor}
{Palo},{Color},{Valor}
{Palo},{Color},{Valor}
{Palo},{Color},{Valor}
{Palo},{Color},{Valor}
Quedan {número de cartas en deck}
